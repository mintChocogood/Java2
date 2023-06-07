import java.util.Arrays;

public class TTT3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 13, 6, 8, 19, 23, 41, 23, 19, 4, 7, 3 };
		int num;
		for(int i = 0; i < arr.length; i++ ) {
			for(int k = 0; k < arr.length - 1; k++) {
				if(arr[k] > arr[k + 1]) {
					arr[k] = arr[k] + arr[k+1];
					arr[k+1] = arr[k] - arr[k+1];
					arr[k] = arr[k] - arr[k+1];
					System.out.println(Arrays.toString(arr));
				} // if 
			}// if for
		}// for
		System.out.println(Arrays.toString(arr));
		

		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // end class
