/*
	编程实现一维数组的增删改查操作
*/
public class ArrayOp {
	
	public static void main(String[] args) {
		 
		//1.声明一个长度为5数据类型为int的一维数组
		int[] arr1 = new int[5];
		//打印数组中所有元素的数值
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("第" + i + "个元素的数值为：" + arr1[i]);
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//2.将11 22 33 44 依次对数组中的前四个元素赋值
		/*
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 44;
		*/
		for(int i = 0; i < arr1.length - 1 ; i++) {
			arr1[i] = (i + 1) * 11; 
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("第" + i + "个元素的数值为：" + arr1[i]);
		}
		System.out.println();
		
		//3.将数据55插入到下标为0的位置，原有元素向后移动
		/*
		arr1[4] = arr1[3];
		arr1[3] = arr1[2];
		arr1[2] = arr1[1];
		arr1[1] = arr1[0];
		arr1[0] = 55;
		*/
		/*
		System.out.println("---------------------------------------------");
		for(int i = 0; i < arr1.length - 1; i++) {
			arr1[4 - i] = arr1[3 - i];
		}
		arr1[0] = 55;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("第" + i + "个元素的数值为：" + arr1[i]);
		}
		System.out.println();
		*/
		
		System.out.println("---------------------------------------------");
		for(int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i - 1];
		}
		arr1[0] = 55;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("第" + i + "个元素的数值为：" + arr1[i]);
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//4.将数据55从数组中删除，即后续元素向前移动，最后一个位置置为0
		for(int i = 0; i < arr1.length - 1; i++) {
			arr1[i] = arr1[i + 1];
		}
		arr1[4] = 0;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("第" + i + "个元素的数值为：" + arr1[i]);
		}
		System.out.println();
		
		
		
		
		
	 }
}