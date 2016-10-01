package com.example.oracle10.three;

import java.util.List;

import com.example.android_oracle.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ThreeGridAdapter extends BaseAdapter {
	Context context;
	List<ThreeGridType> list;

	public ThreeGridAdapter() {
		super();
	}

	public ThreeGridAdapter(Context context, List<ThreeGridType> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int index) {
		return list.get(index);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = LayoutInflater.from(context).inflate(
				R.layout.three_griditem, null);

		TextView gridtext = (TextView) convertView
				.findViewById(R.id.three_gridtext);
		ImageView gridimage = (ImageView) convertView
				.findViewById(R.id.three_gridimage);

		gridtext.setText(list.get(position).getGridtext());
		gridimage.setImageResource(list.get(position).getGridimage());

		return convertView;
	}

}
