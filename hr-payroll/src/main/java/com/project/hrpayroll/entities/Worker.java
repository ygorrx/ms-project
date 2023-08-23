package com.project.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Long dailyIncome;
	 
	public Worker() {
		 
	}
	 
	public Worker(Long id, String name, Long dailyIncome) {
		 super();
		 this.id = id;
		 this.name = name;
		 this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getDailyIncome() {
		return dailyIncome;
	}
	
	public void setDailyIncome(Long dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}
