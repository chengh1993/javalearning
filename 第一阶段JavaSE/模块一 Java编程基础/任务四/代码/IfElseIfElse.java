/*
	���ʵ�� if    else if		else��֧�ṹ��ʹ�ã�ģ�⹺Ʊ
*/

import java.util.Scanner;

public class IfElseIfElse {
	
	public static void main(String[] args) {
		
		//1.��ʾ���������Ϣ���������
		System.out.println("���������������Ϣ��");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//�ж������Ϣ
		if ("����".equals(str)) {
			System.out.println("��ѳ���");
		} else if("ѧ��".equals(str) ) {
			System.out.println("��۹�Ʊ");
		} else {
			System.out.println("�빺��ȫƱ");
		}
		
		//3.��ӡһ�仰
		System.out.println("�����˻�ȥ������ȥ���������Ĳ����� ");
		
	}
}