package day04;

import java.util.*;
public class Test02 {
	/*
	 *  콘솔에서 숫자(정수)2개를 입력받아 변수(no1, no2)에 저장을 하고 
	 *  두수를 비교해서 no1이 no2보다 크면 "no1 은 no2 보다 큽니다."
	 *  작으면 "no1 은 no2 보다 작습니다." 라는 메세지가 출력되게 하세요.
	 *  
	 *  참고]
	 *  	콘솔환경에서 데이터를 입력받는 방법
	 *  
	 *  	Scanner sc = new Scanner(System.in);  //Scanner 참조형타입 그래서 new 사용
	 *  	↑콘솔에서 입력되는 데이터를 관리하는 클래스
	 *  
	 *  	입력되어 있는 데이터는 각각의 타입에 맞게 꺼내서 사용하면 됩니다.
	 *  	int no1 = sc.nextInt();  ←입력된 정수를 꺼내는 함수
	 */
	public static void main(String[] args) {
		// Scanner 만들고
		Scanner sc = new Scanner(System.in);
		
		// 메시지를 띄우고
		System.out.print("no1에 넣을 정수를 입력하세요! : ");
		
		// 꺼낸 정수를 담을 변수를 만들고
		int no1, no2;
		
		// 숫자를 꺼내서 no1에 담고
		no1 = sc.nextInt();
		System.out.println();
		// 두번째 숫자를 입력받을 메시지를 출력하고
		System.out.print("no2에 넣을 정수를 입력하세요! : ");
		
		// no2에 정수를 꺼내서 담고
		no2 = sc.nextInt();
		
		// 결과 메시지를 담을 변수를 만들고(문자열 담을 변수)
		String msg = new String();
		
		// 삼항 연산자로 숫자를 비교해서 메시지를 변수에 담고 
		msg = (no1 > no2) ? (no1 + "은" + no2 + "보다 큽니다.") : (no1 + "은" + no2 + "보다 작습니다."); 
		System.out.println();
		// 메시지를 출력한다.
		System.out.println(msg);
		
	}
}
