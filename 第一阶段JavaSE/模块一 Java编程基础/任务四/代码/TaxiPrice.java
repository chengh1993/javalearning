/*
	编程实现，出租车计费系统
*/

import java.util.Scanner;

public class TaxiPrice {
	
	public static void main(String[] args) {
		
		//1.提示输入公里数和等候秒数存入变量
		System.out.println("请输入公里数和等候秒数：");
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int sec = sc.nextInt();
		int kmprice,secprice;
		
		//2.计算费用
		if(km <= 3) {
			kmprice = 13; 
		} else if(km > 3 && km <= 15) {	//这里可以写成  else(km <= 15),不加前面的限制也可
			kmprice = (km - 3) * 2 + 13;
		} else {
			kmprice = (km - 15) *3 + 24 + 13;
		}
		secprice = sec / 150;
		
		//3.打印车费
		System.out.println(km + "公里且等候时间" + sec + "秒，总计车费为：" + (secprice + kmprice));
	}
}