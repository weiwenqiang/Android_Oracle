package com.example.oracle10.three;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class ThreeGridView extends Activity {
	GridView gridview;
	List<ThreeGridType> listType;
	ThreeGridAdapter myAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_gridview);
		gridview = (GridView) findViewById(R.id.three_gridview);
		addList();
		myAdapter = new ThreeGridAdapter(ThreeGridView.this, listType);
		gridview.setAdapter(myAdapter);
	}

	private void addList() {
		listType = new ArrayList<ThreeGridType>();
		for (int i = 0; i < 50; i++) {
			listType.add(new ThreeGridType("分类信息", R.drawable.log200));
		}
	}
}
