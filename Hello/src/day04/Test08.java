package day04;

import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메시지 출력하고
		System.out.println("정수를 입력하세요! : ");
		// 3. 입력 데이터 받아서 변수에 담고
		int no = sc.nextInt();
		// 4. 판별하고
		String str = "";
		if(no % 2 == 0) {
			if(no < 0) {
				str = "음의 짝수";
			} else {
				str = "양의 짝수";
			}
			str = "짝수";
		} else {
			str = "홀수";
		}
		// 5. 출력하고
		System.out.println("입력된 정수 [ " + no + " ] 는" + str + "입니다.");
	}
}
