/*
	���ʵ�֣�һλ����֮��Ԫ�صĿ���
*/
public class ArrayCopy {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		int[] arr1 = {11, 22, 33, 44, 55};
		System.out.print("����arr1�е�Ԫ���У�");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		int[] arr2 = new int[3];
		System.out.print("����arr2�е�Ԫ���У�");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		/*
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}
		*/
		//����ֱ��ʹ��java�ٷ��ṩ�Ŀ�������
		System.arraycopy(arr1, 1, arr2, 0, 3);	//��ʾ������arr1���±�1��ʼ��3��Ԫ�ؿ���������arr2���±�0��ʼ������λ��
		System.out.print("����������arr2�е�Ԫ���У�");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		//4.���Կ���
		// ��ʾ������arr1����ֵ��ֵ��arr2������ԭ������arr2�е�ֵ
		// ������arr1���ڴ�ռ��д�ŵ��������ڶ����е��ڴ��ַ����ֵ����arr2�д����arr1��ָ��Ķ������ڴ��ַ
		// Ҳ������arr2��arr1ָ����ͬһ������ռ�
		arr2 = arr1;
		//�����ڸı�ָ��,��arr2ָ��arr1�е�����
		System.out.print("����������arr2�е�Ԫ���У�");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		
	}
} 