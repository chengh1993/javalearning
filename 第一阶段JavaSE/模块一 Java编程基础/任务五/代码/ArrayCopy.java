/*
	编程实现，一位数组之间元素的拷贝
*/
public class ArrayCopy {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		int[] arr1 = {11, 22, 33, 44, 55};
		System.out.print("数组arr1中的元素有：");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		int[] arr2 = new int[3];
		System.out.print("数组arr2中的元素有：");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		/*
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}
		*/
		//可以直接使用java官方提供的拷贝功能
		System.arraycopy(arr1, 1, arr2, 0, 3);	//表示将数组arr1中下标1开始的3个元素拷贝到数组arr2中下标0开始的三个位置
		System.out.print("拷贝后数组arr2中的元素有：");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		//4.笔试考点
		// 表示将变量arr1的数值赋值给arr2，覆盖原来变量arr2中的值
		// 数组名arr1在内存空间中存放的是数据在堆区中的内存地址，赋值后让arr2中存放了arr1所指向的堆区的内存地址
		// 也就是让arr2和arr1指向了同一块堆区空间
		arr2 = arr1;
		//这是在改变指向,是arr2指向arr1中的数据
		System.out.print("拷贝后数组arr2中的元素有：");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		
	}
} 