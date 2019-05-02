package com.c.operator;

public class Prepost {

	public static void main(String[] args) {
		// ++ 증가(increment) 연산자로 항의 값을 1씩 증가 시킨다.
		// -- 감소(Decrement) 연산자로 항의 값을 1씩 감소 시킨다.
		int i = 3;
		i++;
		System.out.println(i); // 4출력
		++i;
		System.out.println(i); // 5출력
		System.out.println(++i); // 6출력
		System.out.println(i++); // 6출력
		System.out.println(i); // 7출력
	}
}
//(++i)와 (i++)의 차이
//전자는 +1된 i의 값을 출력하고, i++는 일단 i의 값을 출력하고 그뒤에 1을 증가