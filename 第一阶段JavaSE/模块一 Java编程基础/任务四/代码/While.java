/*
	���ʵ�ֵ������е��ۼ�
*/

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		System.out.println("��������Ҫ���������n��");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0.0;
		int i = 1;
		
		while(i <= n) {
			sum += (1.0 / i);
			i++;
		}
		
		System.out.println("ǰ"+ n + "��ĺ�Ϊ��" + sum);
		
	}
}