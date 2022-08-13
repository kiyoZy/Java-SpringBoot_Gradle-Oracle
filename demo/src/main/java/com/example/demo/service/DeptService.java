package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dept;
import com.example.demo.repository.DeptRepository;

@Service
public class DeptService {

	@Autowired
	DeptRepository deptRepository;

	public List<Dept> searchAll() {
		return deptRepository.findAll();

	}

}
