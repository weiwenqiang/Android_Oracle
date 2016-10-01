package com.example.oracle10.three;

import android.content.Context;
import android.widget.Toast;

public class ThreeToast {
	private Toast mToast;
	private Context context;

	public ThreeToast(Context context) {
		this.context = context;
	}

	public void showToast(String text) {
		if (mToast == null) {
			mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(text);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
	}

	public void cancelToast() {
		if (mToast != null) {
			mToast.cancel();
		}
	}
}
