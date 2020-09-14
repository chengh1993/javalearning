/*
	打印2~100之间所有的素数
*/
public class ForForPrime {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
			boolean flag = true;
			//针对每一个当前的整数都要判断是否是素数
			//判断方法为：2到 它本身-1之间的所有整数都无法整除，则为素数
			for(int j = 2; j <= Math.sqrt(i); j++) {
			//只需要判断2到该数的平方根即可
			//for(int j = 2; j <= i - 1; j++) {
				if(0 == i % j) {
					flag = false;
					//System.out.println(i + "不是素数");
					break;
				}
			}
			if(flag) {
				System.out.println(i + "是素数");
			}
		}
			
		System.out.println("------------------------------------------------------");
	}
}