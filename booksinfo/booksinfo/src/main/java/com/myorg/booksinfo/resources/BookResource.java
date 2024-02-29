package com.myorg.booksinfo.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.booksinfo.models.Book;

@RestController
@RequestMapping("/Books")
public class BookResource {
	
	@RequestMapping("/{bookId}")
	public Book getBookInfo(@PathVariable("bookId")String bookId) {
		
		return new Book(bookId.toString(),"peter pan","J.M. Barrie");
		
	}

}
