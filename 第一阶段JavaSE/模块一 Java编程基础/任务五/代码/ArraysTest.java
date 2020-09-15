/*
	编程实现数组工具类的使用
*/

import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String[] args) {
	
	//1.声明一个初始值为10,20,30,40，50的一位数组
	int[] arr1 = {10, 20, 30, 40, 50};
	//2.使用原始方式打印数组中的所有元素，要求打印格式为[10,20,30,40,50]
	System.out.print("第一个数组中的元素有：[");
	for(int i = 0; i < arr1.length; i++) {
		//当打印元素是最后一个元素时，则直接打印元素本身即可
		if(arr1.length - 1 == i) {
			System.out.print(arr1[arr1.length - 1]);
		//否则打印元素后打印逗号加空格
		} else {
			System.out.print(arr1[i] + ", ");
		}
	}
	System.out.print("]");
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//3.使用数组工具类实现数组中所有元素的打印
	System.out.println("第一个数组中的元素有：" + Arrays.toString(arr1));	//[10, 20, 30, 40, 50]
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//4.声明一个长度为5的类型为int的一位数组
	int[] arr2 = new int[5];
	System.out.println("第二个数组中的元素有：" + Arrays.toString(arr2));	//[0, 0, 0, 0, 0]
	//使用数组工具类中的fill实现数组中元素的填充并打印
	//表示使用10来填充数组arr2中的每个元素，也就是每个元素被赋值为10
	Arrays.fill(arr2,10);
	System.out.println("第二个数组中的元素有：" + Arrays.toString(arr2));	//[10, 10, 10, 10, 10]
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//5.声明一个长度为5，类型int的数组并初始化
	int[] arr3 = new int[5];
	Arrays.fill(arr3,10);
	System.out.println("第三个数组中的元素有：" + Arrays.toString(arr3));	//
	//判断该数组是否与上述数组相等并打印
	System.out.println(Arrays.equals(arr2, arr3));
	System.out.println();
	//修改数组3中的元素
	arr3[4] = 20;
	System.out.println("第三个数组中的元素有：" + Arrays.toString(arr3));	//
	System.out.println(Arrays.equals(arr2, arr3));
	System.out.println();
	arr2[3] = 20;
	System.out.println("第二个数组中的元素有：" + Arrays.toString(arr2));
	System.out.println(Arrays.equals(arr2, arr3));
	
	}
}
