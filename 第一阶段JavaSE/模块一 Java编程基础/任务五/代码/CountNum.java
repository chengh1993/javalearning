/*
	һά����ͳ�����ֳ��ִ���
*/

import java.util.Scanner;

public class CountNum {
	
	public static void main(String[] args) {
		
		//1.��ʾ�û�����һ�����������ñ�����¼
		System.out.print("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.׼��һ������Ϊ10��Ԫ������int������
		int[] arr = new int[10];
		
		//3.����������е�ÿ�����ֲ�ͳ�Ƶ�������
		int temp = num;
		while(temp > 0) {
			arr[temp%10]++;
			temp /= 10;
		}
		
		//4.��ӡ���ս��
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println("����" + i + "������" + arr[i] + "�Σ�");
			}
		}
	}
}


/*�������Լ�д�Ĵ��룺

import java.util.Scanner;

public class CountNum {
	
	public static void main(String[] args) {
		
		System.out.print("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[10];	//��һ�δ��������д����  int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
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
				System.out.println("����" + i + "������" + arr[i] + "�Σ�");
			}
		}
		
	}
}
*/