package pa.pb;

public class C2 {

	public static void main(String... args) throws ClassNotFoundException {
	C2 c2 = new C2();
	
	Class clazz = C2.class;
	System.out.println(clazz.getName());
	
	clazz = c2.getClass();
	System.out.println(clazz.getName());
	
	clazz = Class.forName("pa.pb.C2");
	System.out.println(clazz);
	
	




	}
} // end class
