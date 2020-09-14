/*
	编程实现输入秒数，输出小时分钟秒数
*/

import java.util.Scanner;

public class TimerTransByself {
	
	public static void main(String[] args) {
		
		//声明一个变量存放输入的秒数，声明三个变量分别存放输出的小时分钟秒数
		// int s_in;	java可以在使用时定义，随用随声明
		//int h_out, m_out, s_out;
		//提示用户输入秒数
		System.out.println("请输入秒数：");
		//创建一个扫描器来获得输入的数字
		Scanner sc = new Scanner(System.in);
		//通过扫描器读取一个数字存放在s_in中
		int s_in = sc.nextInt();
		//计算秒数并存在s_out中
		int s_out = s_in % 60;
		//计算分钟数并存在mm_out中
		int m_out = ((s_in - s_out) % 3600) / 60;
		int h_out = s_in / 3600;
		
		System.out.println(s_in + "秒转换后为" + h_out + "小时" + m_out + "分" + s_out + "秒");
		
		
	}
}