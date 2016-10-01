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

public class ThreeListAdapter extends BaseAdapter {

	Context context;
	List<ThreePerson> list;

	public ThreeListAdapter(Context context, List<ThreePerson> list) {
		super();
		this.context = context;
		this.list = list;
	}

	public ThreeListAdapter() {
		super();
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
		convertView = LayoutInflater.from(context).inflate(R.layout.three_listitem, null);
		ImageView head = (ImageView) convertView.findViewById(R.id.three_head);
		ImageView yang = (ImageView) convertView.findViewById(R.id.three_yang);
		TextView name = (TextView) convertView.findViewById(R.id.three_name_string);
		TextView age = (TextView) convertView.findViewById(R.id.three_age_string);
		TextView phone = (TextView) convertView.findViewById(R.id.three_phone_string);
		
		head.setImageResource(R.drawable.log200);
		yang.setImageResource(R.drawable.yang30);
		name.setText(list.get(position).getName());
		age.setText(String.valueOf(list.get(position).getAge()));
		phone.setText(list.get(position).getPhone());
		
		return convertView;
	}

}
