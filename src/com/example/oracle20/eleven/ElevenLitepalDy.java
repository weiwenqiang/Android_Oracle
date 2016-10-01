package com.example.oracle20.eleven;

import java.util.List;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ElevenLitepalDy extends Activity implements OnClickListener {
	Button insert, update, select, delete, create;
	EditText sid, name, age;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eleven_litepaldy);
		insert = (Button) findViewById(R.id.eleven_insertdy);
		update = (Button) findViewById(R.id.eleven_updatedy);
		select = (Button) findViewById(R.id.eleven_selectdy);
		delete = (Button) findViewById(R.id.eleven_deletedy);
		create = (Button) findViewById(R.id.eleven_createdy);
		insert.setOnClickListener(this);
		update.setOnClickListener(this);
		select.setOnClickListener(this);
		delete.setOnClickListener(this);
		create.setOnClickListener(this);
		sid = (EditText) findViewById(R.id.eleven_sid);
		name = (EditText) findViewById(R.id.eleven_name);
		age = (EditText) findViewById(R.id.eleven_age);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.eleven_insertdy:
			insertDB();
			break;
		case R.id.eleven_updatedy:
			updateDB();
			break;
		case R.id.eleven_selectdy:
			selectDB();
			break;
		case R.id.eleven_deletedy:
			deleteDB();
			break;
		case R.id.eleven_createdy:
			createDB();
			break;
		default:
			break;
		}
	}

	private void createDB() {
		Connector.getDatabase();
		Toast.makeText(this, "数据库创建成功", 0).show();
	}

	private void insertDB() {
		ElevenPerson person = new ElevenPerson(Integer.valueOf(sid.getText()
				.toString()), name.getText().toString(), Integer.valueOf(age
				.getText().toString()));
		if (person.save()) {
			Toast.makeText(this, "数据添加成功", 0).show();
		} else {
			Toast.makeText(this, "数据添加失败", 0).show();
		}
	}

	private void updateDB() {
		ContentValues values = new ContentValues();
		values.put("name", name.getText().toString());
		values.put("age", Integer.valueOf(age.getText().toString()));
		DataSupport.update(ElevenPerson.class, values,
				Integer.valueOf(age.getText().toString()));
		Toast.makeText(this, "数据修改成功", 0).show();
	}

	private void selectDB() {
		List<ElevenPerson> personList = DataSupport.select("name", "age")
				.where("age = ?", age.getText().toString()).order("age desc")
				.limit(10).find(ElevenPerson.class);
		Toast.makeText(this, "查询到的数据是：" + personList.toString(), 0).show();
	}

	private void deleteDB() {
		DataSupport.deleteAll(ElevenPerson.class, "id = ?", sid.getText()
				.toString());
		Toast.makeText(this, "数据删除成功", 0).show();
	}
}
