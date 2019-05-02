package com.c.operator;

public class Concat {

	public static void main(String[] args) {
		// 더하기 연산자는 숫자와 숫자를 더할때 사용되지만, 문자열과 문자열을 결합할때도 사용된다.
		String firstString = "This is";
		String secondString = " a concatenated string";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);

	}

}
