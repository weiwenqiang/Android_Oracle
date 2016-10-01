package com.example.oracle26.sixteen;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivitySixteen extends Activity implements OnClickListener {
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixteen);
		b1 = (Button) findViewById(R.id.sixteen_b1);
		b1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.sixteen_b1:
			startActivity(new Intent(ActivitySixteen.this,
					SixteenAsyncTask.class));
			break;
		default:
			break;
		}
	}
}
