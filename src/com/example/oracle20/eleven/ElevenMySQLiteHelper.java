package com.example.oracle20.eleven;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ElevenMySQLiteHelper extends SQLiteOpenHelper {
	public static final String CREATE_NEWS = "create table news(id integer primary key autoincrement, title text, content text, publishdate integer, commentcount integer);";

	public ElevenMySQLiteHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_NEWS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

	}

}
