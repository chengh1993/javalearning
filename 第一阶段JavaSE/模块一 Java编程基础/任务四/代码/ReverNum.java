/*
	���ʵ�֣������������������������
*/

import java.util.Scanner;

public class ReverNum {
	
	public static void main(String[] args) {
		
		/*
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int N1;
		
		while(num % 10 != 0) {
			N1 = num % 10;
			num = num / 10;
			sum = sum * 10 + N1;
		}
		
		System.out.println("��������Ľ��Ϊ��" + sum);
		*/
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0) {
			System.out.print(num % 10);	//��ָ�λ��
			num /= 10;	//������λ��
		}
		
	}
}