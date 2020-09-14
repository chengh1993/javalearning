/*
	不断提示用户输入新内容，bye退出
*/

import java.util.Scanner;

public class ForBye {
	
	public static void main(String[] args) {
		
		/*
		System.out.println("请输入新内容：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("您输入的是：" + str);
		
		for( ; !("bye".equals(str)); ) {
			System.out.println("请输入新内容：");
			str = sc.next();
			System.out.println("您输入的是：" + str);
		}
		*/ 
		
		//5.声明一个boolean类型变量作为发送方标志
		boolean flag = true;
		
		//4.使用无限循环来模拟不断地聊天
		for(;;) {
			//1.提示用户输入要发送的聊天内容并使用变量记录
			System.out.println("请" + (flag? "张三" : "李四") + "输入新内容：");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			//2.判断是否是bye，是则结束聊天
			if("bye".equals(str)) {
				System.out.println("已退出，谢谢使用！");
				break;
			}
			//3.不是则打印输入的内容
			//System.out.println((flag? "聊天内容是：") + str);
			System.out.println((flag? "张三说：" : "李四说：") + str + "\n\n\n");
			flag = !flag;
		}
		
	}
}