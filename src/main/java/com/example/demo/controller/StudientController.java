package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.IStudientDAO;

@Controller
@RequestMapping("/studient")
public class StudientController {

	@Autowired
	private IStudientDAO studientDAO;

	@GetMapping("/")
	public String studientlist(Model model) {
		model.addAttribute("studients", studientDAO.findAll());
		return "studientlist";
	}

}
