package com.project.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Long dailyIncome;
	private Integer days;
	
	public Payment() {
		
	}

	public Payment(String name, Long long1, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = long1;
		this.days = days;
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

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days*dailyIncome;
	}
}
