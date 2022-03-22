package sting_test_0322;

public class DoubleArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][];
		arr = new int[5][5];
		
		//<비정방형 배열>
		//(열 값을 나중에 정의할 수 있다)
		int arr2[][];
		arr2 = new int[4][]; //arr2의 이름으로 배열이 4개 있다고 선언
		
		arr2[0] = new int[3];
		arr2[1] = new int[2];
		arr2[2] = new int[4];
		arr2[3] = new int[5];
	}

}
