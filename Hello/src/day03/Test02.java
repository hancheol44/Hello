package day03;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * 
		 * ����������  (++,--)
		 * 	: �����ȣ�� �������� ��ȣ ���� ó�� ������ ������ 1�� �����ְų� ���ش�.
		 */
		
		int no = 10;
		int num = 10;
	
		//	no++;
		
		System.out.println("no : " + no++); // ���������ڴ� 1ȸ���̴�
		System.out.println("no : " + no);  //���� ++�� ������ �޴´�
		System.out.println("no : " + no);  //����x
		System.out.println("num : " + ++num); //������ ��ȣ ���� ù ������ ����!
	}
}
