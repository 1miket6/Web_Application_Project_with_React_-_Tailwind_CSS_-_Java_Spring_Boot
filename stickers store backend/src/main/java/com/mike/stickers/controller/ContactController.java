package com.mike.stickers.controller;

import com.mike.stickers.dto.ContactDto;
import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contact")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {

	private final IContactService iContactService;


//	@Autowired
//	public ProductController(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}

	@PostMapping
	public String saveContact(@RequestBody ContactDto contactDto) { //DTO pattern
//		Thread.sleep(5000);
//		System.out.println("React StrictMode render 2 times for development.");
	  boolean isSaved = iContactService.saveContact(contactDto);
		if(isSaved){
			return "Request processed successfully";
		}
		else{
			return "An error occurred. Please try again or contact Dev team.";
		}
  }
	
}
