package com.f.Condition_Operator;

public class And_login {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("bae") && password.equals("111111")) {
				System.out.println("Right");
		} else {
			System.out.println("Wrong");
		}

	}
}
					
		/*
		String id = args[0];
		String password = args[1];
		if(id.equals("bae")) {
			if(password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("check the password");
			}
		} else {
			System.out.println("check the id");
		}
	}

		 */

