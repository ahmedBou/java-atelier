package com.b2Atelier1.app;

public class Ex4Account {
	private String name;
	private String address;
	private double solde;
	//private double interestRate;
	
	
	public Ex4Account(String name, String address, double solde){
		this.name = name;
		this.address = address;
		this.solde = solde;
		//this.interestRate = interestRate;
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
	public double Interest(){
		double result = this.solde * 0.07 ;
		return result;
	}
	public String displayAccount(){
		return getName() +"habite a ("+ getAddress() + ") - infos solde " + getSolde() + " taux d'interet et de: ";
	}

	

	public static void main(String[] args) {
		Ex4Account tom = new Ex4Account("El Alami Hassan", "Safi", 14765.8);
		Ex4Account jerry = new Ex4Account("Karimi Khalid", "Casablanca", 7654.0);
		System.out.print(tom.displayAccount());
		System.out.println(tom.Interest());

		System.out.print(jerry.displayAccount());
		System.out.println(jerry.Interest());


	}
}
