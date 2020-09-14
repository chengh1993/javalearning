/*
	编程实现，使用switch语句判断等级
*/

import java.util.Scanner;

public class SwitchLvJudge {
	
	public static void main(String[] args) {
		
		//1.提示输入考试成绩
		System.out.println("请输入考试成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char Lv = 'F';
		
		//2.使用switch判断并打印
		switch(score / 10) {
			case 10://Lv = 'A';
			case 9: Lv = 'A';break;		//case穿透
			case 8: Lv = 'B';break;
			case 7: Lv = 'C';break;
			case 6: Lv = 'D';break;
			default: Lv = 'E';
		}
		System.out.println("您所在的等级为：" + Lv);
		
		//3.打印一句话
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("世界上最痴情的等待，就是我当case你当switch，或许永远都不会选到自己！");
	}
}