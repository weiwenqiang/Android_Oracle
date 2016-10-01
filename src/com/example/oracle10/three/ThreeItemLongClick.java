package com.example.oracle10.three;

import java.util.ArrayList;
import java.util.List;

import com.example.android_oracle.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

public class ThreeItemLongClick extends Activity {
	private static final int VIEW_SELECT = 0;
	private static final int VIEW_INSERT = 1;
	private static final int VIEW_UPDATE = 3;
	private static final int VIEW_DELETE = 4;

	ListView listview;
	List<ThreePerson> listPerson;
	ThreeListAdapter myAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_listview);
		listview = (ListView) findViewById(R.id.three_listview);
		addList();
		myAdapter = new ThreeListAdapter(ThreeItemLongClick.this, listPerson);
		listview.setAdapter(myAdapter);

		listview.setOnItemLongClickListener(new OnItemLongClick());
	}

	private void addList() {
		listPerson = new ArrayList<ThreePerson>();
		for (int i = 0; i < 20; i++) {
			listPerson.add(new ThreePerson("阿萨德" + i, i, "13931051110",
					R.drawable.log200, R.drawable.yang30));
		}
	}

	class OnItemLongClick implements OnItemLongClickListener {

		@Override
		public boolean onItemLongClick(AdapterView<?> parent, View view,
				final int position, long id) {
			AlertDialog.Builder builder = new AlertDialog.Builder(
					ThreeItemLongClick.this);
			builder.setTitle("长按触发事件");
			builder.setItems(new String[] { "查询详情", "添加操作", "修改操作", "删除操作" },
					new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							switch (which) {
							case VIEW_SELECT:
								showDetail(position);
								break;
							case VIEW_INSERT:

								break;
							case VIEW_UPDATE:

								break;
							case VIEW_DELETE:

								break;

							default:
								break;
							}
						}
					});
			builder.show();
			return false;
		}

	}

	private void showDetail(int position) {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				ThreeItemLongClick.this);
		ThreePerson person = listPerson.get(position);
		builder.setTitle(person.getName());
		builder.setMessage(person.getPhone());
		builder.setPositiveButton("返回", null);
		builder.show();
	}
}
