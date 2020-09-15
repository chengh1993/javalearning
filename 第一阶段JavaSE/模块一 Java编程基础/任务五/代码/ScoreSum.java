/*
	编程实现，提示输入人数，再提示输入成绩并打印， 计算班级总分和平均分并打印
*/

import java.util.Scanner;
import java.util.Arrays;

public class ScoreSum {
	
	public static void main(String[] args) {

		//1.提示输入学生人数，并记录
		System.out.print("请输入学生人数：");
		Scanner sc = new Scanner(System.in);
		int stnum = sc.nextInt();
		int sum = 0;
		double ave = 0.00;
		
		//2.根据人数声明对应长度数组负责记录学生的成绩
		//变长数组：  变量可以作为数组的长度，但绝不是数组的长度可以改变
		int[] arr = new int[stnum];
		
		//3.提示用户输入每个学生的成绩并记录在数组中
		for(int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i+1) + "名学生的成绩：");
			arr[i] = sc.nextInt();
			sum += arr[i];
			System.out.println("第" + (i+1) + "名学生的成绩是：" + arr[i]);
			
			System.out.println("---------------------------------------------");
		}
		//4.打印所有学生成绩
		System.out.print("本班学生的成绩：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//5.计算总分及平均分
		ave = sum / stnum;
		
		System.out.println("班级总分是：" + sum);
		System.out.println("班级平均分是：" + ave);
		System.out.println("---------------------------------------------");
		//6.查找最高分和最低分并打印
		System.out.print("本班学生的成绩：" + Arrays.toString(arr));
		//调用工具类中的排序方法对所有考试成绩进行从小到大排序
		Arrays.sort(arr);
		System.out.print("排序后的成绩：" + Arrays.toString(arr));
		System.out.println("本班最高分和最低分分别为：" + arr[arr.length-1] + "," + arr[0]);

		System.out.println();
		System.out.println("---------------------------------------------");
		//从数组中查找指定元素所在的下标位置
		System.out.println("59分在数组中的下标位置是：" + Arrays.binarySearch(arr,59));
		System.out.println("59分在数组中的下标位置是：" + Arrays.binarySearch(arr,60));





	
	}
}



/*
public class ScoreSum {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		System.out.print("请输入学生人数：");
		Scanner sc = new Scanner(System.in);
		int stnum = sc.nextInt();
		int[] arr = new int[stnum];
		int sum = 0;
		double ave = 0.0;
		
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i+1) + "名学生的成绩：");
			arr[i] = sc.nextInt();
			sum += arr[i];
			System.out.println("第" + (i+1) + "名学生的成绩是：" + arr[i]);
			
			System.out.println("---------------------------------------------");
		}
		
		ave = sum / stnum;
		
		System.out.println("班级总分是：" + sum);
		System.out.println("班级平均分是：" + ave);
		System.out.println("---------------------------------------------");
	}
}
*/