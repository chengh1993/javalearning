/*
	���ʵ�ֵȼ��ж�
*/

import java.util.Scanner;

public class LvJudge {
	
	public static void main(String[] args) {
		
		//1.��ʾ���뿼�Գɼ�
		System.out.println("�����뿼�Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char Lv = 'F';
		
		//2.�жϵȼ�����ӡ
		if(score < 60) {			//С��60������Ϊdefault
			Lv = 'E';
		} else if(score < 70) {		//61��69��10ȥ�̣��������6
			Lv = 'D';
		} else if(score < 80) {
			Lv = 'C';
		} else if(score < 90) {
			Lv = 'B';
		} else if(score <= 100) {
			Lv = 'A';
		}
		System.out.println("�����ڵĵȼ�Ϊ��" + Lv);
		
		
	}
}