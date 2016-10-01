package com.example.oracle12.four;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

public class FourProgressBar extends Activity {
	ProgressBar progress1, progress2;
	int i = 0;
	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			i++;
			progress1.setProgress(i);
			progress2.setProgress(i);
			handler.sendEmptyMessage(msg.what);
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.four_progressbar);
		progress1 = (ProgressBar) findViewById(R.id.four_progressBar1);
		progress2 = (ProgressBar) findViewById(R.id.four_progressBar2);
		Message msg = new Message();
		handler.sendEmptyMessage(msg.what);
	}
}
