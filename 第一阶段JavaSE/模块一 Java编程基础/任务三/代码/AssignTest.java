/*
	赋值运算符的使用
*/

public class AssignTest {
	
	public static void main(String[] args) {
		
		//1.声明一个int类型的变量并初始化
		int ia = 3;
		//2.打印变量的数值
		System.out.println("ia = " + ia);	//ia = 3
		
		System.out.println("---------------------------------");
		//3.简单赋值运算符的使用
		//表示将数据5赋值给变量ia并且覆盖变量ia原来的数值 
		ia = 5;
		System.out.println(ia = 5);	//5
		System.out.println("ia = " + ia);	//ia = 5
		int ib = ia = 6;
		System.out.println("ia = " + ia);	//ia = 6
		System.out.println("ib = " + ib);	//ib = 6
		int ic;
		ic = ib= ia =8;
		System.out.println("ia = " + ia);	//ia = 8
		System.out.println("ib = " + ib);	//ib = 8
		System.out.println("ic = " + ic);	//ic = 8
		
		System.out.println("---------------------------------");
		//4.复合赋值运算符的使用
		//ia = ia + 2;	
		ia += 2;		//简化写法，从结果上来看相等，实际有区别，参考考点1
		System.out.println("ia = " + ia);
		
		System.out.println("---------------------------------");
		//5.笔试考点1
		byte b1 = 10;
		System.out.println("b1 = " + b1);	//b1 = 10
		//b1 = b1 + 2;	//错误: 不兼容的类型: 从int转换到byte可能会有损失 		byte + int还是int类型
		//b1 = b1 + (int)2;	//错误: 不兼容的类型: 从int转换到byte可能会有损失	byte + byte还是int类型	编译器优化	两个byte相加易超过int类型
		//b1 = (byte)(b1 + 2);	//强制转换类型
		b1 += 2;
		System.out.println("b1 = " + b1);	//b1 = 12
		
		System.out.println("---------------------------------");
		//6.笔试考点2
		//ia == 2;	- 表示判断变量2是否等于2
		//2 == ia;	- 便是判断2是否等于变量ia的数值，结果上来说等价，推荐该方式
		//ia = 2;	- 表示将2赋值给变量ia，覆盖变量ia的原来的数值
		//2 = ia;	//-编译报错		错误：以外的类型
		

	}
}