package com.example.oracle13.five;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FiveListLoad extends Activity implements OnScrollListener {
	ListView listView;
	FiveItemAdapter myAdapter;
	int start_index, end_index;
	public static boolean isInit = false;
	List<FiveItemEntity> list = new ArrayList<FiveItemEntity>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.five_loadlistview);
		listView = (ListView) findViewById(R.id.five_loadlist);
		getData();
		myAdapter = new FiveItemAdapter(list, FiveListLoad.this);
		listView.setAdapter(myAdapter);
		listView.setOnScrollListener(this);
	}

	private void getData() {
		for (int i = 0; i < 50; i++) {
			list.add(new FiveItemEntity(R.drawable.test_pic, "阿道夫" + i,
					"颐和园名人文化公园" + i));
		}
	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {

	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		switch (scrollState) {
		case AbsListView.OnScrollListener.SCROLL_STATE_IDLE: {
			myAdapter.setScrollState(false);
			int count = view.getChildCount();
			Log.e("FiveListLoad", "" + count);
			for (int i = 0; i < count; i++) {
				TextView text1 = (TextView) view.getChildAt(i).findViewById(
						R.id.five_tv_gridview_item);
				TextView text2 = (TextView) view.getChildAt(i).findViewById(
						R.id.five_tv_gridview_item_name);
				ImageView image = (ImageView) view.getChildAt(i).findViewById(
						R.id.five_iv_gridview_item);

				if (text1.getTag() != null) {
					text1.setText(text1.getTag().toString());
					text1.setTag(null);
				}
				if (text2.getTag() != null) {
					text2.setText(text2.getTag().toString());
					text2.setTag(null);
				}
				if (!image.getTag().equals("1")) {
					image.setImageResource(R.drawable.test_pic);
					image.setTag("1");
				}
			}
			break;
		}
		case AbsListView.OnScrollListener.SCROLL_STATE_FLING: {
			myAdapter.setScrollState(true);
			break;
		}
		case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL: {
			myAdapter.setScrollState(true);
			break;
		}
		default:
			break;
		}
	}

}
