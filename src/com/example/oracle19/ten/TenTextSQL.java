package com.example.oracle19.ten;

import android.test.AndroidTestCase;
import android.util.Log;

public class TenTextSQL extends AndroidTestCase {
	public void createDB() {
		TenMySQLite mysql = new TenMySQLite(getContext());
		mysql.getWritableDatabase();
	}

	public void insertDB() {
		TenStudentDAO stuDAO = new TenStudentDAO(getContext());
		TenStudent stu = new TenStudent(1, "ÖÜ½ÜÂ×", 18);
		stuDAO.insert(stu);
	}

	public void updateDB() {
		TenStudentDAO stuDAO = new TenStudentDAO(getContext());
		TenStudent stu = new TenStudent(1, "ËïÑà×Ë", 24);
		stuDAO.update(stu);
	}

	public void selectDB() {
		TenStudentDAO stuDAO = new TenStudentDAO(getContext());
		Log.i("GAT", stuDAO.select(1).toString());
	}

	public void deleteDB() {
		TenStudentDAO stuDAO = new TenStudentDAO(getContext());
		stuDAO.delete(1);
	}
}
