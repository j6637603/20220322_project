package sting_test_0322;
import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			
			String text = scan.nextLine(); //-> ���⵵ �ݿ��� ���ڿ�
			//String text = scan.next(); //->���� �ν� X, ���� �ڴ� ���������� ������(���Ⱑ ���� ������ �����ϴ� ��ġ�� ���)
						
			if(text.equals("exit")) {//text�� exit�� ������ üũ
				break;
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
		
	}

}
