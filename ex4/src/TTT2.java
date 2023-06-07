import java.util.Arrays;

public class TTT2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 13, 6, 8, 19, 23, 41, 23, 19, 4, 7, 3 };
		int num;
		
		for(int counter = 0; counter< arr.length; counter++) {
		
				for(int A = 0; A < arr.length - 1; A++) {
					   //13          6
					if(arr[A] > arr[A + 1]) {
			//       6	     6
					num = arr[A + 1];
					//6       13
					arr[A + 1] = arr[A];
					//    6
					arr[A] = num;        // << 이거 없이 할 것

				
//					System.out.println(num);
				} // if
			System.out.println(Arrays.toString(arr));
		} // if for
					
		} // for
		
		
		
//		int[] arr = 
		
		
		
		
	
//		
//		do {
//			
//			int[] arr2 = { 13, 6, 8, 19, 23, 41, 23, 19, 4, 7, 3 };
//			
//		
//			
//			
//			
//			
//			
//		}while()
//		
		
		
		
		
		
		
		
		
//		----------------
//		int a = 10;
//		int b = 20;
//		(1) int temp = a;
//		(2) a = b;
//      (3) b = temp;
		
		
		
		
		
//		int[] A = new int[] { 1, 2, 3};
//		int[] B = new int[] {4, 5, 6};
	
		
	}

}
