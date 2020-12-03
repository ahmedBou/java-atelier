package com.b2Atelier1.app;

public class Ex2Dogs {
	public String name;
	
	Ex2Dogs( String name){
		this.name = name;
	}
	
	public static void bark(String name) {
		
		if(name.equals("rex")) {
			System.out.print("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ");
	
		}else if(name.equals("max")) {
				System.out.print("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ");
		}
	}
	
	public static void eat(String name) {
		bark(name);
		if(name.equals("rex")) {
			System.out.println("je mange de la viande");
		}else if(name.equals("max")) {
			System.out.println("je mange du poisson");

		}
	}
	
	public static void main(String[] args) {	
		Ex2Dogs.eat("rex");
		Ex2Dogs.eat("max");

	}

}
