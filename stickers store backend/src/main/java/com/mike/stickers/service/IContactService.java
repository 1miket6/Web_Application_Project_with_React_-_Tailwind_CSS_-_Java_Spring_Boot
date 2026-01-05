package com.mike.stickers.service;

import com.mike.stickers.dto.ContactDto;
import com.mike.stickers.dto.ProductDto;

import java.util.List;

public interface IContactService {

	boolean saveContact(ContactDto cDTO);
	
}
