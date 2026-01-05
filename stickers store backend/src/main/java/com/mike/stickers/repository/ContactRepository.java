package com.mike.stickers.repository;

import com.mike.stickers.entity.Contact;
import com.mike.stickers.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{ //primary key
//implement all the abstract methods from JpaRepository
}
