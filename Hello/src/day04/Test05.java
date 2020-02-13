package day04;

import java.util.*;
public class Test05 {
	/*
	 *  알파벳을 입력받아서 
	 *  대문자이면  "입력받은 문자 O는 대문자 입니다."
	 *  소문자이면  "입력받은 문자 O는 소문자 입니다."
	 *  가 출력되게 하세요.
	 *  
	 *  Scanner 에서는 문자를 추출해주는 함수는 존재하지 않습니다.
	 *  따라서 문자열로 추출한 후에 첫번째 자리의 문자만 추출해서 사용해야 한다.
	 *  
	 *  	추출시 _ charAt(위치값) --> 문자열의 위치값에 들어있는 문자를 추출해주는 함수
	 *  		참고]
	 *  			자바에서 사용하는 위치값은 index라고 부르며 0부터 시작한다.
	 *  	
	 *  	indexOf(문자 또는 문자열) --> 해당 문자가 처음 출현하는 위치값을 반환해준다.
	 *  
	 */
	
	public static void main(String[] args) {
		String str = "class";
		
		// 첫번째 문자 추출하기
		char ch = str.charAt(0);
		
		System.out.println("str의 첫번재 문자 : " + ch);
		
		//a 의 위치값 알아내기
		int idx = str.indexOf('a');
		System.out.println("str 중 a 의 위치값 : " + idx);
		
		// 입력받을 준지
		Scanner sc = new Scanner(System.in);
		
		// 메시지 출력하고
		System.out.print("알파벳을 입력하세요! : ");
		String str9 = sc.nextLine();
		
		// 문자로 추출
		char ch1 = str9.charAt(0);
		
		String str2 = (ch1 >= 'a') ? "소" : "대";
		
		String str3 = "입력된 문자 " + ch1 + "는" + str2 + "문자 입니다";
		// str3 출력
		System.out.println(str3);
		
		// 3항 조건 연산의 중첩 사용
		String str4 = (ch1 >= 'a') ? ((ch1 <= 'z')? "소":"특수 ") : "대";
		System.out.println( "입력된 문자 " + ch1 + "는" + str4 + "문자 입니다");
		
		/*
		 * 자바에서 비교는 한번에 한개만 할 수 있다.
		 * 		a > b > c - X
		 * 
		 * 		↓이렇게 가능
		 * 		a > b
		 * 		b > c  
		 */
	}
}
