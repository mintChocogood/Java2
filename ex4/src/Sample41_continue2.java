
public class Sample41_continue2 {

	public static void main(String[] args) {
		
		Outer: for(;;) {
			for(int i=1; i<=10; i++) {
				if(i % 2 != 0) {
					continue;
					
					
				}//if
			System.out.println(i);
			
			} // Inner for
		} // Outer for
	} // main
} // end class
