/*
	编程实现，1到10000的累加并打印
*/
public class ForSum {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 10000; i++) {
			sum += i;
		}
		System.out.println("1到10000的和为：" + sum);
		
	}
}