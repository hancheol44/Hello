package day03;

public class Test05 {
	public static void main(String[] args) {
		
		int no1 = 10;
		int no2 = 11;
		System.out.println((no1 > no2) && (no1++ < no2)); 
	// 앞 조건이 false이면 후조건 실행X!! 절삭연산 즉(no1++ nnn) 실행X 뒤 no1영향X)
		System.out.println("no1 : " + no1);
		System.out.println((no1 < no2) || (no1++ < no2)); 
		System.out.println("no1 : " + no1);
	}
}
