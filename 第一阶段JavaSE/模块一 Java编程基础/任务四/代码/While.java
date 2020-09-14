/*
	编程实现调和数列的累加
*/

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		System.out.println("请输入想要计算的项数n：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0.0;
		int i = 1;
		
		while(i <= n) {
			sum += (1.0 / i);
			i++;
		}
		
		System.out.println("前"+ n + "项的和为：" + sum);
		
	}
}