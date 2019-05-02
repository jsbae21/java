package com.c.operator;

public class Division {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d); // 정수 나누기 실수 => 형변환(자동형변환) 은 java가 '더 범위가 넓은 데이터타입' 으로 변경
	}
}
