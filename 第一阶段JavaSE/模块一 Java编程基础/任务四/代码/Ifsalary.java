/*
	编程实现，输入薪水，计算个人所得税并打印 
*/

import java.util.Scanner;

public class Ifsalary {
	
	public static void main(String[] args) {
		
		//1.提示输入薪水并存入变量
		System.out.println("请输入本月薪水：");
		Scanner sc = new Scanner(System.in);
		//局部变量： 作用范围是声明开始，到方法体结束
		int salary = sc.nextInt();
		
		//2.计算所得税
		double gainrate = 0.0;
		if(salary <= 5000) {
			 gainrate = 0.0;	//块变量：控制结构内部的声明仅用于当前结构
		} else if(salary > 5000 && salary <= 8000) {
			//gainrate = (salary - 5000) * 0.03;  
			gainrate = (salary - 5000) * 0.03 - 0;
		} else if(salary > 8000 && salary <= 17000) {
			//gainrate = (salary - 8000) * 0.1 + 90;
			gainrate = (salary - 5000) * 0.1 - 210;
		} else if(salary > 17000 && salary <= 30000) {
			gainrate = (salary - 5000) * 0.2 - 1410;
			//gainrate = (salary - 17000) * 0.2 + 990;
		} else if(salary > 30000 && salary <= 40000) {
			gainrate = (salary - 5000) * 0.25 - 2660;
			//gainrate = (salary - 30000) * 0.25 + 3590;
		} else if(salary > 40000 && salary <= 60000) {
			gainrate = (salary - 5000) * 0.3 - 4410;
			//gainrate = (salary - 40000) * 0.3 + 6090;
		} else if(salary > 60000 && salary <= 85000) {
			gainrate = (salary - 5000) * 0.35 - 7160;
			//gainrate = (salary - 60000) * 0.35 + 12090;
		} else {
			gainrate = (salary - 5000) * 0.45 - 15160;
			//gainrate = (salary - 85000) * 0.45 + 20840;
		}
		
		//3.打印所得税
		System.out.println("本月纳税额为：" + gainrate);
		
	}
}