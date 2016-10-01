package com.example.oracle10.three;

public class ThreePerson {
	private String name;
	private int age;
	private String phone;
	private int head;
	private int yang;

	public ThreePerson(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ThreePerson [name=" + name + ", age=" + age + ", phone="
				+ phone + ", head=" + head + ", yang=" + yang + "]";
	}

	public ThreePerson() {
		super();
	}

	public ThreePerson(String name, int age, String phone, int head, int yang) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.head = head;
		this.yang = yang;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getYang() {
		return yang;
	}

	public void setYang(int yang) {
		this.yang = yang;
	}
}
