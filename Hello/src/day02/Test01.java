package day02;

public class Test01 {
	public static void main(String [] args) {
		String msg = "������ ";
		String month = "2�� ";
		String day = "11�� ";
		String str = "�Դϴ�. ";
		System.out.print("��� : " + msg + month + day + str);
		System.out.print("��� : " + msg + month + day + str);
		System.out.println();
		System.out.println("��� : " + msg + month + day + str); //����� �ٹٲ��ض�
		System.out.println("��� : " + msg + month + day + str); //����� �ٹٲ���
		// ���� �����ϱ�
		msg = "������ ";
		day = "12�� ";
		System.out.println();
		System.out.println("��� : " + msg + month + day + str);
		System.out.println("��� : " + msg + month + day + str);
		
	}
}
// Print / Println �� ������