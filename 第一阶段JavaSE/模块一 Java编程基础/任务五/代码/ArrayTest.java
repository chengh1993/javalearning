/*
	���ʵ��һά�����������ʹ��
*/
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//1.����һ������Ϊ2����Ϊint��һά����
		//��������[] �������� = new ��������[���鳤��]��
		//int arr1[] = new int[2];	//���ַ�ʽ�ӽ������˵��һ���ģ�������ʽ���Ƽ�ʹ��
		//int num = 2;				//����һ����ʼֵΪ2�ı���
		int[] arr1 = new int[2];	//�Ƽ��÷�ʽ����������������֣�����˴���Ŀɶ���
		
		//2.��ӡһά����ĳ����Լ�ÿ��Ԫ�ص���ֵ
		System.out.println("����ĳ����ǣ�" + arr1.length);	//2
		System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr1[0]);	//0
		System.out.println("�±�Ϊ1��Ԫ���ǣ�" + arr1[1]);	//0
		//System.out.println("�±�Ϊ2��Ԫ���ǣ�" + arr1[3]);	//����ok�����з���ArrayIndexOutOfBoundsException�����±�Խ���쳣
		
		System.out.println("---------------------------------------------");
		//3.ʹ��forѭ����ӡ�����е�����Ԫ��
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr1[i]);	//ȫ��0
		}
		
		System.out.println("---------------------------------------------");
		//4.����һ������Ϊ5����Ϊdouble��һά����
		double[] arr2 = new double[5];
		//��ӡ�����е�ÿ��Ԫ��
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr2[i]);	//ȫ��0
		}
		
		System.out.println("---------------------------------------------");
		//5.���������ͬʱ�Ͷ������е�Ԫ�ؽ��г�ʼ��	��̬��ʽ�ļ򻯰�
		char[] arr3 = {'a','b','c','d'};
		//��ӡ�����е�ÿ��Ԫ��
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr3[i]);	//abcd
		}
		
		System.out.println("---------------------------------------------");
		//6.����ķ���
		boolean[] arr4 = new boolean[]{true, true, true, false};	//��̬ģʽ
		//��ӡ�����е�ÿ��Ԫ��
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr4[i]);	//true true true false
		}
		
		
		
		
		
	}
}