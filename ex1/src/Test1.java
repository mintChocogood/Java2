import java.util.Arrays;
@Log4j2
public class Test1 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(arr));
		for(int index = arr.length - 1; index >= 0; --index){
			if(arr[index] == 1 | arr[index] == 0) {
				continue;
			} // if
			else {System.out.print(arr[index] + " = ");
	         for (int j = 2; j <= arr[index]; j++) {
	        	if(arr[index] % j == 0) {
	        		System.out.print(j + " ");
	        		}         
	        	}
	         }
	System.out.println();}
		
//		for(int i = 0; i < arr.length; i++) {
//			boolean isPrime = true;
//			
//			for(int j = 2; j < arr[i]; j++) {
//				if(arr[i] % j ==0) {
//					isPrime = false;
//				}
//			}
//			
//			if()
//		}
		
		
 
		









	} // main
} // end class




