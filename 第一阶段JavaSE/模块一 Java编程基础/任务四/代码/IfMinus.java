/*
	编程实现，提示输入一个整数，使用if else判断正负并输出
*/

import java.util.Scanner;

public class IfMinus {
	
	public static void main(String[] args) {
		
		//1.提示输入整数存入变量
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.判断正负并输出
		/*if(num < 0) {
			System.out.println(num + "是一个负数");
		} else {
			System.out.println(num + "是一个非负数");
		}
		*/
		
		//3.判断是正是负还是0
		if(num < 0) {
			System.out.println(num + "是一个负数");
		} else {
			if(0 == num) {
				System.out.println(num + "是零");
			} else {
				System.out.println(num + "是一个正数");
			}
		}
		
		/*if(num < 0) {
			System.out.println(num + "是一个负数");
		} else if (0 == num) { 
			System.out.println(num + "是零");
		} else {
			System.out.println(num + "是一个正数");
		}
		*/
		
		
	}
}