/*
	���ʹ��if else��֧�ṹ��ģ�⿼�Գɼ���ѯ����
*/

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		//1.��ʾ�û����벢�������
		System.out.println("���������Ŀ��Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//2.�ж��Ƿ�ϸ񲢸�����ʾ
		if(score >= 60) {
			System.out.println("��ϲ�㿼��ͨ����");
		} else {
			System.out.println("��ѧ����������");
		}
		//3.��ӡһ�仰
		System.out.println("��������ңԶ�ľ��벻������������������if����else���ƺ�һֱ���ȴ����Զ���� ");
		
	}
}