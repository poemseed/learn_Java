package test2;
//220321
public class Main04 {

	public static void main(String[] args) {
		// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		// int[] arr = {10, 20, 30, 40, 50};
		// 출력값
		// sum=150
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for( int i = 0; i < arr.length; i++ ) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum );
		
		
		
		
	}

}
