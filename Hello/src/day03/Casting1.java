package day03;
//JAVA 02 ����ȯ ����
public class Casting1 {
	public static void main(String[] args) {
		
		float num1 = 10;
		/* 
		float num2 = 10.; --> ������
         */
		// 1. ���� ����ȯ
		float num2 = (float) 10.;
		// 2. ���ͷ� ����ȯ
		float num3 = 10.F;
		
		// float Ÿ���� ���� area�� �������� 5�� ���� ���̸� �����ϼ���
		
		//  float area = 5 * 5 * 3.14;  --> ����! 3.14 ūŸ���̿���
		float area = (float) (5 * 5 * 3.14);
		float area1 = 5 * 5 * 3.14F;
		
		System.out.println("num1 : " + num1);
		
	}
}
