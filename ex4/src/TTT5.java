
public class TTT5 {

	public static void main(String... args) throws ClassNotFoundException {
		
		// 특정 클래스에 대한 메소드 영역의 "Clazz객체"의 주소(레퍼런스, 참조)를
		// 얻어내는 3가지 방법을 배웁니다. 꼭 이 3가지 방법 모두 많이 연습하시기
		// 바랍니다.
		
		String name = "기서";
		
		// 연습1: String 클래스에 대한 메소드 영역의 "Clazz객체"를
		//		  3가지 방법으로 얻어 봅시다!!!
		
		// 1st. method: 참조타입명.class 하면 주소를 얻을 수 있습니다.
		Class clazz = myClass.class;
		System.out.println(clazz instanceof Class);
		System.out.println("1. clazz" + clazz);
		System.out.println("\t+ logical address: " + Integer.toHexString(clazz.hashCode())
		);
		// 2nd. method: 객체를 저장한 참조타입변수가 있는 경우로,
		//              참조변수명.getClass() 메소드 호출하면 획득가능
		
		myClass MyClass = new myClass();
			clazz = MyClass.getClass();
			System.out.println(clazz instanceof Class);
			System.out.println("2. clazz" + clazz);
			System.out.println("\t+ logical address: " + Integer.toHexString(clazz.hashCode())
					);
		// 3rd. method : java.lang.Class 클래스의 메소드 중에,
		//               Clazz 객체의 주소를 반환해주는 메소드로
//			             정적메소드인 forName(String FQCN)이 있습니다.
		//            
		//     Class clazz = Class.forName("FQCN");
			String FQCN = MyClass.getClass().getName(); // MyClass의 FQCN 획득
			System.out.println("3. FQCN: " + FQCN);
			clazz = Class.forName(FQCN);
			
			
			
			System.out.println(clazz instanceof Class);
			System.out.println("3. clazz" + clazz);
			System.out.println("\t+ logical address: " + Integer.toHexString(clazz.hashCode())
			);
			
			
			
			
	} // main
} // end class

class myClass {
	;;
} // end class