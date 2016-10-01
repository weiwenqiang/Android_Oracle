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
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class NineSDCardWritRead extends Activity implements OnClickListener {
	TextView save, read;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nine_sdcardwritread);
		save = (TextView) findViewById(R.id.nine_save);
		read = (TextView) findViewById(R.id.nine_read);
		save.setOnClickListener(this);
		read.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.nine_save:
			save();
			break;
		case R.id.nine_read:
			read();
		default:
			break;
		}
	}

	private void save() {
		String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			File sdFile = Environment.getExternalStorageDirectory();
			String filePath = sdFile.getAbsolutePath();
			String msg = "琅琊榜大结局了";
			try {
				FileWriter fw = new FileWriter(filePath + "/sdcardfile.txt", true);
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
			try {
				FileReader fr = new FileReader(filePath + "/sdcardfile.txt");
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
