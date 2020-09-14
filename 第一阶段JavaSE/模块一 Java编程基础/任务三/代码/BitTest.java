/*
	编程实现位运算符的使用
*/
public class BitTest {
	
	public static void main(String[] args) {
		
		//1.声明两个byte类型的变量
		byte b1 = 11;
		byte b2 = 13;
		//2.打印变量的数值
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		System.out.println("-------------------------------------");
		//3.实现位运算的使用
		//b1的二进制为：0000 1011
		//b2的二进制为：0000 1101
		System.out.println(b1 & b2);	//按位与：同1为1，一0为0	之后二进制为：0000 1001	→ 转换为十进制为：9
		System.out.println(b1 | b2);	//按位或：一1位1，同0位0	之后二进制为：0000 1111 → 转换为十进制为：15
		System.out.println(b1 ^ b2);	//按位异或：同为0，异为1	之后二进制为：0000 0110 → 转换为十进制为：6
		System.out.println(~ b1 );		//按位取反					之后二进制为：1111 0100 → 转换为十进制为：负数
		//二进制为：1111 0100 → 11110011 → 00001100 → -12
		
		
	}
}