package com.example.oracle12.four;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

public class FourToast extends Activity {
	FourMyToast myToast;
	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			myToast.cancelToast();
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.four_toast);
		myToast = new FourMyToast(FourToast.this);
		findViewById(R.id.four_toast).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myToast.showToast("自定义时间的Toast");
				Message msg = new Message();
				handler.sendMessageDelayed(msg, 500);
			}
		});
	}
}
