package sting_test_0322;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 선언 방법
		int arr1[];
		int[] arr2;
		
		//배열 생성
		arr1 = new int[10];
		
		//배열 선언과 배열 생성을 함께하는 방법
		int arr3[] = new int[10];
				
		//배열 초기화
		int arr4[] = {1, 2, 3, 4, 5, 6};
		
		//선언할 때 []안에 개수를 쓸 수 없음(빈칸으로 두어야함)(배열 크기 지정X)
		//ex> int arr4[5]는 쓸 수 없음!
		
		arr1[0] = 10; //arr1배열의 첫번째 칸에 10 입력
		
	}

}
