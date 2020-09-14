/*
	编程实现等级判断
*/

import java.util.Scanner;

public class LvJudge {
	
	public static void main(String[] args) {
		
		//1.提示输入考试成绩
		System.out.println("请输入考试成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char Lv = 'F';
		
		//2.判断等级并打印
		if(score < 60) {			//小于60的设置为default
			Lv = 'E';
		} else if(score < 70) {		//61到69对10去商，结果都是6
			Lv = 'D';
		} else if(score < 80) {
			Lv = 'C';
		} else if(score < 90) {
			Lv = 'B';
		} else if(score <= 100) {
			Lv = 'A';
		}
		System.out.println("您所在的等级为：" + Lv);
		
		
	}
}