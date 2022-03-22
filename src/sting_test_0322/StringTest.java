package sting_test_0322;
import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">>");
			
			String text = scan.nextLine(); //-> 띄어쓰기도 반영된 문자열
			//String text = scan.next(); //->띄어쓰기 인식 X, 띄어쓰기 뒤는 다음턴으로 저장함(띄어쓰기가 다음 문자의 구별하는 장치로 사용)
						
			if(text.equals("exit")) {//text가 exit와 같은지 체크
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
	}

}
