
public class Test2 {

	public static void main(String[] args) {

		
		
//		for(int index = arr.length - 1; index >= 0; --index){
//			if(arr[index] == 1 | arr[index] == 0) {
//				continue;
//			} //if 
//			
//			else {
//				for (int j = 2; j<= arr[index]; j++) {
//					if()
//				}
//			}
//	}
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int index = arr.length - 1; index >= 0; --index) {
			int number = arr[index];
			switch(number) {
			case 0, 1 -> {;;}
			default  -> {
				boolean isPrimeNumber = true;
				
				for(int m = 2; m < number; m ++) {
					if(number % m ==0) {
						isPrimeNumber = false;
						break;
					}//if
				}//for
			if(isPrimeNumber) {
			System.out.println(number);	
			}               //if
			}
			} // switch expression
		}//for
		
		
		
		
		

} // main
} // end class
