/*
	编程使用dowhile来模拟学习效果的检查
*/

import java.util.Scanner;

public class DoWhileCheck {
	
	public static void main(String[] args) throws Exception{
		
		String msg = null;
		do {
			System.out.println("正在疯狂学习中...");
			Thread.sleep(5000);
			System.out.println("是否合格？（y/n）");
			Scanner sc = new Scanner(System.in);
			msg = sc.next();
		} while(!"y".equals(msg));
		
		System.out.println("恭喜任务合格！");
		
		System.out.println("-------------------------------------------------------");
		
		//典故：十动然拒
		int = 1;
		while(i <= 10000) /* ; */ {
			System.out.println("I love You !");
		}
	}
}