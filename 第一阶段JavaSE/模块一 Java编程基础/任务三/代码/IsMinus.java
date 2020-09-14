/*
	编程实现使用关系运算符判断是否为负数，是打印true，否打印false
*/

import java.util.Scanner;

public class IsMinus {
	
	public static void main(String[] args) {
		
		//1.提示用户输入一个整数，并存入变量中
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		//2.判断是否是负数
		boolean b1 = num < 0;
		//3.打印结果
		System.out.println("判断结果为：" + b1);
		//可以直接打印结果
		System.out.println(num < 0);
		
	}
}