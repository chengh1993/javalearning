/*
	编程打印杨辉三角
*/
import java.util.Scanner;

public class YHTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		//1.提示用户输入一个行数并用变量记录
		System.out.print("请输入要打印的行数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("----------------------------------------------");
		//2.根据用户输入的行数声明对应二维数组
		int[][] arr = new int[n][];
		
		//3.针对二维数组中的每个元素进行初始化，使用双重for
		//使用外层for控制行下标
		for(int i = 0; i < arr.length; i++) {
			//针对二维数组中的每一行进行内存空间的申请
			arr[i] = new int[i+1];
			//使用内层for控制列下标
			for(int j = 0; j <= i; j++) {
				//当列下标为0或者下标与当前行的行下标相等时，则对应位置的元素就是1
				if(0 == j || i == j) {
					arr[i][j] = 1;
				} else {
					//否则对应位置的元素就是上一行当前列的元素加上上一行前一列的元素
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			//使用内层for控制打印的列数
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-3d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
	}
}

/*
public class YHTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		System.out.print("请输入要打印的行数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("----------------------------------------------");
		
		int[][] arr = new int[n][];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			if(i > 1) {
				for(int j = 1; j < i; j++) {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			//使用内层for控制打印的列数
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-3d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
	}
}

*/