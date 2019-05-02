package com.d.compare;

public class Equal_not {

	public static void main(String[] args) {
		System.out.println(1 == 2); //false
		System.out.println(1 == 1); //true
		System.out.println("one" == "two"); //false
		System.out.println("one" == "one"); //true
		
		//!는 부정을 의미(같지 않다)
		System.out.println(1!= 2); //true
		System.out.println(1!= 1); //false
		System.out.println("one"!= "two"); //true
		System.out.println("one"!= "one"); //false

	}

}
