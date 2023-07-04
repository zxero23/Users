package com.test.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.users.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

   
    Phone findByNumber(String Number);
    
    List<Phone> findAll();
}
