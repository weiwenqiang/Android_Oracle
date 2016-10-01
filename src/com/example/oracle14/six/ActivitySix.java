package com.example.oracle14.six;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivitySix extends Activity {
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_six);
		b1 = (Button) findViewById(R.id.six_b1);
		b2 = (Button) findViewById(R.id.six_b2);
		b1.setOnClickListener(new OnClick());
		b2.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.six_b1:
				startActivity(new Intent(ActivitySix.this, SixFragment.class));
				break;
			case R.id.six_b2:
				startActivity(new Intent(ActivitySix.this, SixFragmentPager.class));
				break;

			default:
				break;
			}
		}
	}
}
