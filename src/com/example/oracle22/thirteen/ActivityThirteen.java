package com.example.oracle22.thirteen;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityThirteen extends Activity implements OnClickListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thirteen);
		b1 = (Button) findViewById(R.id.thirteen_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.thirteen_b2);
		b2.setOnClickListener(this);
		b3 = (Button) findViewById(R.id.thirteen_b3);
		b3.setOnClickListener(this);
		b4 = (Button) findViewById(R.id.thirteen_b4);
		b4.setOnClickListener(this);
		b5 = (Button) findViewById(R.id.thirteen_b5);
		b5.setOnClickListener(this);
		b6 = (Button) findViewById(R.id.thirteen_b6);
		b6.setOnClickListener(this);
		b7 = (Button) findViewById(R.id.thirteen_b7);
		b7.setOnClickListener(this);
		b8 = (Button) findViewById(R.id.thirteen_b8);
		b8.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.thirteen_b1:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad1.class));
			break;
		case R.id.thirteen_b2:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad2.class));
			break;
		case R.id.thirteen_b3:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad3.class));
			break;
		case R.id.thirteen_b4:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad4.class));
			break;
		case R.id.thirteen_b5:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad5.class));
			break;
		case R.id.thirteen_b6:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad6.class));
			break;
		case R.id.thirteen_b7:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad7.class));
			break;
		case R.id.thirteen_b8:
			startActivity(new Intent(ActivityThirteen.this, TestImageLoad8.class));
			break;
		default:
			break;
		}
	}

}
