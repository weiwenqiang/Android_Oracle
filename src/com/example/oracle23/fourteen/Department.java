package com.example.oracle23.fourteen;

import java.util.List;

public class Department {
	private List<Group> groups;
	private String name;

	@Override
	public String toString() {
		return "Department [groups=" + groups + ", name=" + name + "]";
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
		super();
	}

	public Department(List<Group> groups, String name) {
		super();
		this.groups = groups;
		this.name = name;
	}
}
