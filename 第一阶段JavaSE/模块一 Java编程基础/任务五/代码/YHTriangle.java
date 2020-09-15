/*
	��̴�ӡ�������
*/
import java.util.Scanner;

public class YHTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		//1.��ʾ�û�����һ���������ñ�����¼
		System.out.print("������Ҫ��ӡ��������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("----------------------------------------------");
		//2.�����û����������������Ӧ��ά����
		int[][] arr = new int[n][];
		
		//3.��Զ�ά�����е�ÿ��Ԫ�ؽ��г�ʼ����ʹ��˫��for
		//ʹ�����for�������±�
		for(int i = 0; i < arr.length; i++) {
			//��Զ�ά�����е�ÿһ�н����ڴ�ռ������
			arr[i] = new int[i+1];
			//ʹ���ڲ�for�������±�
			for(int j = 0; j <= i; j++) {
				//�����±�Ϊ0�����±��뵱ǰ�е����±����ʱ�����Ӧλ�õ�Ԫ�ؾ���1
				if(0 == j || i == j) {
					arr[i][j] = 1;
				} else {
					//�����Ӧλ�õ�Ԫ�ؾ�����һ�е�ǰ�е�Ԫ�ؼ�����һ��ǰһ�е�Ԫ��
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			//ʹ���ڲ�for���ƴ�ӡ������
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
		System.out.print("������Ҫ��ӡ��������");
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
			//ʹ���ڲ�for���ƴ�ӡ������
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-3d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
	}
}

*/