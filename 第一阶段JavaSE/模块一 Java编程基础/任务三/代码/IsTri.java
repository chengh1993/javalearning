/*
	编程实现，使用逻辑运算符判断输入正整数是否为三位数
*/

import java.util.Scanner;

public class IsTri {
	
	public static void main(String[] args) {
		
		//1.提示输入并存入变量
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.判断并输出
		//System.out.println(((num / 100) > 0) && ((num /100) < 10)); 
		System.out.println((num > 99) && (num  < 1000)); 
		
		//使用三目运算符判断是否为三位数
		System.out.println(num + ((num > 99 && num  < 1000)? "是三位数" : "不是三位数")); 
		
	}
}
