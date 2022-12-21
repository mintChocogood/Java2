package subString;

import java.util.Scanner;
import java.util.TreeSet;

public class SubString4 {
	public static String printSubStr3(String str, int len) {
		String smallest = "";
        String largest= "";
        
        TreeSet<String> treeSample = new TreeSet<>();
        
        
        for (int i=0;i<=str.length()-len;i++) {
        	treeSample.add(str.substring(i,i+len));
        }
        
        smallest =treeSample.first();
        largest = treeSample.last();
        
        treeSample.clear();
        return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc;){
	    	String first = sc.nextLine();
	        int len = sc.nextInt();
	        String res = SubString4.printSubStr3(first, len);
	        System.out.println(res);
	    }catch(Exception e) {
	    	
	    }
	}
	
}
