package com.myorg.bookscatalog.models;

import java.util.List;

public class UserBasedRatings {

	private List<BookRate> userRating;
	
	public UserBasedRatings() {
		
	}
	
	public UserBasedRatings(List<BookRate> userRating) {
		super();
		this.userRating = userRating;
	}

	public List<BookRate> getUserRating(){
		
		return userRating;
		
	}
	
	public void setUserRating(List<BookRate> userRating) {
		this.userRating=userRating;
	}
	
}
