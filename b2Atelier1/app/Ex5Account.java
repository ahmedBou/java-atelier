package com.b2Atelier1.app;

public class Ex5Account {
	
	private String name;
	private String address;
	private double solde;
	//private double interestRate;
	
	
	public Ex5Account(String name, String address, double solde){
		this.name = name;
		this.address = address;
		this.solde = solde;
		
	}
	
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public double getSolde(){
		return this.solde;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setSolde(double solde){
		this.solde = solde;
	}
	
	public static void main(String[] args) {
		Ex5Account tom = new Ex5Account("El Alami Hassan", "Safi", 14765.8);
		tom.setSolde(3456);
		System.out.println(tom.getSolde());
	
	}

}
