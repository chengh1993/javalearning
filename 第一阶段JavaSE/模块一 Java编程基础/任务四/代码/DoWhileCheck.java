/*
	���ʹ��dowhile��ģ��ѧϰЧ���ļ��
*/

import java.util.Scanner;

public class DoWhileCheck {
	
	public static void main(String[] args) throws Exception{
		
		String msg = null;
		do {
			System.out.println("���ڷ��ѧϰ��...");
			Thread.sleep(5000);
			System.out.println("�Ƿ�ϸ񣿣�y/n��");
			Scanner sc = new Scanner(System.in);
			msg = sc.next();
		} while(!"y".equals(msg));
		
		System.out.println("��ϲ����ϸ�");
		
		System.out.println("-------------------------------------------------------");
		
		//��ʣ�ʮ��Ȼ��
		int = 1;
		while(i <= 10000) /* ; */ {
			System.out.println("I love You !");
		}
	}
}