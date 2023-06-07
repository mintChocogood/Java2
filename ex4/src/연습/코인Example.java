package 연습;

import java.util.Arrays;
import java.util.Stack;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
@ToString
@Log4j2
public class 코인Example {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		

		
		
		for(int i = 0; i<arr.length; i++) {
			stack.push(arr[i]);
		} // for
		log.info(Arrays.toString(arr));
			for(int i = 0; i<arr.length; i++) {
			arr[i] = stack.pop();
			}// for
			log.info(Arrays.toString(arr));
			
		//		for(int i : arr) {
//			stack.push(i);
//			log.info(" 스택 : {}",i );
//		} // enhanced for 
			
//		stack.push((arr[0]));
//		stack.push((arr[1]));
//		stack.push((arr[2]));
//		stack.push((arr[3]));
//		stack.push((arr[4]));
//		stack.push((arr[5]));
//		stack.push((arr[6]));
//		stack.push((arr[7]));
//		stack.push((arr[8]));
//		
//		log.info(stack);
		
		

		
	} // main

} // end class
