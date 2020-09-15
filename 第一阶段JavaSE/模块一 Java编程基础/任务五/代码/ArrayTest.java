/*
	编程实现一维数组的声明和使用
*/
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//1.声明一个长度为2类型为int的一维数组
		//数据类型[] 数组名称 = new 数据类型[数组长度]；
		//int arr1[] = new int[2];	//两种方式从结果上来说是一样的，但本方式不推荐使用
		//int num = 2;				//声明一个初始值为2的变量
		int[] arr1 = new int[2];	//推荐该方式，更容易与变量区分，提高了代码的可读性
		
		//2.打印一维数组的长度以及每个元素的数值
		System.out.println("数组的长度是：" + arr1.length);	//2
		System.out.println("下标为0的元素是：" + arr1[0]);	//0
		System.out.println("下标为1的元素是：" + arr1[1]);	//0
		//System.out.println("下标为2的元素是：" + arr1[3]);	//编译ok，运行发生ArrayIndexOutOfBoundsException数组下标越界异常
		
		System.out.println("---------------------------------------------");
		//3.使用for循环打印数组中的所有元素
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("下标为0的元素是：" + arr1[i]);	//全是0
		}
		
		System.out.println("---------------------------------------------");
		//4.声明一个长度为5类型为double的一维数组
		double[] arr2 = new double[5];
		//打印数组中的每个元素
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("下标为0的元素是：" + arr2[i]);	//全是0
		}
		
		System.out.println("---------------------------------------------");
		//5.声明数组的同时就对数组中的元素进行初始化	静态方式的简化版
		char[] arr3 = {'a','b','c','d'};
		//打印数组中的每个元素
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("下标为0的元素是：" + arr3[i]);	//abcd
		}
		
		System.out.println("---------------------------------------------");
		//6.特殊的方法
		boolean[] arr4 = new boolean[]{true, true, true, false};	//静态模式
		//打印数组中的每个元素
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("下标为0的元素是：" + arr4[i]);	//true true true false
		}
		
		
		
		
		
	}
}