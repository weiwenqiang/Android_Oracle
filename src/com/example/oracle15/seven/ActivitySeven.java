package com.example.oracle15.seven;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivitySeven extends Activity {
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seven);
		b1 = (Button) findViewById(R.id.seven_b1);
		b1.setOnClickListener(new OnClick());
		b2 = (Button) findViewById(R.id.seven_b2);
		b2.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.seven_b1:
				startActivity(new Intent(ActivitySeven.this, SevenShared.class));
				break;
			case R.id.seven_b2:
				startActivity(new Intent(ActivitySeven.this, SevenSaveRead.class));
				break;
			default:
				break;
			}
		}
	}
}
