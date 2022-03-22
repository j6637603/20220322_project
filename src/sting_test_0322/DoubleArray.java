package sting_test_0322;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<2차원 배열>

		int arr[][]; //2차원 배열 선언
		arr = new int[3][4]; //3줄 4칸 배열
		
		int arr2[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //3줄 3칸 배열 생성
		
		System.out.println(arr2.length); //3 ; 두 줄(3행)이기 때문
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
