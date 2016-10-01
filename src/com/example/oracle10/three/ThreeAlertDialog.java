package com.example.oracle10.three;

import com.example.android_oracle.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class ThreeAlertDialog extends Activity {
	TextView alert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_alertdialog);
		alert = (TextView) findViewById(R.id.three_alert);
		alert.setOnClickListener(new OnClick());
	}

	class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.three_alert:
				alert();
				break;

			default:
				break;
			}
		}

	}

	private void alert() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("对话框标题");
		builder.setIcon(R.drawable.log200);
		builder.setMessage("对话框文字信息提示");
		builder.setPositiveButton("true按钮",
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(ThreeAlertDialog.this, "执行true时的方法", 0)
								.show();
					}
				});
		builder.setNegativeButton("false按钮",
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(ThreeAlertDialog.this, "执行false时的方法", 0)
								.show();
					}
				});
		builder.show();
	}

}
