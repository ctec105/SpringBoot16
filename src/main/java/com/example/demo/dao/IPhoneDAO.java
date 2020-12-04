package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Phone;

public interface IPhoneDAO extends JpaRepository<Phone, Long> {

}
