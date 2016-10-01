package com.example.oracle23.fourteen;

public class FourteenPerson {
	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FourteenPerson [name=" + name + ", address=" + address
				+ ", age=" + age + "]";
	}

	public FourteenPerson(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public FourteenPerson() {
		super();
	}
}
