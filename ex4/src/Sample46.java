import java.util.Arrays;

public class Sample46 {
                       // 배열타입의 참조변수
	public static void main(String[] args) {
//                         ---------------
		int[][] arr2d = {{1,2,3}, {8}, {5,6} };
		
		for(int[] element : arr2d) {
			for(int i : element) {
				System.out.println(i);
			} //for 문
		} // Enhanced For 문
		
	} // main

} // end class
