/*
	���ʵ���������������ʹ��
*/
public class SelfTest {
	
	public static void main(String[] args) {
		
		//1.����һ��int���͵ı�������ʼ��
		int ia = 10; 
		//2.��ӡ��������ֵ
		System.out.println("ia = " + ia); 	//ia = 10
		
		System.out.println("----------------------------------");
		//3.ʵ���������������ʹ��
		//��ʾ�ñ���ia�������ֵ��1��������ԭ��ֵ
		ia++;
		System.out.println("ia = " + ia); 	//ia = 11
		
		//��ʾ�ñ���ia�������ֵ��1��������ԭ��ֵ
		++ia;
		System.out.println("ia = " + ia); 	//ia = 12
		
		//��ʾ�ñ���ia�������ֵ��1��������ԭ��ֵ
		--ia;
		System.out.println("ia = " + ia); 	//ia = 11
		
		//��ʾ�ñ���ia�������ֵ��1��������ԭ��ֵ
		ia--;
		System.out.println("ia = " + ia); 	//ia = 10
		
		System.out.println("----------------------------------");
		//4.�򵥵ı任
		//���� ia++ ����б��ʽ�� ia�в�����/����	Ҳ����ia++��ia��ʾ��ͬ���壬��ռ���ڴ�ռ�	Ӧ�ò�ͬ
		//����Ĵ������ڴ�ӡ���ʽ�Ľ�����Ǳ����Ľ��
		//��++��ʾ����ֵ������
		System.out.println(ia++);			//10
		System.out.println("ia = " + ia);	//11
		//ǰ++��ʾ����������ֵ
		System.out.println(++ia);			//12
		System.out.println("ia = " + ia);	//12

		System.out.println("----------------------------------");
		//5.���Կ���
		int ib = ia ++;
		System.out.println("ib = " + ib);	//12
		System.out.println("ia = " + ia);	//13
		int ic = ++ia;
		System.out.println("ic = " + ic);	//14
		System.out.println("ia = " + ia); 	//14
		//					14	+	16	
		System.out.println(ia++ + ++ia);	//30
		System.out.println("ia = " + ia);	//16
		
		
		
	
	}
}