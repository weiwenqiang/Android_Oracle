package com.example.oracle23.fourteen;

public class Group {
	private String drscription;
	private String name;

	public Group() {
		super();
	}

	public Group(String drscription, String name) {
		super();
		this.drscription = drscription;
		this.name = name;
	}

	@Override
	public String toString() {
		return "FourteenDrscription [drscription=" + drscription + ", name="
				+ name + "]";
	}

	public String getDrscription() {
		return drscription;
	}

	public void setDrscription(String drscription) {
		this.drscription = drscription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
