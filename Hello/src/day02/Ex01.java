package day02;

public class Ex01 {
	public static void main(String[] args) {
		// 1. 밑변이 5이고 높이가 3인 삼각형의 넓이를 구해서 출력하세요
				//밑변*높이/2
		// 2. 가로가 5, 세로가 7 사각형의 넓이를 구해서 출력하세요
				//가*세
		// 3. 반지름이 2인 원의 둘레를 구해서 출력하세요
				//2*반지름*3.14
		// **주의** 각각의 데이터는 변수를 만들고 변수를 연산해서 사용하세요
		
		int x = 5;
		int y = 3;
		int z = 7;
		int r = 2;
		double e = 3.14;
		
		System.out.println("1번 정답은 " + (x*y) * 0.5 + "입니다.");
		System.out.println("2번 정답은 " + (x*z) + "입니다.");
		System.out.println("3번 정답은 " + (2*r)*e + "입니다.");			
		/*
		 * 또는 
		 * int tri = x * y * 0.5;
		 *
		 */
	}
}
