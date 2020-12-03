package com.b2Atelier1.app;

public class Ex7Degree {
	private String title;
	private String mention;
	private int years;
	
	
	public void Ex7Degree(String title, String mention, int years) {
		this.title = title;
		this.mention = mention;
		this.years = years;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getMention() {
		return this.mention;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public void setYears(int years) {
		this.years = years;
	}
}
