package day03;

public class Test05 {
	public static void main(String[] args) {
		
		int no1 = 10;
		int no2 = 11;
		System.out.println((no1 > no2) && (no1++ < no2)); 
	// �� ������ false�̸� ������ ����X!! ���迬�� ��(no1++ nnn) ����X �� no1����X)
		System.out.println("no1 : " + no1);
		System.out.println((no1 < no2) || (no1++ < no2)); 
		System.out.println("no1 : " + no1);
	}
}
