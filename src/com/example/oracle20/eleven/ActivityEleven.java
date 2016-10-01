package com.example.oracle20.eleven;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityEleven extends Activity implements OnClickListener {
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eleven);
		b1 = (Button) findViewById(R.id.eleven_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.eleven_b2);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.eleven_b1:
			startActivity(new Intent(ActivityEleven.this, ElevenLitepal.class));
			break;
		case R.id.eleven_b2:
			startActivity(new Intent(ActivityEleven.this, ElevenLitepalDy.class));
			break;
		default:
			break;
		}
	}
}
