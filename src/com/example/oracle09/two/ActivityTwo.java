package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTwo extends Activity {
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		b1 = (Button) findViewById(R.id.two_b1);
		b2 = (Button) findViewById(R.id.two_b2);
		b3 = (Button) findViewById(R.id.two_b3);
		b4 = (Button) findViewById(R.id.two_b4);
		b1.setOnClickListener(new OnClick());
		b2.setOnClickListener(new OnClick());
		b3.setOnClickListener(new OnClick());
		b4.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.two_b1:
				startActivity(new Intent(ActivityTwo.this, TwoEdit.class));
				break;
			case R.id.two_b2:
				startActivity(new Intent(ActivityTwo.this, TwoMenu.class));
				break;
			case R.id.two_b3:
				startActivity(new Intent(ActivityTwo.this, TwoWeight.class));
				break;
			case R.id.two_b4:
				startActivity(new Intent(ActivityTwo.this, TwoIntent.class));
				break;

			default:
				break;
			}
		}
	}
}
