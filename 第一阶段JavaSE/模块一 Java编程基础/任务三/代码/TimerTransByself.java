/*
	���ʵ���������������Сʱ��������
*/

import java.util.Scanner;

public class TimerTransByself {
	
	public static void main(String[] args) {
		
		//����һ���������������������������������ֱ��������Сʱ��������
		// int s_in;	java������ʹ��ʱ���壬����������
		//int h_out, m_out, s_out;
		//��ʾ�û���������
		System.out.println("������������");
		//����һ��ɨ������������������
		Scanner sc = new Scanner(System.in);
		//ͨ��ɨ������ȡһ�����ִ����s_in��
		int s_in = sc.nextInt();
		//��������������s_out��
		int s_out = s_in % 60;
		//���������������mm_out��
		int m_out = ((s_in - s_out) % 3600) / 60;
		int h_out = s_in / 3600;
		
		System.out.println(s_in + "��ת����Ϊ" + h_out + "Сʱ" + m_out + "��" + s_out + "��");
		
		
	}
}