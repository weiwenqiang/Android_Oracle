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
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class FourteenEasyJson extends Activity implements OnClickListener {
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
			InputStream input = getResources().getAssets().open("json.txt");
			byte[] b = new byte[1024];
			int len;
			StringBuffer sb = new StringBuffer();
			while((len= input.read(b))!= -1){
				sb.append(new String(b, 0, len));
			}
			showjson.setText(parseJson(sb.toString()).toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	protected List<FourteenPerson> parseJson(String str){
		List<FourteenPerson> listPerson = new ArrayList<FourteenPerson>();
		try {
			JSONArray ja = new JSONArray(str);
			for(int i=0; i<ja.length(); i++){
				JSONObject jo = ja.getJSONObject(i);
				FourteenPerson person = new FourteenPerson();
				person.setName(jo.getString("name"));
				person.setAddress(jo.getString("address"));
				person.setAge(jo.getInt("age"));
				listPerson.add(person);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return listPerson;
	}
}
