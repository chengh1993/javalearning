/*
	���ʵ�֣���ʾ����һ��������ʹ��if else�ж����������
*/

import java.util.Scanner;

public class IfMinus {
	
	public static void main(String[] args) {
		
		//1.��ʾ���������������
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.�ж����������
		/*if(num < 0) {
			System.out.println(num + "��һ������");
		} else {
			System.out.println(num + "��һ���Ǹ���");
		}
		*/
		
		//3.�ж������Ǹ�����0
		if(num < 0) {
			System.out.println(num + "��һ������");
		} else {
			if(0 == num) {
				System.out.println(num + "����");
			} else {
				System.out.println(num + "��һ������");
			}
		}
		
		/*if(num < 0) {
			System.out.println(num + "��һ������");
		} else if (0 == num) { 
			System.out.println(num + "����");
		} else {
			System.out.println(num + "��һ������");
		}
		*/
		
		
	}
}