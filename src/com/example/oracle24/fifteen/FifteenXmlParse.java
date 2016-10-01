package com.example.oracle24.fifteen;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.example.android_oracle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class FifteenXmlParse extends Activity implements OnClickListener {
	TextView parse, showxml;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifteen_xmlparse);
		parse = (TextView) findViewById(R.id.fifteen_xmlparse);
		showxml = (TextView) findViewById(R.id.fifteen_showxml);
		parse.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		try {
			InputStream input = getResources().getAssets().open("book.xml");
			showxml.setText(parseXml(input).toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected List<Book> parseXml(InputStream input) {
		List<Book> list = null;
		try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			XmlPullParser pullParser = factory.newPullParser();
			pullParser.setInput(input, "UTF-8");
			Book book = null;
			int event = pullParser.getEventType();
			while (event != 1) {
				switch (event) {
				case 0:
					list = new ArrayList<Book>();
					break;
				case 2:
					if ("book".equals(pullParser.getName())) {
						book = new Book();
						book.setCategory(pullParser.getAttributeName(0));
					}
					if ("title".equals(pullParser.getName())) {
						book.setTitleLang(pullParser.getAttributeName(0));
						book.setTitle(pullParser.nextText());
					}
					if ("author".equals(pullParser.getName())) {
						book.setAuthor(pullParser.nextText());
					}
					if ("year".equals(pullParser.getName())) {
						book.setYear(Integer.parseInt(pullParser.nextText()));
					}
					if ("price".equals(pullParser.getName())) {
						book.setPrice(Double.parseDouble(pullParser.nextText()));
					}
					break;
				case 3:
					if ("book".equals(pullParser.getName())) {
						list.add(book);
						book = null;
					}
					break;
				default:
					break;
				}
				event = pullParser.next();
			}

		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return list;
	}
}
