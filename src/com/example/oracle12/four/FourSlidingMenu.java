package com.example.oracle12.four;

import com.example.android_oracle.R;
import com.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class FourSlidingMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.four_toast);
		initSliding();
	}

	public void initSliding() {
		SlidingMenu menu = new SlidingMenu(FourSlidingMenu.this);
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setBehindWidth(100);
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		View v = LayoutInflater.from(FourSlidingMenu.this).inflate(
				R.layout.four_slidingmenu, null);
		menu.setMenu(v);
	}
}
