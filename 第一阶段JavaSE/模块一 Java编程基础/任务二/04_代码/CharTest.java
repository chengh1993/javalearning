/*
	编程实现字符类型的使用
*/
public class CharTest {
	
	public static void main(String[] args) {
		
		//1.声明一个char类型的变量
		char c1 = 'a';	
		//2.打印变量的数值
		System.out.println("c1 = " + c1);	//c1 = a
		System.out.println("对应的编号是：" + (int)c1);	//	对应的编号是：97	(int)表示将char类型的c1强制转换成int类型 	
		
		System.out.println("---------------------------------------------------------");
		//2.声明一个char类型的变量并初始化
		char c2 = 98;
		System.out.println("c2 = " + c2);	//c1 = b	因为c2是char类型
		System.out.println("对应的编号是：" + (int)c2);		//因为int强制转化
		
		System.out.println("---------------------------------------------------------");
		//3.使用Unicode字符集来表示名字  奇点	对应的编号是： \u5947\u70b9
		char c3 = '\u5947';
		char c4 = '\u70b9';
		System.out.println("最终的结果是：" + c3 + c4);		//最终的结果是：奇点
		
		System.out.println("---------------------------------------------------------");
		//4.特殊字符的使用		//双引号本身有两个含义： a.字符串的开头和结尾的标志		b.双引号自身	\ 转义就是转换原有的含义
		System.out.println("我想过过\"过过过过的生活");		//  \" -> "
		System.out.println("我想过过\'过过过过的生活");
		System.out.println("我想过过\\过过过过的生活");
		System.out.println("我想过过\t过过过过的生活");
		System.out.println("我想过过\n过过过过的生活");
		
	}
}