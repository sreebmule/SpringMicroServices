package com.myorg.bookscatalog.models;

public class BookRate {
	
	private String BookId;
	private String BookName;
	private int BookRating;
	
	
	public BookRate(String bookId, String bookName, int bookRating) {
		super();
		this.BookId = bookId;
		this.BookName = bookName;
		this.BookRating = bookRating;
	}
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookRate() {
		return BookRating;
	}
	public void setBookRate(int bookRating) {
		BookRating = bookRating;
	}
	
	

}
