package com.example.oracle10.three;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class ThreeCheck extends Activity {
	CheckBox check1, check2, check3, check4, check5;
	List<String> list;
	TextView checktext;
	ThreeToast myToast;
	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			myToast.cancelToast();
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_check);
		myToast = new ThreeToast(ThreeCheck.this);
		check1 = (CheckBox) findViewById(R.id.three_checkBox1);
		check2 = (CheckBox) findViewById(R.id.three_checkBox2);
		check3 = (CheckBox) findViewById(R.id.three_checkBox3);
		check4 = (CheckBox) findViewById(R.id.three_checkBox4);
		check5 = (CheckBox) findViewById(R.id.three_checkBox5);
		checktext = (TextView) findViewById(R.id.three_checktext);
		check1.setOnCheckedChangeListener(new OnChecked());
		check2.setOnCheckedChangeListener(new OnChecked());
		check3.setOnCheckedChangeListener(new OnChecked());
		check4.setOnCheckedChangeListener(new OnChecked());
		check5.setOnCheckedChangeListener(new OnChecked());
		list = new ArrayList<String>();
		checktext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myToast.showToast(list.toString());
				Message msg = new Message();
				handler.sendMessageDelayed(msg, 500);
			}
		});

	}

	class OnChecked implements OnCheckedChangeListener {

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			if (isChecked) {
				myToast.showToast("Ìí¼Ó£º" + buttonView.getText().toString());
				Message msg = new Message();
				handler.sendMessageDelayed(msg, 500);
				list.add(buttonView.getText().toString());
			} else {
				myToast.showToast("³·Ïú£º" + buttonView.getText().toString());
				Message msg = new Message();
				handler.sendMessageDelayed(msg, 500);
				list.remove(buttonView.getText().toString());
			}
		}
	}
}
