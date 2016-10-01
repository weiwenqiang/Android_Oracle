package com.example.oracle23.fourteen;

public class News {
	@Override
	public String toString() {
		return "News [data=" + data + "]";
	}

	private LiveData data;

	public News() {
		super();
	}

	public News(LiveData data) {
		super();
		this.data = data;
	}

	public LiveData getData() {
		return data;
	}

	public void setData(LiveData data) {
		this.data = data;
	}
}
