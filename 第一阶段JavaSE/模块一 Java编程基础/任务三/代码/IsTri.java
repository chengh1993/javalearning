/*
	���ʵ�֣�ʹ���߼�������ж������������Ƿ�Ϊ��λ��
*/

import java.util.Scanner;

public class IsTri {
	
	public static void main(String[] args) {
		
		//1.��ʾ���벢�������
		System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.�жϲ����
		//System.out.println(((num / 100) > 0) && ((num /100) < 10)); 
		System.out.println((num > 99) && (num  < 1000)); 
		
		//ʹ����Ŀ������ж��Ƿ�Ϊ��λ��
		System.out.println(num + ((num > 99 && num  < 1000)? "����λ��" : "������λ��")); 
		
	}
}
