package day03;

public class Ex01 {
	// 밑변이 7이고 높이가 6인 삼각형의 면적을 구하세요
    // 단, 면적의 데이터 타입은 float으로 저장하세요
	public static void main(String[] args) {
	// 시작시 바로 결과값을 공식으로 만드는것이 아니라 변수값을 먼저 지정한 후에 참고하여 결과도출	
		int garo = 7;
		int high = 6;
		
		float tri1 = garo * high * 0.5f; //리터럴 형변환 사용됨 
		System.out.println("1번 문제의 정답은 "+ tri1);
	}
}
