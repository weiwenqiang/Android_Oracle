package com.example.oracle17.nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NineSDCardDy extends Activity implements OnClickListener {
	EditText sid, name, age;
	Button save, read;
	SharedPreferences shared;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nine_dynamicsaveread);
		sid = (EditText) findViewById(R.id.nine_sid);
		name = (EditText) findViewById(R.id.nine_name);
		age = (EditText) findViewById(R.id.nine_age);

		save = (Button) findViewById(R.id.nine_dysave);
		read = (Button) findViewById(R.id.nine_dyread);
		save.setOnClickListener(this);
		read.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.nine_dysave:
			save();
			break;
		case R.id.nine_dyread:
			read();
			break;
		default:
			break;
		}
	}

	private void save() {
		String state =Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			File sdFile = Environment.getExternalStorageDirectory();
			String filePath = sdFile.getAbsolutePath();
			String msg = "ID:" + sid.getText().toString() + "  姓名："
					+ name.getText().toString() + "  年龄："
					+ age.getText().toString();
			try {
				FileWriter fw = new FileWriter(filePath + "/person.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(msg);
				bw.flush();
				bw.close();
				fw.close();
				Toast.makeText(this, "数据保存成功", 0).show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void read() {
		String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			File sdFile = Environment.getExternalStorageDirectory();
			String filePath = sdFile.getAbsolutePath();
			FileReader fr;
			try {
				fr = new FileReader(filePath + "/person.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					Toast.makeText(this, line, 0).show();
				}
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
