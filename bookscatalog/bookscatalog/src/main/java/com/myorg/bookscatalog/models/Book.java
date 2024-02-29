package com.myorg.bookscatalog.models;

public class Book {

	private String Bookid;
	private String Bookname;
	private String Author;
	
	public Book(String bookid, String bookname, String author) {
		super();
		this.Bookid = bookid;
		this.Bookname = bookname;
		this.Author = author;
	}
	public String getBookid() {
		return Bookid;
	}
	public void setBookid(String bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
}
