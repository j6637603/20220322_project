package sting_test_0322;

public class ArrayFunction {
	
	//<배열을 리턴 받아 사용하는 과정>
					
	//반환값이 배열 일 경우
	static int[] outputArray(int a, int b, int c){
		int arr[] = new int[3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열값을 받으므로 배열값으로 선언해야함
		int ret[] = new int[3];
		ret	= outputArray(1, 2, 3);
		
		
	}

}
