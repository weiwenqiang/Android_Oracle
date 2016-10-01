package com.example.oracle23.fourteen;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class FourteenNewsJson extends Activity implements OnClickListener {
	TextView parse, showjson;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fourteen_testjson);
		parse = (TextView) findViewById(R.id.fourteen_parse);
		showjson = (TextView) findViewById(R.id.fourteen_showJson);
		parse.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		try {
			InputStream input = getResources().getAssets().open("newsjson.txt");
			byte[] b = new byte[1024];
			int len;
			StringBuffer sb = new StringBuffer();
			while ((len = input.read(b)) != -1) {
				sb.append(new String(b, 0, len));
			}
			showjson.setText(parseJson(sb.toString()).toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected News parseJson(String str) {
		News news = new News();
		LiveData live = null;
		try {
			JSONObject jone = new JSONObject(str);

			JSONObject joli = jone.getJSONObject("data");

			/**
			 * BigImg
			 */
			List<BigImg> listBi = new ArrayList<BigImg>();
			JSONArray bigImg = joli.getJSONArray("bigImg");
			for (int j = 0; j < bigImg.length(); j++) {
				JSONObject jobi = bigImg.getJSONObject(j);
				BigImg bi = new BigImg(jobi.getString("title"),
						jobi.getString("brief"), jobi.getString("phoneImg"),
						jobi.getString("padImg"), jobi.getString("itemType"),
						jobi.getString("itemID"), jobi.getString("detailUrl"),
						jobi.getString("order"));
				listBi.add(bi);
			}

			/**
			 * Hot
			 */
			List<Hot> listHo = new ArrayList<Hot>();
			JSONArray hot = joli.getJSONArray("hot");
			for (int k = 0; k < hot.length(); k++) {
				JSONObject joho = hot.getJSONObject(k);
				Hot ho = new Hot(joho.getString("title"),
						joho.getString("brief"), joho.getString("phoneImg"),
						joho.getString("padImg"), joho.getString("itemType"),
						joho.getString("itemID"), joho.getString("detailUrl"),
						joho.getString("name"), joho.getString("order"));
				listHo.add(ho);
			}

			/**
			 * ItemList
			 */
			List<ItemList> listIt = new ArrayList<ItemList>();
			JSONArray itemList = joli.getJSONArray("itemList");
			for (int l = 0; l < itemList.length(); l++) {
				JSONObject joit = itemList.getJSONObject(l);
				ItemList it = new ItemList(joit.getString("title"),
						joit.getString("brief"), joit.getString("phoneImg"),
						joit.getString("padImg"), joit.getString("itemType"),
						joit.getString("itemID"), joit.getString("detailUrl"),
						joit.getString("order"));
				listIt.add(it);
			}
			/**
			 * ×°ÔØLiveData
			 */
			live = new LiveData(joli.getString("liveUrl"),
					joli.getString("liveTitle"), joli.getString("liveImage"),
					joli.getString("tjShow"), listBi, listHo, listIt);

			news.setData(live);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return news;
	}
}
