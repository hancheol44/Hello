package day05;

import java.util.Arrays;

/*
 *  1~ 9���� ���ڸ� �����ϰ� 5���� �߻����Ѽ� �迭�� �־ ����ϼ���.
 */

public class Test09 {
	public static void main(String[] args) {
		
		// �迭 ����� (6���� �迭 ��ü�� �����Ѱ�)
		int[] num = new int[6];
	
		
		lotto: // label�� ���� for ��� (continue�� ������ lotto ������ �ִ� ������� �̵�)
		for(int i = 0 ; i < 6 ; i++) {     // i�� �ʱ�ȭ ; ������ ; ��������
			int tmp = (int)(Math.random()*45) + 1;    //1~45���� ������ �����ϴ� �� (0~44)+1
			
			for(int j = 0; j < i ; j++) {  // �ߺ��� �� �������ִ� �ڵ�
				if(tmp== num[j]) {
					i--;
					continue lotto; //�������� ��Ƽ�� �ζ�
				}
			}
			num[i] = tmp;
		}
		Arrays.parallelSort(num); //���ڹ迭 ���� (��ġ�� ���ؼ� �� ���� �����ϰ� ���� for������ �ȵǴ���??)
		// ���
		for(int no : num) {  // ���� for ���
		System.out.println(no);
		}
	}
}
