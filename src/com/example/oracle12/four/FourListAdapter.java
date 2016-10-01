package com.example.oracle12.four;

import java.util.List;

import com.example.android_oracle.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FourListAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<FourUsers> lists;

	private boolean scrollState = false;

	public FourListAdapter(Context context, List<FourUsers> lists) {
		super();
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		this.lists = lists;
	}

	public void setScrollState(boolean scrollState) {
		this.scrollState = scrollState;
	}

	@Override
	public int getCount() {
		return 50;
	}

	@Override
	public Object getItem(int position) {
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;

		if (convertView == null) {
			convertView = inflater.inflate(R.layout.four_listitem, null, true);
			viewHolder = new ViewHolder();
			viewHolder.iv_icon = (ImageView) convertView
					.findViewById(R.id.four_itemimage);
			viewHolder.tv_name = (TextView) convertView
					.findViewById(R.id.four_itemtext);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		FourUsers users = lists.get(position);

		if (!scrollState) {
			viewHolder.tv_name.setText(users.getName());
			viewHolder.tv_name.setTag(null);
			viewHolder.iv_icon.setImageResource(users.getHead());
			viewHolder.iv_icon.setTag("1");
		} else {
			viewHolder.tv_name.setText("Мгдижа...");
			viewHolder.tv_name.setTag(users.getName());
			viewHolder.iv_icon.setImageResource(R.drawable.ic_launcher);
			viewHolder.iv_icon.setTag(users.getHead());
		}

		return convertView;
	}

	static class ViewHolder {
		TextView tv_name;
		ImageView iv_icon;
	}

}
