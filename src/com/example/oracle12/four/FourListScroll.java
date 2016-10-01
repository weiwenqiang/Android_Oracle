package com.example.oracle12.four;

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

public class FourListScroll extends Activity {
	ListView listview;
	List<FourUsers> listUsers;
	FourListAdapter myAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.four_listview);
		listview = (ListView) findViewById(R.id.four_listview);
		addList();
		
		listview.setAdapter(myAdapter);
		initList();
	}

	private void addList() {
		listUsers = new ArrayList<FourUsers>();
		for (int i = 0; i < 20; i++) {
			listUsers.add(new FourUsers(R.drawable.yang30, "°¢ÈøµÂ" + i));
		}
	}
	private void initList(){
		listview = (ListView) findViewById(R.id.four_listview);
		myAdapter = new FourListAdapter(FourListScroll.this, listUsers);
		listview.setAdapter(myAdapter);
		listview.setOnScrollListener(new OnScroll());
	}
	class OnScroll implements OnScrollListener{

		@Override
		public void onScroll(AbsListView view, int firstVisibleItem,
				int visibleItemCount, int totalItemCount) {
			
		}

		@Override
		public void onScrollStateChanged(AbsListView view, int scrollState) {
			switch (scrollState) {
			case AbsListView.OnScrollListener.SCROLL_STATE_IDLE:
			{
				myAdapter.setScrollState(false);
				int count = view.getChildCount();
				Log.e("FourListScroll", count+"");
				
				for(int i=0;i<count;i++){
					TextView tv_name= (TextView) view.getChildAt(i).findViewById(R.id.four_itemtext);
					ImageView iv_icon = (ImageView) view.getChildAt(i).findViewById(R.id.four_itemimage);
					
					if(tv_name.getTag()!=null){
						tv_name.setText(tv_name.getTag().toString());
						tv_name.setTag(null);
					}
					
					if(!iv_icon.getTag().equals("1")){
						iv_icon.setImageResource(R.drawable.yang30);
						iv_icon.setTag("1");
					}
				}
				break;
			}
			case AbsListView.OnScrollListener.SCROLL_STATE_FLING:
			{
				myAdapter.setScrollState(true);
				break;
			}
			case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
			{
				myAdapter.setScrollState(true);
				break;
			}
			default:
				break;
			}
		}
		
	}
}
