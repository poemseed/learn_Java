package array;

public class Main01 {

	public static void main(String[] args) {
		// 배열의 생성
		// 배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정의 일괄 처리
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열 생성의 일괄 처리
		//int[] ddochy = { 100, 100, 90 };
		int[] ddochy = new int[]{ 100, 100, 90};
		
		// 배열 활용
		// 합을 할당한 변수 선언
		// 같은 종류의 변수들은 콤마로 구별하여 한번에 선언 가능함
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		// 각 배열의 요소의 값에 대한 합계구하기
		for( int i = 0; i < dooly.length; i++ ) {
			sum1 += dooly[i];
		}
		
		System.out.println("dooly sum1 : "+ sum1);
		
		// sum2, douneo 합계 반복문 생성 및 출력
		for( int i = 0; i < douneo.length; i++) {
			sum2 += douneo[i];
		}
		
		System.out.println("douneo sum2 : " + sum2 );
		
		// sum3, ddochy 합계 반복문 생성 및 출력
		
		for( int i = 0; i < ddochy.length; i++ ) {
			sum3 += ddochy[i];
		}
		
		System.out.println("ddochy sum3 : " + sum3);
		
		// 평균
		System.out.println("dooly 평균 : " + (sum1 / dooly.length));
		System.out.println("douneo 평균 : " + (sum2 / douneo.length));
		System.out.println("ddochy 평균 : " + (sum3 / ddochy.length));
		
//		float avg1 = (float)sum1/ dooly.length;	// int와 int의 연산은 int인데 float에 넣은거라서 형변환을 시켜줘야한다.
//		System.out.println("avg1 : " + avg1);
		
	}

}
