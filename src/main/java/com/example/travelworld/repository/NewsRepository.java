package com.example.travelworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelworld.entity.News;

@Repository
public interface NewsRepository
  extends JpaRepository<News,Integer> {
}
