
public class StudentExample {

	// Student 클래스(=붕어빵틀)로부터 객체(=붕어빵)을 생성해보자!!!
	public static void main(String[] args) {

		// 참조타입 변수에 저장된 객체의 주소 = 객체의 레퍼런스(Reference == 참조)
		Student s1 = new Student();
		System.out.println(s1);
		
//		============
		
		Student s2 = new Student();
		System.out.println(s2);
		
		int hashCode = s2.hashCode(); // OID : Object IDentifier(객체식별자)
		System.out.println("+ hashCode: " + hashCode);
		
		String logicalAddress = Integer.toHexString(hashCode);
		System.out.println("+ logicalAddress: " + logicalAddress);
		
//		============		
		
		int[] arr = new int [] {1 , 2, 3};
		System.out.println("+ arr: " + arr);
		
		
	} // main

} // end class
