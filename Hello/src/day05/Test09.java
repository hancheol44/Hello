package day05;

import java.util.Arrays;

/*
 *  1~ 9까지 숫자를 랜덤하게 5개를 발생시켜서 배열에 넣어서 출력하세요.
 */

public class Test09 {
	public static void main(String[] args) {
		
		// 배열 만들고 (6개의 배열 객체만 생성한것)
		int[] num = new int[6];
	
		
		lotto: // label이 붙은 for 명령 (continue의 진행을 lotto 다음에 있는 명령으로 이동)
		for(int i = 0 ; i < 6 ; i++) {     // i값 초기화 ; 범위값 ; 증감연산
			int tmp = (int)(Math.random()*45) + 1;    //1~45까지 랜덤값 추출하는 것 (0~44)+1
			
			for(int j = 0; j < i ; j++) {  // 중복된 값 제거해주는 코드
				if(tmp== num[j]) {
					i--;
					continue lotto; //깔끔실행라벨 컨티뉴 로또
				}
			}
			num[i] = tmp;
		}
		Arrays.parallelSort(num); //숫자배열 정렬 (위치에 대해서 왜 여긴 가능하고 향상된 for문에는 안되는지??)
		// 출력
		for(int no : num) {  // 향상된 for 명령
		System.out.println(no);
		}
	}
}
