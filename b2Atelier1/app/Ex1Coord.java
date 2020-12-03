package com.b2Atelier1.app;

public class Ex1Coord {

	private int a;
	private int b;

	Ex1Coord(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int geta() {
		return this.a;
	}
	
	public int getb() {
		return this.b;
	}
	

	public static void main(String[] args) {
		
		Ex1Coord a = new Ex1Coord(12, 30);

		System.out.println(a.geta() - a.getb());
				
	}
	
	
}
