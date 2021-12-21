package com.example.HRManager.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HRManager.model.Contact;

@Repository
public interface ContactService extends JpaRepository<Contact, Integer> {
    
}