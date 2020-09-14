/*
	编程使用for循环实现猜数字游戏
*/

import java.util.Random;
import java.util.Scanner;

public class ForGuess {
	
	public static void main(String[] args) {
		
		//1.生成1~100之间的随机数并用变量记录
		Random ra = new Random();
		int temp = ra.nextInt(100) + 1;
		//System.out.println("temp = " + temp);

		//4.声明一个int变量来统计用户猜测的次数
		int count = 0;
	
		//2.提示输入1~100之间猜测的整数并使用变量记录
		System.out.println("\n请输入一个猜测数（1~100之间）：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		//3.使用用户输入的整数与随机数之间比较大小，并给出对应的提示
		for(;;) {
			if(num > temp) {
				System.out.println("太...太大了，再试一次吧!\n");
				num = sc.nextInt();
				count++;
			} else if(num < temp) {
				System.out.println("太...太小了,再试一次吧!\n");
				num = sc.nextInt();
				count++;
			} else {
				count++;
				System.out.println("恭喜，大小刚刚好！您一共尝试了" + count +"次\n\n");
				break;
			}
		}
		
		if(1 == count) {
			System.out.println("你果然棒棒");
		} else if(count <= 6) {
			System.out.println("666,继续加油！");
		} else {
			System.out.println("菜鸡，多来几次吧");
		}
	}
}