/*
	编程使用if else分支结构来模拟考试成绩查询过程
*/

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		//1.提示用户输入并记入变量
		System.out.println("请输入您的考试成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//2.判断是否合格并给出提示
		if(score >= 60) {
			System.out.println("恭喜你考试通过了");
		} else {
			System.out.println("下学期来补考吧");
		}
		//3.打印一句话
		System.out.println("世界上最遥远的距离不是生与死，而是你在if我在else，似乎一直相伴却又永远分离 ");
		
	}
}