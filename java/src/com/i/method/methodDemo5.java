package com.i.method;
import java.io.*;

public class methodDemo5 {
	
	public static String numbering(int init, int limit) {
        int i = init;
        // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
        String output = "";
        while (i < limit) {
            // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
            output += i;
            i++;
        }
        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
        // ��ġ�ϸ� �ȴ�.
        return output;
    }
 
    public static void main(String[] args) {
        // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(1, 5);
        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);
        try { // ����
            // ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
        out.write(result);
        out.close();
        } catch (IOException e) {
        } 
    }
}