/*
	���ʵ��һά�������ɾ�Ĳ����
*/
public class ArrayOp {
	
	public static void main(String[] args) {
		 
		//1.����һ������Ϊ5��������Ϊint��һά����
		int[] arr1 = new int[5];
		//��ӡ����������Ԫ�ص���ֵ
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("��" + i + "��Ԫ�ص���ֵΪ��" + arr1[i]);
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//2.��11 22 33 44 ���ζ������е�ǰ�ĸ�Ԫ�ظ�ֵ
		/*
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 44;
		*/
		for(int i = 0; i < arr1.length - 1 ; i++) {
			arr1[i] = (i + 1) * 11; 
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("��" + i + "��Ԫ�ص���ֵΪ��" + arr1[i]);
		}
		System.out.println();
		
		//3.������55���뵽�±�Ϊ0��λ�ã�ԭ��Ԫ������ƶ�
		/*
		arr1[4] = arr1[3];
		arr1[3] = arr1[2];
		arr1[2] = arr1[1];
		arr1[1] = arr1[0];
		arr1[0] = 55;
		*/
		/*
		System.out.println("---------------------------------------------");
		for(int i = 0; i < arr1.length - 1; i++) {
			arr1[4 - i] = arr1[3 - i];
		}
		arr1[0] = 55;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("��" + i + "��Ԫ�ص���ֵΪ��" + arr1[i]);
		}
		System.out.println();
		*/
		
		System.out.println("---------------------------------------------");
		for(int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i - 1];
		}
		arr1[0] = 55;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("��" + i + "��Ԫ�ص���ֵΪ��" + arr1[i]);
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		//4.������55��������ɾ����������Ԫ����ǰ�ƶ������һ��λ����Ϊ0
		for(int i = 0; i < arr1.length - 1; i++) {
			arr1[i] = arr1[i + 1];
		}
		arr1[4] = 0;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("��" + i + "��Ԫ�ص���ֵΪ��" + arr1[i]);
		}
		System.out.println();
		
		
		
		
		
	 }
}