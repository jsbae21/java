package com.f.Condition_Operator;

public class Or_login {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if((id.equals("bae") || id.equals("BAE") || id.equals("Bae")) 
			&& password.equals("111111")){
				System.out.println("Right");
		} else {
			System.out.println("Wrong");
		}

	}

}
