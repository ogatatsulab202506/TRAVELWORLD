package com.example.travelworld.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class News
  implements Serializable {
	
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Id
	private int id;
	private Date newsDate;
	private String newsText;
	
}
