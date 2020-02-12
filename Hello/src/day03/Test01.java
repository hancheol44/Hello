package day03;

public class Test01 {
	public static void main(String[] args) {
		int no = 10; //  = : 대입 연산자
		System.out.println("1. no : " + no);
		
		no = no + 1; // 대입연산자의 진행방식은 좌변의 값 <-- 우변의 값
		System.out.println("2. no : " + no);
		
		no += 1; // ==> no = no + 1; 과 동일한 표현!!
		System.out.println("3. no : " + no);
		
		/*
		 *   -= : 최초값에서 빼기 
		 *   *= : 최초값에서 곱하기
		 *   /= : 최초값에서 나누기
		 *   %= : 최초값에서 몫의 값
		 */
		
		int num = 3;
		num *= 2; // num = num * 2;
		num *= 2;
		System.out.println("num : " + num);
	}	
}
