import java.util.Arrays;

public class Sample45 {

	public static void main(String[] args) {
		
		int[] scores;                      // 배열변수 "선언" 으로 끝남! (***)
//		int[] intArray = { 83, 90, 87};
		// 값의 목록으로 배열 리터럴을 생성해서 초기화하자!!!
		// 배열변수의 선언과 배열리터럴의 생성이 분리되면,
		// 아래와 같이 배열객체를 생성해야 합니다.
//		scores = { 83, 90, 87 }; // XX (불가함)
		scores = new int[] { 83, 90, 87 }; // OK (가능함): new 연산자 => "객체생성연산자"
		
		int sum1 = 0;
		
		for(int k=0; k<3; k++) {
			sum1 += scores[k];
		} // for
		
		// 0 + score[0] + scores[1] + scores[2];
		System.out.println("총합 : " + sum1);
		
//		---
		
		long l = 0l;
		
//		String[] strarr = new String[5];
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		String name = "Giseo"; // String은 클래스 타입
		
		System.out.println("0. name: " + name);
		System.out.println("1. strarr: " + intArray);
		System.out.println("2. Arrays: " + Arrays.toString(intArray) );
		
		
	
		
		
		
		
	} // main
} // end class
