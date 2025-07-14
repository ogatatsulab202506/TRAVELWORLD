package com.example.travelworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.travelworld.service.NewsService;

@Controller
@RequestMapping( "/" )
public class NewsListController {
	
	@Autowired
	NewsService newsService;
	
	@GetMapping
	public String findAll( Model model ) {
		model.addAttribute( "newsList", newsService.findAll() );
		return "index";

	}

}
