/*
	���ʵ�֣���ʾ��������������ʾ����ɼ�����ӡ�� ����༶�ֺܷ�ƽ���ֲ���ӡ
*/

import java.util.Scanner;
import java.util.Arrays;

public class ScoreSum {
	
	public static void main(String[] args) {

		//1.��ʾ����ѧ������������¼
		System.out.print("������ѧ��������");
		Scanner sc = new Scanner(System.in);
		int stnum = sc.nextInt();
		int sum = 0;
		double ave = 0.00;
		
		//2.��������������Ӧ�������鸺���¼ѧ���ĳɼ�
		//�䳤���飺  ����������Ϊ����ĳ��ȣ�������������ĳ��ȿ��Ըı�
		int[] arr = new int[stnum];
		
		//3.��ʾ�û�����ÿ��ѧ���ĳɼ�����¼��������
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�������" + (i+1) + "��ѧ���ĳɼ���");
			arr[i] = sc.nextInt();
			sum += arr[i];
			System.out.println("��" + (i+1) + "��ѧ���ĳɼ��ǣ�" + arr[i]);
			
			System.out.println("---------------------------------------------");
		}
		//4.��ӡ����ѧ���ɼ�
		System.out.print("����ѧ���ĳɼ���");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//5.�����ּܷ�ƽ����
		ave = sum / stnum;
		
		System.out.println("�༶�ܷ��ǣ�" + sum);
		System.out.println("�༶ƽ�����ǣ�" + ave);
		System.out.println("---------------------------------------------");
		//6.������߷ֺ���ͷֲ���ӡ
		System.out.print("����ѧ���ĳɼ���" + Arrays.toString(arr));
		//���ù������е����򷽷������п��Գɼ����д�С��������
		Arrays.sort(arr);
		System.out.print("�����ĳɼ���" + Arrays.toString(arr));
		System.out.println("������߷ֺ���ͷֱַ�Ϊ��" + arr[arr.length-1] + "," + arr[0]);

		System.out.println();
		System.out.println("---------------------------------------------");
		//�������в���ָ��Ԫ�����ڵ��±�λ��
		System.out.println("59���������е��±�λ���ǣ�" + Arrays.binarySearch(arr,59));
		System.out.println("59���������е��±�λ���ǣ�" + Arrays.binarySearch(arr,60));





	
	}
}



/*
public class ScoreSum {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		System.out.print("������ѧ��������");
		Scanner sc = new Scanner(System.in);
		int stnum = sc.nextInt();
		int[] arr = new int[stnum];
		int sum = 0;
		double ave = 0.0;
		
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�������" + (i+1) + "��ѧ���ĳɼ���");
			arr[i] = sc.nextInt();
			sum += arr[i];
			System.out.println("��" + (i+1) + "��ѧ���ĳɼ��ǣ�" + arr[i]);
			
			System.out.println("---------------------------------------------");
		}
		
		ave = sum / stnum;
		
		System.out.println("�༶�ܷ��ǣ�" + sum);
		System.out.println("�༶ƽ�����ǣ�" + ave);
		System.out.println("---------------------------------------------");
	}
}
*/