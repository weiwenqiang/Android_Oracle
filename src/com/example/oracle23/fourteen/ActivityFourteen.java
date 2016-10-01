package com.example.oracle23.fourteen;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityFourteen extends Activity implements OnClickListener {
	Button b1, b2, b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourteen);
		b1 = (Button) findViewById(R.id.fourteen_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.fourteen_b2);
		b2.setOnClickListener(this);
		b3 = (Button) findViewById(R.id.fourteen_b3);
		b3.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.fourteen_b1:
			startActivity(new Intent(ActivityFourteen.this, FourteenEasyJson.class));
			break;
		case R.id.fourteen_b2:
			startActivity(new Intent(ActivityFourteen.this, FourteenThreeJson.class));
			break;
		case R.id.fourteen_b3:
			startActivity(new Intent(ActivityFourteen.this, FourteenNewsJson.class));
			break;
		default:
			break;
		}
	}

}
