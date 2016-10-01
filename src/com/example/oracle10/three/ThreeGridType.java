package com.example.oracle10.three;

public class ThreeGridType {
	private String gridtext;
	private int gridimage;

	public ThreeGridType() {
		super();
	}

	public ThreeGridType(String gridtext, int gridimage) {
		super();
		this.gridtext = gridtext;
		this.gridimage = gridimage;
	}

	public String getGridtext() {
		return gridtext;
	}

	public void setGridtext(String gridtext) {
		this.gridtext = gridtext;
	}

	public int getGridimage() {
		return gridimage;
	}

	public void setGridimage(int gridimage) {
		this.gridimage = gridimage;
	}

	@Override
	public String toString() {
		return "ThreeGridType [gridtext=" + gridtext + ", gridimage="
				+ gridimage + "]";
	}

}
