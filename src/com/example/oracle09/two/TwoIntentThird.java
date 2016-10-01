package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TwoIntentThird extends Activity {
	EditText thirdedit;
	Button btnthird;
	String backmsg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_third);
		thirdedit = (EditText) findViewById(R.id.two_thirdedit);
		btnthird = (Button) findViewById(R.id.two_thirdbtn);
		btnthird.setOnClickListener(new OnClick());
	}
	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent back = new Intent(TwoIntentThird.this,TwoIntent.class);
			backmsg = getIntent().getStringExtra("message")+"$T#"+thirdedit.getText().toString().trim();
			back.putExtra("backmsg", backmsg);
			setResult(RESULT_OK, back);
			finish();
		}
	}
}
