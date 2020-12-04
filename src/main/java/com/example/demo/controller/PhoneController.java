package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.IPhoneDAO;

@Controller
@RequestMapping("/phone")
public class PhoneController {

	@Autowired
	private IPhoneDAO phoneDAO;

	@GetMapping("/")
	public String phonelist(Model model) {
		model.addAttribute("phones", phoneDAO.findAll());
		return "phonelist";
	}

}
