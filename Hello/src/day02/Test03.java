package day02;

public class Test03 {
	
	public static void main(String[] args) {
		/*            main 함수의 매개변수
		 *   		   String[] args는
		 * 			     데이터 타입이 String[] 이고
		 * 			     변수 이름이 args 이다.
		 * 			     여기서 []는 배열을 나타낼때 사용하는 기호이다.
		 */
		
	//String[] arr = {"abcd", "efgh", "ijkl"};
	
	/*
	 *  상수
	 *  	final 데이터타입 변수이름 = 데이터 ;
	 */
	}
	final double PI = 3.14;
	/* 이 사이에
	 * PI = 3.15(위 값과 다른값)이 입력되면 오류발생함 이유는 상수를 이미 선언,고정해버렸기때문
	 */
	public void setPi() {
		System.out.println(PI);
	}
}
