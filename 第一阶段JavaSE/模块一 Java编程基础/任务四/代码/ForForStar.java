/*
	���ʹ��˫��for��ӡ����
*/
public class ForForStar {
	
	public static void main(String[] args) {
		
		//1.��ӡ��1������ͼ
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println();
		
		//2.��ӡ��2������ͼ
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		System.out.println();
		
		//3.��ӡ��3������ͼ
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		System.out.println();
		
		//4.��ӡ��4������ͼ
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}