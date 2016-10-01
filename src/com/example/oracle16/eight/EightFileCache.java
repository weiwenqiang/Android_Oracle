package com.example.oracle16.eight;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class EightFileCache extends Activity {
	TextView save, read;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eight_filecache);
		save = (TextView) findViewById(R.id.eight_save);
		read = (TextView) findViewById(R.id.eight_read);
		save.setOnClickListener(new OnClick());
		read.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.eight_save:
				save();
				break;
			case R.id.eight_read:
				read();
				break;
			default:
				break;
			}
		}
	}

	private void save() {
		OutputStream output;
		try {
			output = this.openFileOutput("wwq", MODE_PRIVATE);
			String str = "魏文强";
			output.write(str.getBytes());
			output.flush();
			output.close();
			Toast.makeText(this, "数据保存成功", 0).show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void read() {
		InputStream input = null;
		try {
			input = this.openFileInput("wwq");
			int len;
			byte[] bytes = new byte[1024];
			String str = "";
			while ((len = input.read(bytes)) != -1) {
				str += new String(bytes, 0, len);
			}
			Toast.makeText(this, str, 0).show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
