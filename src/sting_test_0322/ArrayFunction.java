package sting_test_0322;

public class ArrayFunction {
	
	//<�迭�� ���� �޾� ����ϴ� ����>
					
	//��ȯ���� �迭 �� ���
	static int[] outputArray(int a, int b, int c){
		int arr[] = new int[3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭���� �����Ƿ� �迭������ �����ؾ���
		int ret[] = new int[3];
		ret	= outputArray(1, 2, 3);
		
		
	}

}
