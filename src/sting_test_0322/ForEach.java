package sting_test_0322;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for-each���� Ȱ���� int[] �迭�� �� ���ϱ�
		
		int n[] = {10 ,30, 15, 20, 100};
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum = sum + k;
		}
		
		System.out.println();
		System.out.println("���� " + sum);
		System.out.println("����� " + sum / n.length);
		System.out.println();
		
		//String [] �迭�� ���ڿ��� ���
		
		String f[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		
		for(String s : f) {
			System.out.print(s + " ");
		}
		
		
	}

}
