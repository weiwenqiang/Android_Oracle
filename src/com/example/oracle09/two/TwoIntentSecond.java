package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TwoIntentSecond extends Activity {
	EditText secondedit;
	Button btnsecond;
	String backmsg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_second);
		secondedit = (EditText) findViewById(R.id.two_secondedit);
		btnsecond = (Button) findViewById(R.id.two_secondbtn);

		btnsecond.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent back = new Intent(TwoIntentSecond.this,TwoIntent.class);
			backmsg=getIntent().getStringExtra("message")+"$s#"+
					secondedit.getText().toString().trim();
			back.putExtra("backmsg", backmsg);
			setResult(RESULT_OK, back);
			finish();
		}
	}

}
