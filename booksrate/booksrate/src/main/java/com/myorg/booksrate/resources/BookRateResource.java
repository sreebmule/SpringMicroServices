package com.myorg.booksrate.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.booksrate.models.BookRate;
import com.myorg.booksrate.models.UserBasedRatings;


@RestController
@RequestMapping("/BookRatingInfo")
public class BookRateResource {
	
	@RequestMapping("/{bookId}")	
public BookRate getBookRateInfo(@PathVariable("bookId")String bookId) {
		
	return new BookRate(bookId,"peter pan",8);
		
	}
	
	@RequestMapping("/users/{userId}")	
	public UserBasedRatings getUserBasedRateInfo(@PathVariable("userId")String userId) {
		
		List <BookRate> bookRatings = Arrays.asList(
				new BookRate("b1234","peter pan",8),
				new BookRate("b4567","Kencenten Garden",6)
				);
		
	   UserBasedRatings userBasedRatings= new UserBasedRatings();
		 userBasedRatings.setUserRating(bookRatings);
		 return userBasedRatings;
		}

}
