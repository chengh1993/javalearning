/*
	���ʹ��forѭ��ʵ�ֲ�������Ϸ
*/

import java.util.Random;
import java.util.Scanner;

public class ForGuess {
	
	public static void main(String[] args) {
		
		//1.����1~100֮�����������ñ�����¼
		Random ra = new Random();
		int temp = ra.nextInt(100) + 1;
		//System.out.println("temp = " + temp);

		//4.����һ��int������ͳ���û��²�Ĵ���
		int count = 0;
	
		//2.��ʾ����1~100֮��²��������ʹ�ñ�����¼
		System.out.println("\n������һ���²�����1~100֮�䣩��");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		//3.ʹ���û�����������������֮��Ƚϴ�С����������Ӧ����ʾ
		for(;;) {
			if(num > temp) {
				System.out.println("̫...̫���ˣ�����һ�ΰ�!\n");
				num = sc.nextInt();
				count++;
			} else if(num < temp) {
				System.out.println("̫...̫С��,����һ�ΰ�!\n");
				num = sc.nextInt();
				count++;
			} else {
				count++;
				System.out.println("��ϲ����С�ոպã���һ��������" + count +"��\n\n");
				break;
			}
		}
		
		if(1 == count) {
			System.out.println("���Ȼ����");
		} else if(count <= 6) {
			System.out.println("666,�������ͣ�");
		} else {
			System.out.println("�˼����������ΰ�");
		}
	}
}