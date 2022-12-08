
public class SingletonExample1 {

	public static void main(String[] args) {

		
		SingletonEx1 obj1 = SingletonEx1.getInstance();
		SingletonEx1 obj2 = SingletonEx1.getInstance();
		SingletonEx1 obj3 = SingletonEx1.getInstance();
		SingletonEx1 obj4 = SingletonEx1.getInstance();
		SingletonEx1 obj5 = SingletonEx1.getInstance();
		SingletonEx1 obj6 = SingletonEx1.getInstance();
		SingletonEx1 obj7 = SingletonEx1.getInstance();
		SingletonEx1 obj8 = SingletonEx1.getInstance();
		SingletonEx1 obj9 = SingletonEx1.getInstance();
		SingletonEx1 obj10 = SingletonEx1.getInstance();
		
		
		System.out.println("1. obj1: " + obj1);
		System.out.println("2. obj2: " + obj2);
		System.out.println("3. obj3: " + obj3);
		System.out.println("4. obj4: " + obj4);
		System.out.println("5. obj5: " + obj5);
		System.out.println("6. obj6: " + obj6);
		System.out.println("7. obj7: " + obj7);
		System.out.println("8. obj8: " + obj8);
		System.out.println("9. obj9: " + obj9);
		System.out.println("10. obj10: " + obj10);
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체 입니다.");
		} else {
System.out.println("다른 싱글톤 객체 입니다");	} // if-else

}
}