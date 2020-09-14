/*
	编程，打印三位数中所有水仙花数
*/
public class ForFlower {
	
	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("三位数中所有水仙花数是：" );
		for(int i = 100; i <= 999; i++) {
			int i1 = i / 100;
			int i2 = (i % 100) / 10;
			int i3 = i % 10;
			if(i == i1 * i1 * i1 + i2 * i2 * i2 + i3 * i3 * i3) {
				System.out.print(" " + i);
				count++;
				if(5 == count) {
					System.out.println("");
					count = 0;
				}
			}
		}	
		
		
	}
}