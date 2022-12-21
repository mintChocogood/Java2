package 연습;

import java.util.Scanner;

public class 섭스트링 {



    public static String getSmallestAndLargest(String str, int len) {
        String smallest = str.substring(0,len);
        String largest= str.substring(0,len);
        
        
        for (int i=1;i<=str.length()-len;i++) {
            String temp = str.substring(i,i+len);
            if(smallest.compareTo(temp)>0) {
                smallest=temp;
            } // if
            if(largest.compareTo(temp)<0) {
                largest=temp;
            } // if
       } // for
        return smallest + "\n" + largest;
    } // 정적메소드

     
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자입력 >> ");
		String input = sc.nextLine();
		
		System.out.println("숫자입력 >> ");
		int input2 = sc.nextInt();
		
		System.out.println(섭스트링.getSmallestAndLargest(input, input2));
		
	} // main
} // end class
