package com.example.travelworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.travelworld.entity.News;
import com.example.travelworld.form.NewsInsertForm;
import com.example.travelworld.service.NewsService;

@Controller
@RequestMapping( "newsInsert" )
@SessionAttributes( "newsInsertForm" )
public class NewsInsertController {
	
	@ModelAttribute
	public NewsInsertForm setUpForm() {
		return new NewsInsertForm();
	}
	
	@GetMapping
	public String entry() {
		return "newsInsert";
	}
	
	@PostMapping( "confirm" )
	public String confirm( NewsInsertForm nesInsertForm ) {
		return "newsConfirm";
	}
	
	@Autowired
	NewsService newsService;
	
	@PostMapping( "complete" )
	public String complete( NewsInsertForm newsInsertForm, SessionStatus sessionStatus ) {
		News news = new News( 0, newsInsertForm.getNewsDate(), newsInsertForm.getNewsText() );
		newsService.saveAndFlush( news );
		sessionStatus.setComplete();
		return "newsComplete";
	}
	
}
