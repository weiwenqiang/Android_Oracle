package com.example.oracle08.one;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityOne extends Activity implements OnClickListener {
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);

		b1 = (Button) findViewById(R.id.one_b1);
		b2 = (Button) findViewById(R.id.one_b2);
		b3 = (Button) findViewById(R.id.one_b3);
		b4 = (Button) findViewById(R.id.one_b4);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.one_b1:
			startActivity(new Intent(ActivityOne.this, OneTextImage.class));
			break;
		case R.id.one_b2:
			startActivity(new Intent(ActivityOne.this, OneOnClick.class));
			break;
		case R.id.one_b3:
			startActivity(new Intent(ActivityOne.this, OneRelativeLayout.class));
			break;
		case R.id.one_b4:
			startActivity(new Intent(ActivityOne.this, OneTask.class));
			break;
		default:
			break;
		}
	}

}
