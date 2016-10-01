package com.example.oracle13.five;

public class FiveItemEntity {
	private int image;
	private String text1;
	private String text2;

	public FiveItemEntity() {
		super();
	}

	public FiveItemEntity(int image, String text1, String text2) {
		super();
		this.image = image;
		this.text1 = text1;
		this.text2 = text2;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}
}
