package sting_test_0322;

static void[] arrayT(int[] arr) {
	//매개변수로도 배열을 선언할 수 있다는 의미
	//호출할 때도 배열로 호출해야 함
	//void는 return값이 없다는 의미
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//매개변수로도 배열을 선언할 수 있다는 의미
		
	}

}
