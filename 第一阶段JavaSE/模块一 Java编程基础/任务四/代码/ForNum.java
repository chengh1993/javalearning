/*
	���ʵ�֣���ӡ1-100����������
*/
public class ForNum {
	
	public static void main(String[] args) {
		
		//��ʽһ���������������ӡ
		int count = 0;
		for(int i = 1; i < 101; i++) {
			if((i % 2) != 0) {
				System.out.print(i + " ");
				count++;
				if(10 == count) {
					System.out.println("");
					count = 0;
				}
			}
		}
		
		System.out.println("------------------------------------");
		//��ʽ�������ݵȲ����д�ӡ
		for(int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
			count++;
			if(10 == count) {
				System.out.println("");
				count = 0;
			}
		}
		
		System.out.println("------------------------------------");
		//��ʽ����
		for(int i = 1; i <= 50; i++) {
			System.out.print(i * 2 - 1 + " ");
			count++;
			if(10 == count) {
				System.out.println("");
				count = 0;
			}
		}
		
		
		
	}
}