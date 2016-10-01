package com.example.oracle08.one;

import com.example.android_oracle.MainActivity;
import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class OneTask extends Activity implements OnClickListener {
	TextView ttv1, ttv2, ttv3, ttv4, fh;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one_task);
		ttv1 = (TextView) findViewById(R.id.one_ttv1);
		ttv2 = (TextView) findViewById(R.id.one_ttv2);
		ttv3 = (TextView) findViewById(R.id.one_ttv3);
		ttv4 = (TextView) findViewById(R.id.one_ttv4);
		fh = (TextView) findViewById(R.id.one_ttv5);
		image = (ImageView) findViewById(R.id.one_taskimageView);

		ttv1.setOnClickListener(this);
		ttv2.setOnClickListener(this);
		ttv3.setOnClickListener(this);
		fh.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.one_ttv1:
			ttv4.setText("Ö´ÐÐsetText±ä»»ÎÄ×Ö");
			break;
		case R.id.one_ttv2:
			image.setImageResource(R.drawable.rmbf);
			break;
		case R.id.one_ttv3:
			ttv1.setVisibility(ttv1.GONE);
			ttv2.setVisibility(ttv2.GONE);
			break;
		case R.id.one_ttv5:
			startActivity(new Intent(OneTask.this, MainActivity.class));
			break;
		default:
			break;
		}
	}
}
