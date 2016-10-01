package com.example.oracle23.fourteen;

import java.util.List;

public class Company {
	private List<Department> data;

	public List<Department> getData() {
		return data;
	}

	public void setData(List<Department> data) {
		this.data = data;
	}

	public Company(List<Department> data) {
		super();
		this.data = data;
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [data=" + data + "]";
	}

}
