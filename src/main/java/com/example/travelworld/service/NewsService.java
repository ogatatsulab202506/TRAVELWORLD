package com.example.travelworld.service;

import java.util.List;

import com.example.travelworld.entity.News;

public interface NewsService {
	
	List<News> findAll();
	
	void saveAndFlush( News news );

}
