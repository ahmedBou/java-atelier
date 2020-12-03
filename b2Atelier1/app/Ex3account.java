package com.b2Atelier1.app;

public class Ex3account {
	
	private String name;
	private String address;
	private double solde;
	
	
	public Ex3account(String name, String address, double solde){
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
	public String displayAccount(){
		return getName() +"habite a ("+ getAddress() + ") - infos solde " + getSolde();
	}
	

	public static void main(String[] args) {
		Ex3account tom = new Ex3account("El Alami Hassan","Safi", 14765.8);
		Ex3account jerry = new Ex3account("Karimi Khalid", "Casablanca", 7654.0);
		System.out.println(tom.displayAccount());
		System.out.println(jerry.displayAccount());

	}

}
