package com.myorg.bookscatalog.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.myorg.bookscatalog.models.Book;
import com.myorg.bookscatalog.models.BookRate;
import com.myorg.bookscatalog.models.CatalogItem;
import com.myorg.bookscatalog.models.UserBasedRatings;

@RestController
@RequestMapping("/bookscatalog")
public class BookCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{reguserId}")
	public List<CatalogItem> getCatalog(@PathVariable("reguserId")String reguserID){
		
		
		
		
		
	/*	List <BookRate> bookRatings = Arrays.asList(
				new BookRate("b1234","peter pan",8),
				new BookRate("b4567","Kencenten Garden",6)
				);
				*/
		//get All rated book id
		//UserBasedRatings userBasedRatings=restTemplate.getForObject("http://localhost:8082/Books/"+ reguserID,UserBasedRatings.class);
		//reactive programming of webClient to make the request 
		UserBasedRatings userBasedRatings= webClientBuilder.build()
				.get()
				.uri("http://localhost:8083/BookRatingInfo/users/"+ reguserID)
				.retrieve()
				.bodyToMono(UserBasedRatings.class)
				.block();
		
		//For each rated book get all details
		
		return userBasedRatings.getUserRating().stream().map(rating -> {		
	
		//	Book book= restTemplate.getForObject("http://localhost:8082/Books/"+rating.getBookId() ,Book.class);
			//reactive programming of webClient to make the request 
			Book book= webClientBuilder.build()
					.get()
					.uri("http://localhost:8082/Books/"+rating.getBookId())
					.retrieve()
					.bodyToMono(Book.class)
					.block();
			return new CatalogItem(book.getBookname(), "Published  in 1911 Language English Source Barrie, J.M. ", rating.getBookRate());
		}).collect(Collectors.toList());
		
		
		
/*	return bookRatings.stream().map(
			rating -> BookRate book= restTemplate.getForObject("http://localhost:8082/Books/"+rating.BookId,Book.class)).
			forEach(rating -> new CatalogItem(book.Bookname, "Published  in 1911 Language English Source Barrie, J.M.", 8)
                      );
*/

	//return new CatalogItem("peter pan", "Published  in 1911 Language English Source Barrie, J.M.", 8)
	
			//.collect(Collectors.toList());
		
	
	}
}
