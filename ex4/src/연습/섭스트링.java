package 연습;

import java.util.Scanner;

public class 섭스트링 {

	public static String getSmallestAndLargest(String s, int k) {
        String S = s.substring(0, k);
        String L = s.substring(0, k);
        
        for(k = 1; k<s.length()-1; k++) {
        	
        } // for
        
        
        return S + "\n" + L;
    } // 메소드
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println();
		
	} // main
} // end class
