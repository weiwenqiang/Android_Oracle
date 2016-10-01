package com.example.oracle20.eleven;

import java.util.Date;

import org.litepal.crud.DataSupport;

public class ElevenNews extends DataSupport {
	private int id;
	private String title;
	private String content;
	private Date publishDate;
	private int commentCount;

	@Override
	public String toString() {
		return "ElevenNews [id=" + id + ", title=" + title + ", content="
				+ content + ", publishDate=" + publishDate + ", commentCount="
				+ commentCount + "]";
	}

	public ElevenNews() {
		super();
	}

	public ElevenNews(int id, String title, String content, Date publishDate,
			int commentCount) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.publishDate = publishDate;
		this.commentCount = commentCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
}
