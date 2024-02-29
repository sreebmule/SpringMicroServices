package com.myorg.bookscatalog.models;

public class CatalogItem {
	
	
	private String BookName;
	private String Description;
	private int bookrating;
	
	public CatalogItem(String bookName, String description, int bookrating) {
		super();
		this.BookName = bookName;
		this.Description = description;
		this.bookrating = bookrating;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getBookrating() {
		return bookrating;
	}
	public void setBookrating(int bookrating) {
		this.bookrating = bookrating;
	}
	
	
	

}
