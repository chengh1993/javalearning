/*
	编程实现，输入任意正整数，反向输出
*/

import java.util.Scanner;

public class ReverNum {
	
	public static void main(String[] args) {
		
		/*
		System.out.println("请输入任意正整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int N1;
		
		while(num % 10 != 0) {
			N1 = num % 10;
			num = num / 10;
			sum = sum * 10 + N1;
		}
		
		System.out.println("反向输出的结果为：" + sum);
		*/
		System.out.println("请输入任意正整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0) {
			System.out.print(num % 10);	//拆分个位数
			num /= 10;	//丢弃个位数
		}
		
	}
}