package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.TestWeb;
import com.service.TestWebManager;

@Controller
public class MainController {
	
	@Autowired
	private TestWebManager testWebManager;
	
	@RequestMapping(value = "main.do")
	public String mainRequest(ModelMap map){
		map.addAttribute("listEntity", this.testWebManager.getAll());
		map.addAttribute("newEntity", new TestWeb());
		return "index";
	}
	
	@RequestMapping(value = "add.do")
	public String addRequest(@ModelAttribute(value = "newEntity") TestWeb testWeb, BindingResult result){
		this.testWebManager.addNew(testWeb);
		return "redirect:main.do";
	}
}
