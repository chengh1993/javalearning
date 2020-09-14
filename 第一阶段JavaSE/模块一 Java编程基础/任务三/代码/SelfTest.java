/*
	编程实现自增减运算符的使用
*/
public class SelfTest {
	
	public static void main(String[] args) {
		
		//1.声明一个int类型的变量并初始化
		int ia = 10; 
		//2.打印变量的数值
		System.out.println("ia = " + ia); 	//ia = 10
		
		System.out.println("----------------------------------");
		//3.实现自增减运算符的使用
		//表示让变量ia自身的数值加1，并覆盖原数值
		ia++;
		System.out.println("ia = " + ia); 	//ia = 11
		
		//表示让变量ia自身的数值加1，并覆盖原数值
		++ia;
		System.out.println("ia = " + ia); 	//ia = 12
		
		//表示让变量ia自身的数值减1，并覆盖原数值
		--ia;
		System.out.println("ia = " + ia); 	//ia = 11
		
		//表示让变量ia自身的数值减1，并覆盖原数值
		ia--;
		System.out.println("ia = " + ia); 	//ia = 10
		
		System.out.println("----------------------------------");
		//4.简单的变换
		//其中 ia++ 整体叫表达式， ia叫操作数/变量	也就是ia++和ia表示不同含义，所占的内存空间	应该不同
		//下面的代码是在打印表达式的结果还是变量的结果
		//后++表示先用值再自增
		System.out.println(ia++);			//10
		System.out.println("ia = " + ia);	//11
		//前++表示先自增再用值
		System.out.println(++ia);			//12
		System.out.println("ia = " + ia);	//12

		System.out.println("----------------------------------");
		//5.笔试考点
		int ib = ia ++;
		System.out.println("ib = " + ib);	//12
		System.out.println("ia = " + ia);	//13
		int ic = ++ia;
		System.out.println("ic = " + ic);	//14
		System.out.println("ia = " + ia); 	//14
		//					14	+	16	
		System.out.println(ia++ + ++ia);	//30
		System.out.println("ia = " + ia);	//16
		
		
		
	
	}
}