package com.c.operator;

public class Prepost {

	public static void main(String[] args) {
		// ++ ����(increment) �����ڷ� ���� ���� 1�� ���� ��Ų��.
		// -- ����(Decrement) �����ڷ� ���� ���� 1�� ���� ��Ų��.
		int i = 3;
		i++;
		System.out.println(i); // 4���
		++i;
		System.out.println(i); // 5���
		System.out.println(++i); // 6���
		System.out.println(i++); // 6���
		System.out.println(i); // 7���
	}
}
//(++i)�� (i++)�� ����
//���ڴ� +1�� i�� ���� ����ϰ�, i++�� �ϴ� i�� ���� ����ϰ� �׵ڿ� 1�� ����