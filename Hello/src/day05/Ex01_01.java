package day05;

import java.util.*;
public class Ex01_01 {
	/*
	 * 정수를 입력받아서 학점을 출력해주는 프로그램을 작성하세요.
	 * 학점은 
	 * 			A : 100 ~ 90
	 * 			B : 89 ~ 80
	 * 			c :	79 ~ 70
	 * 			D : 69 ~ 60
	 * 			F : 0 ~ 59
	 * 
	 */
	public static void main(String[] args) {
		
	//  입력 받을 준비
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("점수를 입력해 주세요! : ");
	
	// 입력받은 정수를 담을 변수 생성
	// 학점을 담아 출력해줄 변수 생성
	
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
	System.out.println("입력한 숫자 [" + no + "] 의 학점은 [" + sub +"] 입니다. ");
	}
}
