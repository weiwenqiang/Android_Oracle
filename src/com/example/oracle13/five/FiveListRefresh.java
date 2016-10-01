package com.example.oracle13.five;

import com.example.android_oracle.R;
import com.example.oracle13.five.FivePullToRefreshView.OnFooterRefreshListener;
import com.example.oracle13.five.FivePullToRefreshView.OnHeaderRefreshListener;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class FiveListRefresh extends ListActivity implements
		OnHeaderRefreshListener, OnFooterRefreshListener {

	FivePullToRefreshView mPullToRefreshView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.five_listview);

		mPullToRefreshView = (FivePullToRefreshView) findViewById(R.id.five_pull_refresh_view);

		setListAdapter(new FiveRefreshAdapter(this));

		mPullToRefreshView.setOnHeaderRefreshListener(this);
		mPullToRefreshView.setOnFooterRefreshListener(this);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Toast.makeText(this, "position = " + position, 1000).show();
	}

	@Override
	public void onFooterRefresh(FivePullToRefreshView view) {
		mPullToRefreshView.postDelayed(new Runnable() {

			@Override
			public void run() {
				mPullToRefreshView.onFooterRefreshComplete();
			}
		}, 1000);
	}

	@Override
	public void onHeaderRefresh(FivePullToRefreshView view) {
		mPullToRefreshView.postDelayed(new Runnable() {

			@Override
			public void run() {
				mPullToRefreshView.onHeaderRefreshComplete();
			}
		}, 1000);
	}
}
