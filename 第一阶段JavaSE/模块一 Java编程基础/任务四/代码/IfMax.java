/*
	���ʵ�֣���ʾ�û���������������ʹ��if��֧�ṹ�ҵ����ֵ����ӡ����
*/

import java.util.Scanner;

public class IfMax {
	
	public static void main(String[] args) {
		
		//1.��ʾ�û����룬��������������
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//2.�������ֵ����ӡ
		/*if(num1 >= num2) {
			System.out.println("���ֵΪ��" + num1);
		}
		if(num2 > num1) {
			System.out.println("���ֵΪ��" + num2);
		}
		*/
		
		//��ʽ���������һ����󲢼�¼
		int max = num1;
		
		if(num2 >= max) {
			max = num2;
		}
		System.out.println("���ֵΪ��" + max);
		
		
		
		
	}
}