package com.example.oracle13.five;

import java.util.List;

import com.example.android_oracle.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FiveItemAdapter extends BaseAdapter {

	List<FiveItemEntity> list;
	Context context;
	private boolean scrollState = false;

	public FiveItemAdapter(List<FiveItemEntity> list, Context context) {
		super();
		this.list = list;
		this.context = context;
	}

	public void setScrollState(boolean scrollState) {
		this.scrollState = scrollState;
	}

	public FiveItemAdapter() {
		super();
	}

	public List<FiveItemEntity> getList() {
		return list;
	}

	public void setList(List<FiveItemEntity> list) {
		this.list = list;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return list != null ? list.size() : 0;
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = LayoutInflater.from(context).inflate(
					R.layout.five_listitem, null);
			viewHolder.image = (ImageView) convertView
					.findViewById(R.id.five_iv_gridview_item);
			viewHolder.text1 = (TextView) convertView
					.findViewById(R.id.five_tv_gridview_item);
			viewHolder.text2 = (TextView) convertView
					.findViewById(R.id.five_tv_gridview_item_name);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		if (!scrollState) {
			viewHolder.text1.setText(list.get(position).getText1());
			viewHolder.text1.setTag(null);
			viewHolder.text2.setText(list.get(position).getText2());
			viewHolder.text2.setTag(null);
			viewHolder.image.setImageResource(list.get(position).getImage());
			viewHolder.image.setTag("1");
		} else {
			viewHolder.text1.setText("小加载中..");
			viewHolder.text1.setTag(list.get(position).getText1());
			viewHolder.text2.setText("大加载中..");
			viewHolder.text2.setTag(list.get(position).getText2());
			viewHolder.image.setImageResource(R.drawable.test_d);
			viewHolder.image.setTag(list.get(position).getImage());
		}

		return convertView;
	}

	static class ViewHolder {
		ImageView image;
		TextView text1, text2;
	}

}
