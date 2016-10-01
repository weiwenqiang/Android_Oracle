package com.example.oracle14.six;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class SixFragmentPager extends Activity {
	ViewPager mViewPager;
	SixMyPagerAdapter myAdapter;
	List<View> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six_viewpager);
		mViewPager = (ViewPager) findViewById(R.id.six_viewpager);
		LayoutInflater lf = getLayoutInflater();
		View v1 = lf.inflate(R.layout.six_fa, null);
		View v2 = lf.inflate(R.layout.six_fb, null);
		View v3 = lf.inflate(R.layout.six_fc, null);
		View v4 = lf.inflate(R.layout.six_fd, null);
		list = new ArrayList<View>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		myAdapter = new SixMyPagerAdapter(list);
		mViewPager.setAdapter(myAdapter);
	}
}
