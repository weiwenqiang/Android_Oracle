package com.example.oracle19.ten;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class TenMySQLite extends SQLiteOpenHelper {
	public static final String DBNAME="data.db";
	public static final int VERSION = 1;
	public static final String TABLE="t_student";
	
	public TenMySQLite(Context context) {
		super(context, DBNAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table "+TABLE+" (sid integer primary key, name varchar(20), age integer)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

}
