package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TwoIntent extends Activity {
	EditText iedit;
	Button btns, btnt;
	Intent intent;
	String message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_intent);
		
		iedit = (EditText) findViewById(R.id.two_intentedit);
		btns = (Button) findViewById(R.id.two_intentsecond);
		btnt = (Button) findViewById(R.id.two_intentthird);

		btns.setOnClickListener(new OnClick());
		btnt.setOnClickListener(new OnClick());
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode) {
		case 100:
			iedit.setText(data.getStringExtra("backmsg"));
			break;

		default:
			break;
		}
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.two_intentsecond:
				intent = new Intent(TwoIntent.this,TwoIntentSecond.class);
				message =iedit.getText().toString();
				intent.putExtra("message", message);
				startActivityForResult(intent, 100);
				break;
			case R.id.two_intentthird:
				intent = new Intent(TwoIntent.this,TwoIntentThird.class);
				message =iedit.getText().toString();
				intent.putExtra("message", message);
				startActivityForResult(intent, 100);
				break;
			default:
				break;
			}
		}
	}
}
