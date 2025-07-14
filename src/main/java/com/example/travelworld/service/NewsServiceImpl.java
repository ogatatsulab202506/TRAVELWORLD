package com.example.travelworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelworld.entity.News;
import com.example.travelworld.repository.NewsRepository;

@Service
public class NewsServiceImpl implements NewsService {
	
  @Autowired
  NewsRepository newsRepository;
  
  @Override
  public List<News> findAll() {
	  return newsRepository.findAll();
  }
  
  @Override
  public void saveAndFlush( News news ) {
  	newsRepository.saveAndFlush( news );
  }

}
