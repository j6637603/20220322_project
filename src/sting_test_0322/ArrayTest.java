package sting_test_0322;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭 ���� ���
		int arr1[];
		int[] arr2;
		
		//�迭 ����
		arr1 = new int[10];
		
		//�迭 ����� �迭 ������ �Բ��ϴ� ���
		int arr3[] = new int[10];
				
		//�迭 �ʱ�ȭ
		int arr4[] = {1, 2, 3, 4, 5, 6};
		
		//������ �� []�ȿ� ������ �� �� ����(��ĭ���� �ξ����)(�迭 ũ�� ����X)
		//ex> int arr4[5]�� �� �� ����!
		
		arr1[0] = 10; //arr1�迭�� ù��° ĭ�� 10 �Է�
		
		//�迭�� ���� ��� ���
		//�ݺ������� ���ǹ� �ۼ��ϱ� ����
		//(��� ��� �迭�� ��ü �� ���ϴ� length ���)
		int arr_length = arr1.length;
		
		System.out.println(arr_length);
		
		for(int i=0; i<arr_length; i++) {
			System.out.print(i + " ");
		}
		
		//for(int i=0; i<arr1.length; i++){}
		
	}

}
