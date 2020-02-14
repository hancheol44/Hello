package day04;


import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
			/*
			 
			 *  숙제 2]
			 *  	정수 3개를 입력받아서
			 *  	세 수중 큰 숫자만 출력되게 하세요. 
			 */
		
		
		
		// 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 메시지 출력, 입력받은 숫자 변수에 기억하고(3번 반복!!)
		System.out.print("첫번째 정수를 입력하세요! : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요! : ");
		int no2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요! : ");
		int no3 = sc.nextInt();
		
		// 변수를 비교하고
		int result = (no1 >= no2) ? ((no1 >= no3) ? no1 : no3) : ((no2 > no3) ? no2 : no3);
		
		// 가장 큰 수 출력하고
		System.out.println("입력한 세 수 [" + no1 + ", " + no2 + ", " + no3 + "] "
			+ "중 제일 큰 수는 [" + result + "] 입니다.");
		
	}	
}
