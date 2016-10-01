package com.example.oracle16.eight;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EightFileDyIO extends Activity implements OnClickListener {
	EditText sid, name, age;
	Button save, read;
	SharedPreferences shared;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eight_dynamicsaveread);
		sid = (EditText) findViewById(R.id.eight_sid);
		name = (EditText) findViewById(R.id.eight_name);
		age = (EditText) findViewById(R.id.eight_age);

		save = (Button) findViewById(R.id.eight_dysave);
		read = (Button) findViewById(R.id.eight_dyread);
		save.setOnClickListener(this);
		read.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.eight_dysave:
			save();
			break;
		case R.id.eight_dyread:
			read();
			break;
		default:
			break;
		}
	}

	private void save() {
		OutputStream out;
		try {
			out = this.openFileOutput("person", MODE_PRIVATE);
			String str = "ID:" + sid.getText().toString() + "  姓名："
					+ name.getText().toString() + "  年龄："
					+ age.getText().toString();
			out.write(str.getBytes());
			out.flush();
			out.close();
			Toast.makeText(this, "数据保存成功", 0).show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void read() {
		InputStream in;
		try {
			in = this.openFileInput("person");
			int len;
			byte[] b = new byte[1024];
			String str = "";
			while ((len = in.read(b)) != -1) {
				str += new String(b, 0, len);
			}
			Toast.makeText(this, str, 0).show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
