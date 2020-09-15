/*
	一维数组统计数字出现次数
*/

import java.util.Scanner;

public class CountNum {
	
	public static void main(String[] args) {
		
		//1.提示用户输入一个正整数并用变量记录
		System.out.print("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.准备一个长度为10，元素类型int的数组
		int[] arr = new int[10];
		
		//3.拆分正整数中的每个数字并统计到数组中
		int temp = num;
		while(temp > 0) {
			arr[temp%10]++;
			temp /= 10;
		}
		
		//4.打印最终结果
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println("数字" + i + "出现了" + arr[i] + "次！");
			}
		}
	}
}


/*以下是自己写的代码：

import java.util.Scanner;

public class CountNum {
	
	public static void main(String[] args) {
		
		System.out.print("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[10];	//第一次错误把这里写成了  int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
		int num1 = 0;
		
		for(;;) {
			num1 = num % 10;
			num /= 10;
			arr[num1]++;
			if(0 == num) {
				break;
			}
		}
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println("数字" + i + "出现了" + arr[i] + "次！");
			}
		}
		
	}
}
*/