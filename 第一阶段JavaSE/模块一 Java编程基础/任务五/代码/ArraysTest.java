/*
	���ʵ�����鹤�����ʹ��
*/

import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String[] args) {
	
	//1.����һ����ʼֵΪ10,20,30,40��50��һλ����
	int[] arr1 = {10, 20, 30, 40, 50};
	//2.ʹ��ԭʼ��ʽ��ӡ�����е�����Ԫ�أ�Ҫ���ӡ��ʽΪ[10,20,30,40,50]
	System.out.print("��һ�������е�Ԫ���У�[");
	for(int i = 0; i < arr1.length; i++) {
		//����ӡԪ�������һ��Ԫ��ʱ����ֱ�Ӵ�ӡԪ�ر�����
		if(arr1.length - 1 == i) {
			System.out.print(arr1[arr1.length - 1]);
		//�����ӡԪ�غ��ӡ���żӿո�
		} else {
			System.out.print(arr1[i] + ", ");
		}
	}
	System.out.print("]");
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//3.ʹ�����鹤����ʵ������������Ԫ�صĴ�ӡ
	System.out.println("��һ�������е�Ԫ���У�" + Arrays.toString(arr1));	//[10, 20, 30, 40, 50]
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//4.����һ������Ϊ5������Ϊint��һλ����
	int[] arr2 = new int[5];
	System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2));	//[0, 0, 0, 0, 0]
	//ʹ�����鹤�����е�fillʵ��������Ԫ�ص���䲢��ӡ
	//��ʾʹ��10���������arr2�е�ÿ��Ԫ�أ�Ҳ����ÿ��Ԫ�ر���ֵΪ10
	Arrays.fill(arr2,10);
	System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2));	//[10, 10, 10, 10, 10]
	
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	//5.����һ������Ϊ5������int�����鲢��ʼ��
	int[] arr3 = new int[5];
	Arrays.fill(arr3,10);
	System.out.println("�����������е�Ԫ���У�" + Arrays.toString(arr3));	//
	//�жϸ������Ƿ�������������Ȳ���ӡ
	System.out.println(Arrays.equals(arr2, arr3));
	System.out.println();
	//�޸�����3�е�Ԫ��
	arr3[4] = 20;
	System.out.println("�����������е�Ԫ���У�" + Arrays.toString(arr3));	//
	System.out.println(Arrays.equals(arr2, arr3));
	System.out.println();
	arr2[3] = 20;
	System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2));
	System.out.println(Arrays.equals(arr2, arr3));
	
	}
}
