package com.example.oracle10.three;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ThreeListView extends Activity {
	ListView listview;
	List<ThreePerson> listPerson;
	ThreeListAdapter myAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_listview);
		listview = (ListView) findViewById(R.id.three_listview);
		addList();
		myAdapter = new ThreeListAdapter(ThreeListView.this, listPerson);
		listview.setAdapter(myAdapter);
	}

	private void addList() {
		listPerson = new ArrayList<ThreePerson>();
		for (int i = 0; i < 20; i++) {
			listPerson.add(new ThreePerson("°¢ÈøµÂ" + i, i, "13931051110",
					R.drawable.log200, R.drawable.yang30));
		}
	}
}
