package com.example.oracle13.five;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityFive extends Activity {
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_five);
		b1 = (Button) findViewById(R.id.five_b1);
		b1.setOnClickListener(new OnClick());
		b2 = (Button) findViewById(R.id.five_b2);
		b2.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.five_b1:
				startActivity(new Intent(ActivityFive.this,
						FiveListRefresh.class));
				break;
			case R.id.five_b2:
				startActivity(new Intent(ActivityFive.this, FiveListLoad.class));
				break;
			default:
				break;
			}
		}
	}
}
