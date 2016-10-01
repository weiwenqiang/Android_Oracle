package com.example.oracle15.seven;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SevenSaveRead extends Activity implements OnClickListener {

	EditText sid, name, age;
	Button save, read;
	SharedPreferences shared;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seven_dynamicsaveread);
		sid = (EditText) findViewById(R.id.seven_sid);
		name = (EditText) findViewById(R.id.seven_name);
		age = (EditText) findViewById(R.id.seven_age);

		save = (Button) findViewById(R.id.seven_dysave);
		read = (Button) findViewById(R.id.seven_dyread);
		save.setOnClickListener(this);
		read.setOnClickListener(this);
		
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.seven_dysave:
			save();
			break;
		case R.id.seven_dyread:
			read();
			break;
		default:
			break;
		}
	}
	private void save(){
		shared = getSharedPreferences("shared", MODE_PRIVATE);
		SharedPreferences.Editor editor = shared.edit();
		editor.putInt("sid", Integer.valueOf(sid.getText().toString()));
		editor.putString("name", name.getText().toString());
		editor.putInt("age", Integer.valueOf(age.getText().toString()));
		editor.commit();
		Toast.makeText(this,"数据保存成功", 0).show();
	}
	private void read(){
		shared = getSharedPreferences("shared", MODE_PRIVATE);
		int sid = shared.getInt("sid", 3);
		String name = shared.getString("name", "为空默认值");
		int age = shared.getInt("age", 5);
		Toast.makeText(this, "ID:"+sid+"  姓名:"+name+"  年龄:"+age, 0).show();
	}
}
