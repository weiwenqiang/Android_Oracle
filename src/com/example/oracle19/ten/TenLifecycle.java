package com.example.oracle19.ten;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TenLifecycle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ten_lifecycle);
		Log.e("TAG", "---创建---onCreate---");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.e("TAG", "---开始---onStart---");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e("TAG", "---重新开始---onResume---");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e("TAG", "---暂停---onPause---");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e("TAG", "---停止---onStop---");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e("TAG", "---销毁---onDestroy---");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e("TAG", "---重新启动---onRestart---");
	}
}
