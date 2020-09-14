/*
	编程实现，提示用户输入两个整数，使用if分支结构找到最大值并打印出来
*/

import java.util.Scanner;

public class IfMax {
	
	public static void main(String[] args) {
		
		//1.提示用户输入，并存入两个变量
		System.out.println("请输入两个整数：");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//2.查找最大值并打印
		/*if(num1 >= num2) {
			System.out.println("最大值为：" + num1);
		}
		if(num2 > num1) {
			System.out.println("最大值为：" + num2);
		}
		*/
		
		//方式二：假设第一个最大并记录
		int max = num1;
		
		if(num2 >= max) {
			max = num2;
		}
		System.out.println("最大值为：" + max);
		
		
		
		
	}
}