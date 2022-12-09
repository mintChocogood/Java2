
public class Test3 {

	public static void main(String[] args) {
		
		System.out.println("선택한 번호는");
		int A;
		int B;
		int C;
		int D;
		int E;
		int F;
	    	 
	    	 
	    	 do {
	    		 A = (int)(Math.random()*6)+1;
	    		 B = (int)(Math.random()*6)+1;
	    		 C = (int)(Math.random()*6)+1;
	    		 D = (int)(Math.random()*6)+1;
	    		 E = (int)(Math.random()*6)+1;
	    		 F = (int)(Math.random()*6)+1;
	    		 
	    	 }while (A==B|A==C|A==D|A==E|A==F| B==C|B==D|B==E|B==F| C==D|C==E|C==F|D==E|D==F|E==F);
	    	 
	    
	    	System.out.println(A);
	    	System.out.println(B);
	    	System.out.println(C);
	    	System.out.println(D);
	    	System.out.println(E);
	    	System.out.println(F);
	    	
	    	// gitTest
	    	// good
		
	} // main
} // end class
