package sting_test_0322;
import java.util.*;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��� 5���� �Է¹޾� �迭�� �����ϰ�,
		//���� ū ���� ����ϴ� ���α׷� �ۼ�		
		
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5]; //�迭 ����
		
		int max = 0;
		
		System.out.println("��� �ټ� ���� �Է��ϼ���.");
		
		for(int i = 0; i<5; i++) {
			intArray[i] = scan.nextInt();
			
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		
		scan.close();
		
	}

}
