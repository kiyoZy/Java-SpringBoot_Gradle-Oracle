package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vegetable;

@Repository
public interface  VegetableRepository extends JpaRepository<Vegetable, Long>{
}
