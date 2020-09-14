/*
	编程实现，打印1-100的所有奇数
*/
public class ForNum {
	
	public static void main(String[] args) {
		
		//方式一：根据奇数概念打印
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
		//方式二：根据等差数列打印
		for(int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
			count++;
			if(10 == count) {
				System.out.println("");
				count = 0;
			}
		}
		
		System.out.println("------------------------------------");
		//方式三：
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