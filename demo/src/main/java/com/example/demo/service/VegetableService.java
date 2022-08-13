package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vegetable;
import com.example.demo.repository.VegetableRepository;

@Service
public class VegetableService {

	@Autowired
	VegetableRepository vegetableRepository;

	public List<Vegetable> searchAll() {
		return vegetableRepository.findAll();
	}

}
