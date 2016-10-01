package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TwoEdit extends Activity {
	Button btnlogin;
	EditText edit1, edit2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_edit);
		btnlogin = (Button) findViewById(R.id.two_btnlogin);
		edit1 = (EditText) findViewById(R.id.two_edit1);
		edit2 = (EditText) findViewById(R.id.two_edit2);
		btnlogin.setOnClickListener(new OnClick());

	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			Toast.makeText(
					TwoEdit.this,
					"”√ªß√˚£∫" + edit1.getText().toString().trim() + "√‹¬Î£∫"
							+ edit2.getText().toString().trim(), 0).show();
		}
	}
}
