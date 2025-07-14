package com.example.travelworld.form;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class NewsInsertForm
	implements Serializable {
	
	private Date newsDate;
	private String newsText;

}
