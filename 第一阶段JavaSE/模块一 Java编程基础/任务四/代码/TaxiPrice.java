/*
	���ʵ�֣����⳵�Ʒ�ϵͳ
*/

import java.util.Scanner;

public class TaxiPrice {
	
	public static void main(String[] args) {
		
		//1.��ʾ���빫�����͵Ⱥ������������
		System.out.println("�����빫�����͵Ⱥ�������");
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int sec = sc.nextInt();
		int kmprice,secprice;
		
		//2.�������
		if(km <= 3) {
			kmprice = 13; 
		} else if(km > 3 && km <= 15) {	//�������д��  else(km <= 15),����ǰ�������Ҳ��
			kmprice = (km - 3) * 2 + 13;
		} else {
			kmprice = (km - 15) *3 + 24 + 13;
		}
		secprice = sec / 150;
		
		//3.��ӡ����
		System.out.println(km + "�����ҵȺ�ʱ��" + sec + "�룬�ܼƳ���Ϊ��" + (secprice + kmprice));
	}
}