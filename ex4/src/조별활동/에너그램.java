package 조별활동;

import java.util.Arrays;
import java.util.Scanner;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
@NoArgsConstructor
@Log4j2
public class 에너그램 {

	
	
	@SuppressWarnings("unlikely-arg-type")
	public static boolean is그거(String word) {
	int[] arr = new int[word.length()];
	boolean is그거 = true;
	 for(int i = 0; i < arr.length; i++) {
		arr[i] = word.charAt(i);
		 if(arr.equals(word)) {
			 log.trace("ㅇㅇ");
		 } 
		
		  
	 } // for
	return false;
	}
		public static void main(String[] args) {
//			
//			 Scanner sc = new Scanner(System.in);
//			 
//			 System.out.println("입력 >> ");
//			String inputString = sc.nextLine().charAt(0);
//			System.out.println(에너그램.is그거(inputString));
//			 
		} // main
	
} // end class
