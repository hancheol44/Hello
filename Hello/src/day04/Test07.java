package day04;

import java.util.*;
public class Test07 {
	/*
	 *  정수를 입력받아 입력된 값이 짝수 인지 홀수 인지 판별하세요.
	 */
	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		//메세지 출력하고
		System.out.print("정수를 입력하세요! : ");
		
		//입력값 추출해서 변수에 담고
		int no = sc.nextInt();
		
		// 판별하고
		if(no % 2 == 0) {
			System.out.println(no + " 는 짝수입니다.");
		}
		
		if(no % 2 != 0) {
			System.out.println(no + " 는 홀수입니다.");
		}
		//------------------------------------------------------------
		
		String msg = "홀수";
		
		if(no % 2 == 0) {
			msg = "짝수";
		}
		
		System.out.println(no + " 는" + msg + " 입니다.");
	}
}

