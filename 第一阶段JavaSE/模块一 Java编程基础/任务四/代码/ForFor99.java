/*
	使用双重for打印99乘法表
*/
public class ForFor99 {
	
	public static void main(String[] args) {
	
	System.out.println("-----------------------------------------------------------------------");
	System.out.println();
	//1.使用外层for控制打印的行数，一共9行
	outer: for(int i = 1; i <= 9; i++) {
		//2.用内层for控制打印的列数，最多9列，规律是与当前行数相等
		for(int j = 1; j <= i; j++) {
			//3.拼接结果
			System.out.print(i + "*" + j + "=" + (i * j) + "  " );
			//4.打印完6*6 = 36后结束整个打印 
			if(6 == j) {
				//break;	//主要用于跳出循环，但该关键字只能跳出当前所在循环
				break outer;	//表示可以跳出所标循环
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