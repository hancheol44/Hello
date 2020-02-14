package day04;

import java.util.*; // 클래스 위쪽에 해주는것이 원칙

public class Test06_01 {
	/*
	 * 제어문 - 프로그램의 흐름을 제어하는 문장
	 * 		종류
	 * 			1. 조건문 - 조건을 주고 조건에 맞으면 실행하는 문장
	 * 				if, if~else, if ~ else if ~ else, switch~ case
	 * 
	 * 				1) if 문
	 * 					형식]
	 * 						a)
	 * 						if(조건식(b)){
	 * 							실행문장(c)
	 * 						}
	 * 						(d)
	 * 						
	 * 						진행순서
	 * 						b가 참(true)일 경우      : a - b - c - d
	 * 						b가 거짓(false)일 경우  : a - b - d
	 * 
	 * 			       이후 pdf Java03 내용 참고
	 * 
	 * 			2. 반복문 - 반복을 제어하는 문장
	 * 				for, while, do ~ while, 향상된 for 명령
	 */
	public static void main(String[] args) {
		// 과목 코드를 만들고 코드를 입력하면 과목을 출력해주자.
		
		final int KOR = 1001;
		final int ENG = 1002;
		final int MATH = 1003;
		final int SCI = 1004;
		
		// 과목 이름 담을 변수 선언
		String sub = "programming";
		
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력하고
		System.out.println("과목 코드를 입력하세요! : ");
		
		// 코드값 입력받아 저장하고
		int code = sc.nextInt();
		sc.close();
		
		switch(code) {   // break 없으면 해당 입력값 있는 case 이하 모든것을 실행
		case KOR:
			sub = "국어";
			System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
//			break;
		case ENG:
			sub = "영어";
			System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
//			break;
		case MATH:
			sub = "수학";
			System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
//			break;
		case SCI:
			sub = "과학";
			System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
//			break;
		default:
			sub = "없는";
			System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
		}
		
//		System.out.println("입력된 코드는 " + sub + " 과목 입니다.");
	}
}
