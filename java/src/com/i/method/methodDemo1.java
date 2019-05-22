package com.i.method;

public class methodDemo1 {
	public static void numbering() { //정의
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) { //호출
		numbering();
		numbering();// 매소드를 여러번 호출 --> 이미 정의해 놓은 로직을 재활용
	}
}
