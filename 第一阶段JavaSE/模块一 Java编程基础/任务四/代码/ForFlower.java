/*
	��̣���ӡ��λ��������ˮ�ɻ���
*/
public class ForFlower {
	
	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("��λ��������ˮ�ɻ����ǣ�" );
		for(int i = 100; i <= 999; i++) {
			int i1 = i / 100;
			int i2 = (i % 100) / 10;
			int i3 = i % 10;
			if(i == i1 * i1 * i1 + i2 * i2 * i2 + i3 * i3 * i3) {
				System.out.print(" " + i);
				count++;
				if(5 == count) {
					System.out.println("");
					count = 0;
				}
			}
		}	
		
		
	}
}