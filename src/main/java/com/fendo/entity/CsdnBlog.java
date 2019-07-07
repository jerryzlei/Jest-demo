package com.fendo.entity;

public class CsdnBlog {

	private String author;
	private String titile;
	private String tag;
	private String content;
	private String view;
	private String date;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CsdnBlog(String author, String titile, String tag, String content, String view, String date) {
		super();
		this.author = author;
		this.titile = titile;
		this.tag = tag;
		this.content = content;
		this.view = view;
		this.date = date;
	}
	public CsdnBlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
