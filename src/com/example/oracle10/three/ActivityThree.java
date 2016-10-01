package com.example.oracle10.three;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityThree extends Activity {
	Button b1, b2, b3, b4, b5, b6, b7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
		b1 = (Button) findViewById(R.id.three_b1);
		b2 = (Button) findViewById(R.id.three_b2);
		b3 = (Button) findViewById(R.id.three_b3);
		b4 = (Button) findViewById(R.id.three_b4);
		b5 = (Button) findViewById(R.id.three_b5);
		b6 = (Button) findViewById(R.id.three_b6);
		b7 = (Button) findViewById(R.id.three_b7);
		b1.setOnClickListener(new OnClick());
		b2.setOnClickListener(new OnClick());
		b3.setOnClickListener(new OnClick());
		b4.setOnClickListener(new OnClick());
		b5.setOnClickListener(new OnClick());
		b6.setOnClickListener(new OnClick());
		b7.setOnClickListener(new OnClick());
		
		
	}
	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.three_b1:
				startActivity(new Intent(ActivityThree.this, ThreeRadio.class));
				break;
			case R.id.three_b2:
				startActivity(new Intent(ActivityThree.this, ThreeCheck.class));
				break;
			case R.id.three_b3:
				startActivity(new Intent(ActivityThree.this, ThreeListView.class));
				break;
			case R.id.three_b4:
				startActivity(new Intent(ActivityThree.this, ThreeGridView.class));
				break;
			case R.id.three_b5:
				startActivity(new Intent(ActivityThree.this, ThreeAlertDialog.class));
				break;
			case R.id.three_b6:
				startActivity(new Intent(ActivityThree.this, ThreeItemClick.class));
				break;
			case R.id.three_b7:
				startActivity(new Intent(ActivityThree.this, ThreeItemLongClick.class));
				break;
			default:
				break;
			}
		}

	}
	
}
