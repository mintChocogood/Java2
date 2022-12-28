package subString;
import java.util.Scanner;

public class SubString2 {
	public static boolean isSubsmall(String smallest, String str,int len) {
		for(int i=0;i<len;i++) {
			if(smallest.charAt(i)>str.charAt(i)) {
				return true;
			}
			else if (smallest.charAt(i)<str.charAt(i)) {
				return false;
			}
			else {
				;;
			}
		}
		return false;
	}
	public static boolean isSublarge(String largest, String str,int len) {
		for(int i=0;i<len;i++) {
			if(largest.charAt(i)<str.charAt(i)) {
				return true;
			}
			else if (largest.charAt(i)>str.charAt(i)) {
				return false;
			}
			else {
				;;
			}
		}
		return false;
	}
	public static String printSubStr2(String str, int len) {
		String smallest = str.substring(0,len);
        String largest= str.substring(0,len);
        
        
        for (int i=1;i<=str.length()-len;i++) {
        	String temp = str.substring(i,i+len);
        	if(SubString2.isSubsmall(smallest, temp, len)) {
        		smallest=temp;
        	}
        	if(SubString2.isSublarge(largest, temp, len)) {
        		largest=temp;
        	}
        }
        return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      
        
        try(sc;){
        	String first = sc.nextLine();
        	int len = sc.nextInt();
            String res = SubString2.printSubStr2(first, len);
            
            System.out.println(res);
        }catch(Exception e) {
        	
        }
        finally {
			sc.close();
		}
	}
}
