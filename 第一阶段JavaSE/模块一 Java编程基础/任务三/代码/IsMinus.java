/*
	���ʵ��ʹ�ù�ϵ������ж��Ƿ�Ϊ�������Ǵ�ӡtrue�����ӡfalse
*/

import java.util.Scanner;

public class IsMinus {
	
	public static void main(String[] args) {
		
		//1.��ʾ�û�����һ�������������������
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		//2.�ж��Ƿ��Ǹ���
		boolean b1 = num < 0;
		//3.��ӡ���
		System.out.println("�жϽ��Ϊ��" + b1);
		//����ֱ�Ӵ�ӡ���
		System.out.println(num < 0);
		
	}
}