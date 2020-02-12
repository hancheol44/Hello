package day03;
//JAVA 02 형변환 수업
public class Casting1 {
	public static void main(String[] args) {
		
		float num1 = 10;
		/* 
		float num2 = 10.; --> 에러남
         */
		// 1. 강제 형변환
		float num2 = (float) 10.;
		// 2. 리터럴 형변환
		float num3 = 10.F;
		
		// float 타입의 변수 area에 반지름이 5인 원의 넓이를 저장하세요
		
		//  float area = 5 * 5 * 3.14;  --> 에러! 3.14 큰타입이여서
		float area = (float) (5 * 5 * 3.14);
		float area1 = 5 * 5 * 3.14F;
		
		System.out.println("num1 : " + num1);
		
	}
}
