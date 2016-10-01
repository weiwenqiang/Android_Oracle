package com.example.oracle08.one;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OneOnClick extends Activity implements OnClickListener {
	TextView textview1, textview2, textview3, textview4;
	Button button1, button2, button3, button4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one_click);
		textview1 = (TextView) findViewById(R.id.one_tvnm);
		textview2 = (TextView) findViewById(R.id.one_tvnb);
		textview3 = (TextView) findViewById(R.id.one_tvjk);
		textview4 = (TextView) findViewById(R.id.one_tvxml);
		button1 = (Button) findViewById(R.id.one_bnm);
		button2 = (Button) findViewById(R.id.one_bnb);
		button3 = (Button) findViewById(R.id.one_bjk);
		button4 = (Button) findViewById(R.id.one_bxml);
		textview1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(OneOnClick.this, "执行匿名内部类方法", 0).show();
			}
		});
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(OneOnClick.this, "执行匿名内部类方法", 0).show();
			}
		});
		textview2.setOnClickListener(new MyOnClick());
		button2.setOnClickListener(new MyOnClick());
		textview3.setOnClickListener(this);
		button3.setOnClickListener(this);
	}

	class MyOnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			Toast.makeText(OneOnClick.this, "执行内部类方法", 0).show();
		}

	}

	@Override
	public void onClick(View v) {
		Toast.makeText(OneOnClick.this, "执行实现接口方法", 0).show();
	}

	public void xmlOnClick(View view) {
		Toast.makeText(OneOnClick.this, "执行xml配置方法", 0).show();
	}

}
