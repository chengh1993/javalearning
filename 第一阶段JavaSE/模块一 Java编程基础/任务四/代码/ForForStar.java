/*
	编程使用双重for打印星星
*/
public class ForForStar {
	
	public static void main(String[] args) {
		
		//1.打印第1个星星图
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println();
		
		//2.打印第2个星星图
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		System.out.println();
		
		//3.打印第3个星星图
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		System.out.println();
		
		//4.打印第4个星星图
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