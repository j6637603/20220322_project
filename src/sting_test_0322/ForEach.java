package sting_test_0322;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for-each문을 활용한 int[] 배열의 합 구하기
		
		int n[] = {10 ,30, 15, 20, 100};
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum = sum + k;
		}
		
		System.out.println();
		System.out.println("합은 " + sum);
		System.out.println("평균은 " + sum / n.length);
		System.out.println();
		
		//String [] 배열의 문자열을 출력
		
		String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		for(String s : f) {
			System.out.print(s + " ");
		}
		
		
	}

}
