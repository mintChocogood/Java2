package pa.pb;

public class TTT {
	
	
	// 기본타입과 그 Wrapper Type 간에, 발생되는
	// Auto-Boxing/Unboxing에 대해서 경험하자!!!
	
	public static void main(String[] args) {
		// 1. byte ---------> Byte
		byte b = Byte.valueOf("5");			// Auto-Unboxing
		Byte obj = 5;						// Auto-Boxing
		
		// 2. char -----------> Character
		char ch = Character.valueOf('A');	// Auto-Unboxing
		Character c = 'A';					// Auto-Boxing
		
		// 3. short ---------> Short
		
		short sh = Short.valueOf("500");
		Short s = 3;
		
		// 4. int ------------> Integer
		int i = Integer.valueOf(3);
		Integer in = 10;
		
		// 5. long ----------> Long
		long l = Long.valueOf(5000);
		Long lo = 500L;
		
		// 6. float ------------> Float
		float f = Float.valueOf("3.14159");
		Float fl = 3.14159F;
		
		// 7. double ------------> Double
		double d = Double.valueOf("3.2323232323");
		Double Do = 3.24;
		
		// 8. boolean -----------> Boolean
		boolean bol = Boolean.valueOf("true");
		boolean bol2 = Boolean.valueOf(true);
		Boolean bo = true;
		
		System.out.println(bol);
		System.out.println(bo);
		
	} // main

} // end class
