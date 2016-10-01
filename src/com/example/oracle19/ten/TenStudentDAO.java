package com.example.oracle19.ten;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class TenStudentDAO {
	TenMySQLite mysql;
	SQLiteDatabase db;

	public TenStudentDAO(Context context) {
		super();
		mysql = new TenMySQLite(context);
	}

	public void insert(TenStudent stu) {
		db = mysql.getWritableDatabase();
		db.execSQL("insert into t_student (sid, name, age) values (?,?,?);",
				new Object[] { stu.getSid(), stu.getName(), stu.getAge() });
		db.close();
	}

	public void update(TenStudent stu) {
		db = mysql.getWritableDatabase();
		db.execSQL("update t_student set name=?, age=? where sid=?;",
				new Object[] { stu.getName(), stu.getAge(), stu.getSid() });
		db.close();
	}

	public TenStudent select(int sid) {
		db = mysql.getReadableDatabase();
		Cursor cursor = db.rawQuery("select * from t_student where sid= ?;",
				new String[] { String.valueOf(sid) });
		while (cursor.moveToNext()) {
			return new TenStudent(cursor.getInt(cursor.getColumnIndex("sid")),
					cursor.getString(cursor.getColumnIndex("name")),
					cursor.getInt(cursor.getColumnIndex("age")));
		}
		return null;
	}

	public void delete(int sid) {
		db = mysql.getWritableDatabase();
		db.execSQL("delete from t_student where sid=?;",
				new String[] { String.valueOf(sid) });
		db.close();
	}
}
