package day05;

/*
 *  반복문 - do ~ while 반복문
 *  	어떤 경우라도 적어도 한번은 실행시키는 반복문
 *  
 *  	형식]
 *  		do {
 *  			실행문
 *  		} while(조건식);	
 */		

public class Test05 {
	public static void main(String[] args) {
		
		boolean bool1 = false;
		do {
			System.out.println("한번은 실행합니다. ");
		} while(bool1);
		
		int i = 0;
		do {
			System.out.println(++i);
			
			/*	
			 *  i       ++i
			 *  0		 1
			 *  1		 2
			 *  2		 3
			 *  3		 4
			 *  4		 5	   
			 */ 
			
		} while(i < 5);
	}
}
