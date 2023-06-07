package Package1;

import java.util.Scanner;

public class 애너그램 {

	public static boolean isAnagram(String word) {
	
		int[] arr = new int[word.length()];
		// 배열 생성
		boolean isAnagram = true;
		// boolean값 설정
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
		} // for
		
		for(int i =0; i < arr.length / 2 +1; i++) {
			if(arr[i] != arr[arr.length -1 -i]) {
				
				isAnagram = false;
			}
		} // for
		return isAnagram;
	} // 정적메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> ");
		String str = sc.next();
		
		System.out.println(isAnagram(str));
		
		sc.close();
	}
	
	
	
	
}
