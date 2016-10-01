package com.example.oracle19.ten;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTen extends Activity implements OnClickListener {
	Button b1, b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ten);
		b1 = (Button) findViewById(R.id.ten_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.ten_b2);
		b2.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ten_b1:
			startActivity(new Intent(ActivityTen.this,
					TenLifecycle.class));
			break;
		case R.id.ten_b2:
			startActivity(new Intent(ActivityTen.this, TenSQLdy.class));
			break;
		default:
			break;
		}
	}

}
