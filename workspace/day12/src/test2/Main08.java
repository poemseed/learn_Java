package test2;
//220321
public class Main08 {

	public static void main(String[] args) {
		// num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오.
		// 출력값
		// 짝수 : 20
		// 홀수 : 25
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int even = 0;
		int odd = 0;
		
		for( int i = 0; i < num.length; i++ ) {
			if( num[i] % 2 == 0 ) {
				even += num[i];
			}else {
				odd += num[i];
			}
			
		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
		
		
		
	}

}
