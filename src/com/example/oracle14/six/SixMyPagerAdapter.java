package com.example.oracle14.six;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class SixMyPagerAdapter extends PagerAdapter {
	List<View> list;

	public SixMyPagerAdapter(List<View> list) {
		super();
		this.list = list;
	}

	public SixMyPagerAdapter() {
		super();
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(list.get(position));
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(list.get(position), 0);
		return list.get(position);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public boolean isViewFromObject(View v, Object o) {
		return v == o;
	}

}
