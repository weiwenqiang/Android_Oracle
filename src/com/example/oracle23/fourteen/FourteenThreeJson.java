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

public class FourteenThreeJson extends Activity implements OnClickListener {
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
			InputStream input = getResources().getAssets().open("three.txt");
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

	protected Company parseJson(String str) {
		Company company = new Company();
		try {

			JSONObject joco = new JSONObject(str);
			JSONArray jade = joco.getJSONArray("data");
			List<Department> listDe = new ArrayList<Department>();

			for (int i = 0; i < jade.length(); i++) {

				JSONObject jode = jade.getJSONObject(i);
				JSONArray jagr = jode.getJSONArray("groups");
				String dename = jode.getString("name");
				List<Group> listGr = new ArrayList<Group>();

				for (int j = 0; j < jagr.length(); j++) {

					JSONObject jogr = jagr.getJSONObject(j);
					Group gr = new Group(jogr.getString("name"),
							jogr.getString("drscription"));
					listGr.add(gr);
				}

				Department de = new Department();
				de.setGroups(listGr);
				de.setName(dename);
				listDe.add(de);
			}
			company.setData(listDe);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return company;
	}
}
