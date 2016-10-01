package com.example.oracle17.nine;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityNine extends Activity implements OnClickListener {
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nine);
		b1 = (Button) findViewById(R.id.nine_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.nine_b2);
		b2.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.nine_b1:
			startActivity(new Intent(ActivityNine.this,
					NineSDCardWritRead.class));
			break;
		case R.id.nine_b2:
			startActivity(new Intent(ActivityNine.this, NineSDCardDy.class));
			break;
		default:
			break;
		}
	}

}
