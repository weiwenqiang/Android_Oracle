package com.example.oracle20.eleven;

import org.litepal.crud.DataSupport;

public class ElevenPerson extends DataSupport {
	private int id;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "ElevenPerson [id=" + id + ", name=" + name + ", age=" + age
				+ "]";
	}
	public ElevenPerson(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public ElevenPerson() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
