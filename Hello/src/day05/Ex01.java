package day05;

import java.util.*;
public class Ex01 {
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
	
	if(no >= 90 && no < 101) {
		sub = "A";
	} else if(no > 100) {
		sub = "Wrong";
	} else if(no >= 80 && no < 90) {
		sub = "B";
	} else if(no >= 70 && no < 80) {
		sub = "C";
	} else if(no >= 60 && no < 70) {
		sub = "D";
	} else {
		sub = "F";
	}
	System.out.println("�Է��� ���� [" + no + "] �� ������ [" + sub +"] �Դϴ�. ");
	}
}
