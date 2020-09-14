/*
	编程实现，switch 实现字符界面
*/

import java.util.Scanner;

public class SwitchMenu {
	
	public static void main(String[] args) {
		
		//1.绘制字符界面
		System.out.println(" ");
		System.out.println("         欢迎来到拉勾教育");
		System.out.println("-------------------------------------");
		System.out.print(" [1]学员系统");		// println里面的ln相当于换行的作用
		System.out.println("    [2]管理员系统");
		System.out.println(" [0]退出系统");
		System.out.println("-------------------------------------");
		System.out.println("请选择要进入的系统：");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		//2.使用switch模拟用户的选择并给出提示
		switch(choose){
			case 1: System.out.println("正在进入 [1]学员系统 ..."); break;
			case 2: System.out.println("正在进入 [2]管理员系统 ..."); break;
			case 0: System.out.println("谢谢使用，下次再见！"); break;
			default:System.out.println("输入有误，请重新输入");
		}
	
	
	}
}