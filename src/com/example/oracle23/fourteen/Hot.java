package com.example.oracle23.fourteen;

public class Hot {
	private String title;
	private String brief;
	private String phoneImg;
	private String padImg;
	private String itemType;
	private String itemID;
	private String detailUrl;
	private String name;
	private String order;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getPhoneImg() {
		return phoneImg;
	}

	public void setPhoneImg(String phoneImg) {
		this.phoneImg = phoneImg;
	}

	public String getPadImg() {
		return padImg;
	}

	public void setPadImg(String padImg) {
		this.padImg = padImg;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Hot(String title, String brief, String phoneImg, String padImg,
			String itemType, String itemID, String detailUrl, String name,
			String order) {
		super();
		this.title = title;
		this.brief = brief;
		this.phoneImg = phoneImg;
		this.padImg = padImg;
		this.itemType = itemType;
		this.itemID = itemID;
		this.detailUrl = detailUrl;
		this.name = name;
		this.order = order;
	}

	public Hot() {
		super();
	}

	@Override
	public String toString() {
		return "Hot [title=" + title + ", brief=" + brief + ", phoneImg="
				+ phoneImg + ", padImg=" + padImg + ", itemType=" + itemType
				+ ", itemID=" + itemID + ", detailUrl=" + detailUrl + ", name="
				+ name + ", order=" + order + "]";
	}
}
