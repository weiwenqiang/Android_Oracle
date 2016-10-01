package com.example.oracle14.six;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SixMyAdapter extends FragmentPagerAdapter {
	private List<Fragment> list;

	public SixMyAdapter(FragmentManager fm, List<Fragment> list) {
		super(fm);
		this.list = list;
	}

	public SixMyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		return list.get(index);
	}

	@Override
	public int getCount() {
		return list.size();
	}

}
