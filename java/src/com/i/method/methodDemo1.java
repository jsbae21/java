package com.i.method;

public class methodDemo1 {
	public static void numbering() { //����
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) { //ȣ��
		numbering();
		numbering();// �żҵ带 ������ ȣ�� --> �̹� ������ ���� ������ ��Ȱ��
	}
}
