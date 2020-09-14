/*
	编程实现，使用for打印1~20之间所有整数，遇到5的倍数则跳过不打印
*/
public class ForJump5 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			if(0 == i % 5) {
				continue;
			}
			System.out.println("i = " + i);
		}
		
	}
}