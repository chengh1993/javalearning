/*
	��ӡ2~100֮�����е�����
*/
public class ForForPrime {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
			boolean flag = true;
			//���ÿһ����ǰ��������Ҫ�ж��Ƿ�������
			//�жϷ���Ϊ��2�� ������-1֮��������������޷���������Ϊ����
			for(int j = 2; j <= Math.sqrt(i); j++) {
			//ֻ��Ҫ�ж�2��������ƽ��������
			//for(int j = 2; j <= i - 1; j++) {
				if(0 == i % j) {
					flag = false;
					//System.out.println(i + "��������");
					break;
				}
			}
			if(flag) {
				System.out.println(i + "������");
			}
		}
			
		System.out.println("------------------------------------------------------");
	}
}