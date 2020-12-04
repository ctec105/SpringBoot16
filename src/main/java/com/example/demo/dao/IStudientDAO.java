package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Studient;

public interface IStudientDAO extends JpaRepository<Studient, Long> {

}
