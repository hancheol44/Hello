package day05;


import java.util.*;
public class Test01 {
	/*
	 *  자중 조건 처리 조건문
	 *  	형식] 
	 *  		1)
	 *  		if(조건식1){
	 *  			실행1
	 *  		} else if(조건식2){
	 *  			실행2
	 *  		} else if(조건식3){
	 *  			실행3
	 *  		} ...
	 *  
	 *  		} else {
	 *  			실행n
	 *  		}
	 *  		2)
	 *  
	 *  		// 조건식 2가 참인경우 실행순서
	 *  		
	 *  		1) --> 조건식1 --> 조건식2 --> 실행2 --> 2)
	 */	
	
	// 예제 ] 과목 코드를 입력받아 과목이름을 알려주는 프로그램을 작성하세요.
	public static void main(String[] args) {
		// 과목을 구분할 변수를 만들어 놓고
		int kor = 1001;
		int eng = 1002;
		int math = 1003;
		int sci = 1004;
		
		// 입력 받을 준비하고
		Scanner sc = new Scanner(System.in); //System.in 은 시스템이라는 쿨래스가 가지고 있는 변수in
		
		// 메세지 출력하고
		System.out.print("과목 코드를 입력하세요! : ");
		
		// 입력받아 변수에 담고
		int code = sc.nextInt();
		
		// 5. 조건 처리하고(if ~ else if ~ else)
		// 5.1 출력할때 사용할 문자열 변수를 만들고 
		String sub = ""; // 과목 이름 저장할 변수
		if(code == kor) {
			sub = "국어";
		} else if(code == eng) {
			sub = "영어";
		} else if(code == math) {
			sub = "수학";
		} else if(code == sci) {
			sub = "과학";
		} else {
			sub = "없는 과목";
		}
		
		// 6.출력
		System.out.println("입력한 코드 [" + code + "] 에 해당하는 과목은 [" + sub + "] 입니다.");
	
	}
}
