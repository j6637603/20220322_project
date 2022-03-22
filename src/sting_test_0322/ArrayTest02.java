package sting_test_0322;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[5];
		
		intArray[0] = 5;
		
		//오류 1.
		
		//intArray[6] = 10;		
		//System.out.print(intArray[6]);
		
		//-> 배열의 인덱스 범위를 벗어났으므로 오류
		//(intArray배열의 인덱스는, 0, 1, 2, 3, 4)
		
		
		//오류 2.
		
		//int arr1[];
		//arr1[3] = 10;
		
		//-> 선언만 하고 초기화를 하지 않았으므로 오류
		//new int[5] 등으로 초기화를 해야함
		
		
		
	}

}
