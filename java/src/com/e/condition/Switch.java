package com.e.condition;

public class Switch {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(4){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");	
			break;
		default:
			System.out.println("default");
		}
		int val =3;
		if(val == 1) {
			System.out.println("one");	
		} else if(val ==2) {
			System.out.println("two");
		} else
			System.out.println("three");
	}

}
