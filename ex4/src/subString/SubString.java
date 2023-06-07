package subString;
import java.util.*;
public class SubString {
	public static String printSubStr(String str,int len) {
        String smallest = str.substring(0,len);
        String largest= str.substring(0,len);
        
        
        for (int i=1;i<=str.length()-len;i++) {
        	String temp = str.substring(i,i+len);
        	if(smallest.compareTo(temp)>0) {
        		smallest=temp;
        	}
        	if(largest.compareTo(temp)<0) {
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
            String res = SubString.printSubStr(first, len);
            System.out.println(res);
        }catch(Exception e) {
        	
        }
        finally {
			sc.close();
		}
        
	}
}
