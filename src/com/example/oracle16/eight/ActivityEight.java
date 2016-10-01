package com.example.oracle16.eight;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityEight extends Activity {
	Button b1, b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eight);
		b1 = (Button) findViewById(R.id.eight_b1);
		b1.setOnClickListener(new OnClick());
		b2 = (Button) findViewById(R.id.eight_b2);
		b2.setOnClickListener(new OnClick());
		
		
	}
	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.eight_b1:
				startActivity(new Intent(ActivityEight.this, EightFileCache.class));
				break;
			case R.id.eight_b2:
				startActivity(new Intent(ActivityEight.this, EightFileDyIO.class));
				break;
			default:
				break;
			}
		}
	}
}
