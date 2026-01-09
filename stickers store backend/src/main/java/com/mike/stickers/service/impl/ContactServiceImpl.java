package com.mike.stickers.service.impl;

import com.mike.stickers.dto.ContactDto;
import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.entity.Contact;
import com.mike.stickers.entity.Product;
import com.mike.stickers.repository.ContactRepository;
import com.mike.stickers.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService{
	
	private final ContactRepository contactRepository;

	@Override
	public boolean saveContact(ContactDto contactDto){

		//try {
			Contact contact = transformToEntity(contactDto);
//		contact.setCreatedAt(Instant.now());
//		contact.setCreatedBy(contactDto.getName());
		contactRepository.save(contact);
		return true;
//		catch(Exception exception){
//			return false;
//		}
	}

	private Contact transformToEntity (ContactDto contactDto) {
		Contact contact = new Contact();
//		productDto.setProductId(product.getProductId());
		BeanUtils.copyProperties(contactDto, contact);
		return contact;
	}	
}
