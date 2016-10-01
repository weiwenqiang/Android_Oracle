package com.example.oracle19.ten;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TenSQLdy extends Activity implements OnClickListener {
	Button insert, update, select, delete;
	EditText sid, name, age;
	TenStudentDAO sd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ten_dbcrud);
		insert = (Button) findViewById(R.id.ten_insert);
		update = (Button) findViewById(R.id.ten_update);
		select = (Button) findViewById(R.id.ten_select);
		delete = (Button) findViewById(R.id.ten_delete);
		insert.setOnClickListener(this);
		update.setOnClickListener(this);
		select.setOnClickListener(this);
		delete.setOnClickListener(this);
		sid = (EditText) findViewById(R.id.ten_sid);
		name = (EditText) findViewById(R.id.ten_name);
		age = (EditText) findViewById(R.id.ten_age);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ten_insert:
			insertDB();
			break;
		case R.id.ten_update:
			updateDB();
			break;
		case R.id.ten_select:
			selectDB();
			break;
		case R.id.ten_delete:
			deleteDB();
			break;
		default:
			break;
		}
	}

	private void insertDB() {
		TenStudent stu = new TenStudent();
		stu.setSid(Integer.valueOf(sid.getText().toString()));
		stu.setName(name.getText().toString());
		stu.setAge(Integer.valueOf(age.getText().toString()));
		sd = new TenStudentDAO(TenSQLdy.this);
		sd.insert(stu);
		Toast.makeText(this, "数据添加成功", 0).show();
	}

	private void updateDB() {
		TenStudent stu = new TenStudent();
		stu.setSid(Integer.valueOf(sid.getText().toString()));
		stu.setName(name.getText().toString());
		stu.setAge(Integer.valueOf(age.getText().toString()));
		sd = new TenStudentDAO(TenSQLdy.this);
		Toast.makeText(this, "数据修改成功", 0).show();
	}

	private void selectDB() {
		sd = new TenStudentDAO(TenSQLdy.this);
		TenStudent stu = sd.select(Integer.valueOf(sid.getText().toString()));
		Log.i("TAG", stu.toString());
		Toast.makeText(this, stu.toString(), 0).show();
	}

	private void deleteDB() {
		sd = new TenStudentDAO(TenSQLdy.this);
		sd.delete(Integer.valueOf(sid.getText().toString()));
		Toast.makeText(this, "数据删除成功", 0).show();
	}
}
