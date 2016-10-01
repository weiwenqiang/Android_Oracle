package com.example.oracle14.six;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class SixFragment extends FragmentActivity {
	ViewPager mViewPager;
	SixMyAdapter myAdapter;
	List<Fragment> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six_viewpager);
		SixFa fa = new SixFa();
		SixFb fb = new SixFb();
		SixFc fc = new SixFc();
		SixFd fd = new SixFd();
		mViewPager = (ViewPager) findViewById(R.id.six_viewpager);
		list = new ArrayList<Fragment>();
		list.add(fa);
		list.add(fb);
		list.add(fc);
		list.add(fd);

		myAdapter = new SixMyAdapter(getSupportFragmentManager(), list);
		mViewPager.setAdapter(myAdapter);
	}
}
