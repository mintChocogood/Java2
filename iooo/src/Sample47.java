import java.util.Arrays;

public class Sample47 {

	public static void main(String[] args) {

		
		
		int[] scores = new int[] {83, 90, 87};

//		int sum1 = 0;
//		for (int k=0; k<3; k++) {
//			sum1 += scores[k];
//		} //for
//	System.out.println("총합 :" + sum1);
	
//	int B = 0;
//	for(int A : scores) {
//        for(int i : A) {
//        	System.out.println("총합 :" + i);
//        }
//	}
		
		int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1 [" + i + "] : " + arr1[i]);
		}
		
		System.out.println(Arrays.toString(arr1));
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		
		
		System.out.println(Arrays.toString(arr1));
		
	
		double[] arr2 = new double[3];
		
		System.out.println(Arrays.toString(arr2));
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
	
		String[] arr3 = new String[3];
		
		System.out.println(Arrays.toString(arr3));
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length);
		

		String[] languages = new String[3];
		
		System.out.println(languages); 
		
		// Literal = 순수한 값 + Immutable(수정불가능)
		languages[0] = "언어1";
		languages[1] = "언어1";
		languages[2] = "언어1";
		
		// OID(Object Identifier) : 자바의 모든 객체는 자신만의 고유한 식별자를
		//                          가집니다. 마치, 개개인의 주민번호처럼...
		
		
		System.out.println(languages[0].hashCode());
		System.out.println(languages[1].hashCode());
		System.out.println(languages[2].hashCode());
	
	
	
	
	
	
	} // main

} // end class
