/*
	编程实现 if    else if		else分支结构的使用，模拟购票
*/

import java.util.Scanner;

public class IfElseIfElse {
	
	public static void main(String[] args) {
		
		//1.提示输入身份信息并记入变量
		System.out.println("请输入您的身份信息：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//判断身份信息
		if ("军人".equals(str)) {
			System.out.println("免费乘坐");
		} else if("学生".equals(str) ) {
			System.out.println("半价购票");
		} else {
			System.out.println("请购买全票");
		}
		
		//3.打印一句话
		System.out.println("坐上了火车去拉萨，去看那美丽的布达拉 ");
		
	}
}