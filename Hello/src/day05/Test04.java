package day05;

/*
 *  반복문 - while 명령어
 *  	형식]
 *  
 *  		while(조건식){
 *  			실행문
 *  		}
 */
public class Test04 {
	
/*
 * 문제] while 명령어로 처리하세요
 * 		알파벳 'O' 부터 순차적으로 문자를 5개를 만들어서 출력하세요.
 */	
	public static void main(String[] args) {
	
		
		// while 반복문은 명령문 내부에 카운터 변수가 없기 때문에 별도로 변수를 만들어주고
		// 증감식도 별도로 처리해야 한다.
		
		int i = 0; // 카운터 변수
		char ch = 'O'; //문자 변수
		
		while(i < 5) {
			System.out.println((char)(ch + i));
			i++;  
		}
		
		
		
	}
}
