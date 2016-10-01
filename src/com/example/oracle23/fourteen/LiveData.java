package com.example.oracle23.fourteen;

import java.util.List;

public class LiveData {
	private String liveUrl;
	private String liveTitle;
	private String liveImage;
	private String tjShow;
	private List<BigImg> bigImg;
	private List<Hot> hot;
	private List<ItemList> itemList;

	public String getLiveUrl() {
		return liveUrl;
	}

	public void setLiveUrl(String liveUrl) {
		this.liveUrl = liveUrl;
	}

	public String getLiveTitle() {
		return liveTitle;
	}

	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}

	public String getLiveImage() {
		return liveImage;
	}

	public void setLiveImage(String liveImage) {
		this.liveImage = liveImage;
	}

	public String getTjShow() {
		return tjShow;
	}

	public void setTjShow(String tjShow) {
		this.tjShow = tjShow;
	}

	public List<BigImg> getBigImg() {
		return bigImg;
	}

	public void setBigImg(List<BigImg> bigImg) {
		this.bigImg = bigImg;
	}

	public List<Hot> getHot() {
		return hot;
	}

	public void setHot(List<Hot> hot) {
		this.hot = hot;
	}

	public List<ItemList> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemList> itemList) {
		this.itemList = itemList;
	}

	public LiveData(String liveUrl, String liveTitle, String liveImage,
			String tjShow, List<BigImg> bigImg, List<Hot> hot,
			List<ItemList> itemList) {
		super();
		this.liveUrl = liveUrl;
		this.liveTitle = liveTitle;
		this.liveImage = liveImage;
		this.tjShow = tjShow;
		this.bigImg = bigImg;
		this.hot = hot;
		this.itemList = itemList;
	}

	public LiveData() {
		super();
	}

	@Override
	public String toString() {
		return "LiveData [liveUrl=" + liveUrl + ", liveTitle=" + liveTitle
				+ ", liveImage=" + liveImage + ", tjShow=" + tjShow
				+ ", bigImg=" + bigImg + ", hot=" + hot + ", itemList="
				+ itemList + "]";
	}

}
