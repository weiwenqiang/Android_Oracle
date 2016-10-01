package com.example.oracle19.ten;

public class TenStudent {
	private int sid;
	private String name;
	private int age;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public TenStudent(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}

	public TenStudent() {
		super();
	}

	@Override
	public String toString() {
		return "TenStudent [sid=" + sid + ", name=" + name + ", age=" + age
				+ "]";
	}

}
