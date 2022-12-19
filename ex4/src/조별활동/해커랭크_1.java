package 조별활동;


public class 해커랭크_1 {

	public void s2(String s, int k, int b){
		for(k = 0; k<s.length(); k+=2) {
			for(b = 3; b<s.length(); b+=2) {
				System.out.println(s.substring(k,b));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	해커랭크_1 a = new 해커랭크_1();
	a.s2(null, 0, 0);
	
		
		
	} // main
} // end class
