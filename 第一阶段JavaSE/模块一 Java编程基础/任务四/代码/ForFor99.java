/*
	ʹ��˫��for��ӡ99�˷���
*/
public class ForFor99 {
	
	public static void main(String[] args) {
	
	System.out.println("-----------------------------------------------------------------------");
	System.out.println();
	//1.ʹ�����for���ƴ�ӡ��������һ��9��
	outer: for(int i = 1; i <= 9; i++) {
		//2.���ڲ�for���ƴ�ӡ�����������9�У��������뵱ǰ�������
		for(int j = 1; j <= i; j++) {
			//3.ƴ�ӽ��
			System.out.print(i + "*" + j + "=" + (i * j) + "  " );
			//4.��ӡ��6*6 = 36�����������ӡ 
			if(6 == j) {
				//break;	//��Ҫ��������ѭ�������ùؼ���ֻ��������ǰ����ѭ��
				break outer;	//��ʾ������������ѭ��
			}
		}
		System.out.println();
		
		/*if(6 == i) {
			break;
		}*/
	}
	
	System.out.println();
	System.out.println("-----------------------------------------------------------------------");
	System.out.println();
	for(int i = 1; i <= 9; i++) {
		for(int j = 1; j <= 10 - i; j++) {
			System.out.print(i + "*" + j + "=" + (i * j) + "  " );
		}
		System.out.println();
	}

		
	System.out.println("-------------------------------------");
	System.out.println();	
	for(int i = 1; i <= 9; i++) {
		for(int k = 1; k <= 9 - i; k++){
			System.out.print("        ");
		}
		for(int j = 1; j <= i; j++) {
			System.out.print(i + "*" + j + "=" + (i * j) + "  " );
		}
		System.out.println();
	}
	
	
	System.out.println("-------------------------------------");
	System.out.println();
	for(int i = 1; i <= 9; i++) {
		for(int k = 1; k <= i - 1; k++){
			System.out.print("        ");
		}
		for(int j = i; j <= 9; j++) {
			System.out.print(i + "*" + j + "=" + (i * j) + "  " );
		}
		System.out.println();
	}
	
	
	
	
	}
}