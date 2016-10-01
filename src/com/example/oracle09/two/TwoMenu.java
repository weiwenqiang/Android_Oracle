package com.example.oracle09.two;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TwoMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.two_menuitem, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.two_item1:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item2:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item3:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item4:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item5:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item6:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item7:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item8:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item9:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		case R.id.two_item10:
			Toast.makeText(this, "执行"+item.getTitle()+"方法" + item.getTitle().toString(), 0).show();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}



	
}
