/*
	���ʵ���ַ����͵�ʹ��
*/
public class CharTest {
	
	public static void main(String[] args) {
		
		//1.����һ��char���͵ı���
		char c1 = 'a';	
		//2.��ӡ��������ֵ
		System.out.println("c1 = " + c1);	//c1 = a
		System.out.println("��Ӧ�ı���ǣ�" + (int)c1);	//	��Ӧ�ı���ǣ�97	(int)��ʾ��char���͵�c1ǿ��ת����int���� 	
		
		System.out.println("---------------------------------------------------------");
		//2.����һ��char���͵ı�������ʼ��
		char c2 = 98;
		System.out.println("c2 = " + c2);	//c1 = b	��Ϊc2��char����
		System.out.println("��Ӧ�ı���ǣ�" + (int)c2);		//��Ϊintǿ��ת��
		
		System.out.println("---------------------------------------------------------");
		//3.ʹ��Unicode�ַ�������ʾ����  ���	��Ӧ�ı���ǣ� \u5947\u70b9
		char c3 = '\u5947';
		char c4 = '\u70b9';
		System.out.println("���յĽ���ǣ�" + c3 + c4);		//���յĽ���ǣ����
		
		System.out.println("---------------------------------------------------------");
		//4.�����ַ���ʹ��		//˫���ű������������壺 a.�ַ����Ŀ�ͷ�ͽ�β�ı�־		b.˫��������	\ ת�����ת��ԭ�еĺ���
		System.out.println("�������\"��������������");		//  \" -> "
		System.out.println("�������\'��������������");
		System.out.println("�������\\��������������");
		System.out.println("�������\t��������������");
		System.out.println("�������\n��������������");
		
	}
}