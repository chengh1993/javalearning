/*
	������ʾ�û����������ݣ�bye�˳�
*/

import java.util.Scanner;

public class ForBye {
	
	public static void main(String[] args) {
		
		/*
		System.out.println("�����������ݣ�");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("��������ǣ�" + str);
		
		for( ; !("bye".equals(str)); ) {
			System.out.println("�����������ݣ�");
			str = sc.next();
			System.out.println("��������ǣ�" + str);
		}
		*/ 
		
		//5.����һ��boolean���ͱ�����Ϊ���ͷ���־
		boolean flag = true;
		
		//4.ʹ������ѭ����ģ�ⲻ�ϵ�����
		for(;;) {
			//1.��ʾ�û�����Ҫ���͵��������ݲ�ʹ�ñ�����¼
			System.out.println("��" + (flag? "����" : "����") + "���������ݣ�");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			//2.�ж��Ƿ���bye�������������
			if("bye".equals(str)) {
				System.out.println("���˳���ллʹ�ã�");
				break;
			}
			//3.�������ӡ���������
			//System.out.println((flag? "���������ǣ�") + str);
			System.out.println((flag? "����˵��" : "����˵��") + str + "\n\n\n");
			flag = !flag;
		}
		
	}
}