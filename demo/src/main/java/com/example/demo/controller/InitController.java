package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Dept;
import com.example.demo.entity.Vegetable;
import com.example.demo.service.DeptService;
import com.example.demo.service.VegetableService;

@Controller
public class InitController {

	@Autowired
	DeptService deptService;

	@Autowired
	VegetableService vegetableService;

	@RequestMapping("/demo")
	public String dispInit(Model model) {
		List<Dept> deptList = deptService.searchAll();
		model.addAttribute("deptList", deptList);

		List<Vegetable> vegetableList = vegetableService.searchAll();
		model.addAttribute("vegetableList", vegetableList);

		return "index";
	}

	@RequestMapping("/demo2")
	public String insertAndDelete(Model model) {
		List<Dept> deptList = deptService.searchAll();
		model.addAttribute("deptList", deptList);

		List<Vegetable> vegetableList = vegetableService.searchAll();
		model.addAttribute("vegetableList", vegetableList);

		return "insert-and-delete";
	}
}
