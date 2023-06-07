import java.util.Arrays;

public class ArrayObjectReference {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(args));
			// 미리 메모리에 배열공각 확보차원에서, 배열객체 생성
		// *** 중요 ***
		// 미리 생성한 배역객체의 각 원소는 배열원소의 타입대로, 기본값으로 설정
		// 예: (1) 정수타입의 배열이라면 ==> 각 원소는 0으로 초기화
		//     (2) 실수타입의 배열이라면 ==> 각 원소는 0.0으로 초기화
		//     (3) 논리타입의 배열이라면 ==> 각 원소는 false 로 초기화
		//     (4) 참조타입의 배열이라면 ==> 각 원소는 null로 초기화
		//     (5) 특히, char 타입의 배열이라면 ==> 각 원소는 '\u0000' 으로 초기화
		
		// 배열을 각 기본타입별로 만들어보자!!!
		byte[] byteArr = { 0, 1, 2, 3};          // 배열 리터럴 방식
		byte[] byteArr2 = new byte[] { 0, 1, 2, 3}; // new 연산자를 이용한 배열 리터럴
		
		byte[] byteArr3;
		byteArr3 = new byte[] { 0, 1, 2, 3};
		
	
		
		byte[] byteArr4 = new byte[10]; // 크기가 10인 배열객체 생성
		
		char[] charArr = {'A', 'B', 'C',};
		char[] charArr2 = new char[] { 'A', 'B', 'C'};
		
		char[] charArr3;
		charArr3 = new char[] { 'A', 'B', 'C'};
		
		char[] charArr4 = new char[10];
		
		short[] shortArr = { 0, 1, 2, 3};
		short[] shortArr2 = new short[] { 0, 1, 2, 3};
	
		short[] shortArr3;
		shortArr3 = new short[] { 0, 1, 2, 3};

		short[] shortArr4 = new short[10];
		
		int[] intArr = { 0, 1, 2, 3};
		int[] intArr2 = new int[] { 0, 1, 2, 3};
		
		int[] intArr3;
		intArr3 = new int[] { 0, 1, 2, 3};
		
		int[] intArr4 = new int[10];
		
		long[] longArr = { 0l, 1l, 2l, 3l};
		long[] longArr2 = new long[] { 0l, 1l, 2l, 3l};
		
		long[] longArr3;
		longArr3 = new long[] { 0l, 1l, 2l, 3l};
		
		long[] longArr4 = new long[10];
		
		float[] floatArr = { 0.0f, 1.0f, 3.0f};
		float[] floatArr2 = new float[] { 0.0f, 1.0f, 3.0f};
		
		float[] floatArr3;
		floatArr3 = new float[] { 0.0f, 1.0f, 3.0f};
		
		float[] floatArr4 = new float[10];
		
		double[] doubleArr = { 0.0, 1.0, 2.0, 3.0};
		double[] doubleArr2 = new double[] { 0.0, 1.0, 2.0, 3.0};
		
		double[] doubleArr3;
		doubleArr3 = new double[] { 0.0, 1.0, 2.0, 3.0};
		
		double[] doubleArr4 = new double[10];
		
		boolean[] booleanArr = { true, false, true, true};
		boolean[] booleanArr2 = new boolean[] {true, false, true, true};
		
		boolean[] booleanArr3;
		booleanArr3 = new boolean[] { true, false, true, true};
		
		boolean[] booleanArr4 = new boolean[10];
		
		// 참조타입(String)
		String[] strArr = {"A", "B" , "C", ""}; //" " : Empty String (빈 문자열)
		String[] strArr2 = new String[] {"A", "B" , "C", ""};
		
		String[] strArr3;
		strArr3 = new String[] { "A", "B", "C", ""};
		
		String[] strArr4 = new String[10];
		
		// 참조타입 변수안에 저장된 "객체의 주소"를, 현업에서는 "객체의 레퍼런스"
		// 라고 부른다!!!!
		
		System.out.println("1. byteArr :" + byteArr);
		System.out.println("2. charArr :" +charArr);
		System.out.println("3. shortArr :" +shortArr);
		System.out.println("4. intArr :" +intArr);
		System.out.println("5. longArr :" +longArr);
		
		System.out.println("6. floatArr :" +floatArr);
		System.out.println("7. doubleArr :" +doubleArr);
		
		System.out.println("8. booleanArr :" +booleanArr);
		
		System.out.println("9. strArr :" +strArr);
		
		System.out.println("1. byteArr :" + byteArr.length);
		System.out.println("2. charArr :" + charArr.length);
		System.out.println("3. shortArr :" + shortArr.length);
		System.out.println("4. intArr :" + intArr.length);
		System.out.println("5. longArr :" + longArr.length);
		
		System.out.println("6. floatArr :" + floatArr.length);
		System.out.println("7. doubleArr :" + doubleArr.length);
		
		System.out.println("8. booleanArr :" + booleanArr.length);
		
		System.out.println("9. strArr :" + strArr.length);
		
//		================================================================
//		배열의 순회(Traverse)
//		================================================================//
//		배열의 순회는 크게 (1) 내부순회 (2) 외부순회 가 있는데,
//		개발자의 코드로 하는 순회는 모두 (2) 외부순회에 해당
//		(1) 내부순회는 후에, STREAMS APT에서 가능함( 엄청빠름, 외부순회랑 비교불가)
		
//		=============================================
//		순회방법#1 : Classical For 문을 이용하는 방법
//		=============================================
		for(int counter=0; counter < byteArr.length; ++counter) {
			System.out.println("바이트 순회: " + byteArr[counter]);
			for(int counter2=0; counter < intArr.length; ++counter) {
				System.out.println("바이트 순회2: " + intArr[counter2]);
			}
		} // Classical For

//		=============================================
//		순회방법#2 : Enhanced For 문을 이용하는 방법
//		=============================================
//		문법 : for( 1개의 자료를 저장할 변수선언      : <자료구조> ) {
//			실행문장들...
//		} Enhanced For
		
		
		//배열의 인덱스 번호없이도 순회되며,
		// Classical For 문 보다 훨씬 빠름.
		// 대신, 배열의 인덱스 번호가 필요없을 때 사용
		// 순회시 배열의 인덱스 번호도 필요한 경우 => Classical For 문 사용
		for( byte element : byteArr ) {
			System.out.println("바이트순회: " + element);
		} // Enhanced For
		
		for(int element2 : intArr) {
			System.out.println("인트순회: " + element2);
		}
		
		
		
		
	} // main
} // end class
