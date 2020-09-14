/*
	编程实现变量的声明和使用
*/
public class VarTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个变量并初始化	数据类型 变量名 = 初始值;
		int age = 18;
		// 2.打印变量的数值		+ 字符串连接符  用于讲两边的内容拼接起来
		System.out.println("age = " + age);	// age =  18
		
		System.out.println("------------------------------------------------");
		// 3.使用变量的注意事项
		// 3.1使用变量之前需要声明
		//System.out.println("name = " + name); //错误：找不到符号
		// 3.2使用变量之前需要初始化
		//String name;
		//System.out.println("name = " + name);//错误: 可能尚未初始化变量name
		String name = "野良程";
		System.out.println("name = " + name);	// name = 野良程
		// 3.3变量不能重复声明
		//int age = 17;		// 错误: 已在方法 main(String[])中定义了变量 age
		
		
	}
}