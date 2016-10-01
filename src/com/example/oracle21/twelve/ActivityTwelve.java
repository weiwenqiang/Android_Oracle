package com.example.oracle21.twelve;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTwelve extends Activity implements OnClickListener {
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_twelve);
		b1 = (Button) findViewById(R.id.twelve_b1);
		b1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.twelve_b1:
			startActivity(new Intent(ActivityTwelve.this,
					TwelveNetwordRequest.class));
			break;

		default:
			break;
		}
	}

}
