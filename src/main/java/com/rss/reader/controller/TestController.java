package com.rss.reader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rss.reader.services.PirateTableService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	@Autowired
	private PirateTableService pirateTableService;
	@GetMapping("/test")
	public String greeting(Model model) {
		log.error("Logging {}", pirateTableService.generatePirateTable());
		System.out.println(pirateTableService.generatePirateTable());
		model.addAttribute("pirateDTO", pirateTableService.generatePirateTable());
		return "index";
		
		
	}

}
