package sting_test_0322;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<2���� �迭>

		int arr[][]; //2���� �迭 ����
		arr = new int[3][4]; //3�� 4ĭ �迭
		
		int arr2[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //3�� 3ĭ �迭 ����
		
		System.out.println(arr2.length); //3 ; �� ��(3��)�̱� ����
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
