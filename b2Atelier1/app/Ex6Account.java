package com.b2Atelier1.app;

public class Ex6Account {

	private String name;
	private String address;
	private double solde;
	private int withdraw;
	//private double interestRate;
	
	
	public Ex6Account(String name, String address, double solde, int withdraw){
		this.name = name;
		this.address = address;
		this.solde = solde;
		this.withdraw = withdraw;
		
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
	
	public int getWithdraw() {
		return this.withdraw;
	}
	
	public static void main(String[] args) {
		Ex6Account tom = new Ex6Account("El Alami Hassan", "Safi", 14765.8, 100);
		tom.setSolde(3456);
		System.out.println(tom.getSolde() - tom.getWithdraw());
	
	}

}

