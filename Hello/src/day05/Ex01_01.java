package day05;

import java.util.*;
public class Ex01_01 {
	/*
	 * ������ �Է¹޾Ƽ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
	 * ������ 
	 * 			A : 100 ~ 90
	 * 			B : 89 ~ 80
	 * 			c :	79 ~ 70
	 * 			D : 69 ~ 60
	 * 			F : 0 ~ 59
	 * 
	 */
	public static void main(String[] args) {
		
	//  �Է� ���� �غ�
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("������ �Է��� �ּ���! : ");
	
	// �Է¹��� ������ ���� ���� ����
	// ������ ��� ������� ���� ����
	
	int no = sc.nextInt(); 
	
	String sub = "";
	
	int tmp = no / 10;
	switch(tmp) {
	case 10:
		sub = "A";
		break;
	case 9:
		sub = "A";
		break;	
	case 8:
		sub = "B";
		break;	
	case 7:
		sub = "C";
		break;	
	case 6:
		sub = "D";
		break;
	default :
		sub = "F";
	}
	System.out.println("�Է��� ���� [" + no + "] �� ������ [" + sub +"] �Դϴ�. ");
	}
}
