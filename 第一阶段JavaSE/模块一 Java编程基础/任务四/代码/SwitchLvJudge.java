/*
	���ʵ�֣�ʹ��switch����жϵȼ�
*/

import java.util.Scanner;

public class SwitchLvJudge {
	
	public static void main(String[] args) {
		
		//1.��ʾ���뿼�Գɼ�
		System.out.println("�����뿼�Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char Lv = 'F';
		
		//2.ʹ��switch�жϲ���ӡ
		switch(score / 10) {
			case 10://Lv = 'A';
			case 9: Lv = 'A';break;		//case��͸
			case 8: Lv = 'B';break;
			case 7: Lv = 'C';break;
			case 6: Lv = 'D';break;
			default: Lv = 'E';
		}
		System.out.println("�����ڵĵȼ�Ϊ��" + Lv);
		
		//3.��ӡһ�仰
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("�����������ĵȴ��������ҵ�case�㵱switch��������Զ������ѡ���Լ���");
	}
}