/*
	���ʹ��if��֧�ṹģ�����������Ĺ���
*/
 
 import java.util.Scanner;
 
 public class IfTest {
	 
	 public static void main(String[] args) {
		 
		//1.��ʾ�������䲢�������
		System.out.println("�������������䣺");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		//2.�ж��Ƿ���겢������ʾ
		if (age >= 18) {
			System.out.println("���ĵ����������ҳ...");
		}
		//3.��ӡһ�仰
		System.out.println("���õ�ʱ�����Ƕ��ݵ�");
		 
	 }
 }