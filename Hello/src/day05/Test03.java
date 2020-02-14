package day05;


/*/
 * 반복문 - for 반복문
 * 		형식] 
 * 			for(카운터변수 초기화; 조건식 ; 증감식){
 * 				실행문
 *  		}
 */
public class Test03 {
	public static void main(String[] args) {
		// 1부터 10까지 출력하세요
		
		for(int i =0; i < 10 ; i++) {
			System.out.println(i+1);
		}
		
		
		System.out.println("############################");
		for(int i =1; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
}
