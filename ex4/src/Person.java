

// 대전제1: 모든 클래스에는 반드시 생성자가 있어야 한다
// 대전제2: 개발자가 클래스에 명시적으로 생성자를 하나라도 선언하지 않으면,
//          대신 컴파일러가 기본 생성자를 만들어주고, 반대로 개발자가 명시적으로
//			생성자를 하나라도 선언하면, 절대 컴파일러는 개입하지 않는다!!!!
// 그런데, 개발자가 아래와 같이, 생성자조차도 선언하지 않으면,
// 자바 컴파일러가 소위 "기본생성자(Default Constructor)"를 자동으로 생성(컴파일 시점에)
public class Person {

	String name;
	int age;
	
	// compiled : public Person();
	
	// 기본 생성자 선언
	// Step.1 생성자의 이름은 무조건 클래스 이름과 동일하게 짓는다!!
	// Step.2 생성자의 이름 오른쪽에 소괄호 블록 =>'()' 을 붙입니다!
	// Step.3 Step.2의 소괄호 블록 오른쪽에 중괄호 블록 =>'{}'을 열고 닫습니다.
	// Step.4 class 선언부 앞에 public이란 키워드가 붙어 있으면, 똑같이
	// 생성자 이름앞에 public을 붙인다(없으면, 똑같이 안붙인다)
	// (개발자가 직접 생산자를 선언할 때에는, public이란 키워드를 붙이고
	//  안붙이고는 개발자가 결정한다!)
	
	
	
	
				// Parameter          //
				// 매개변수 선언부    //
				//--------------------//
	public Person(String name, int age) {   // 생성자 블록

		// this 란 키워드는
		// (1) 그대로 콘솔에 출력이 가능하며
		// (2) 자바언어의 키워드이자
		// (3) 특정 클래스로부터 생성된 인스턴스를 가리킨다
		// (4) 대부분의 자바책에서는, 클래스에서 생성된 객체 "자신"을 의미한다
		//     라고 거의 다 이렇게 설명하고 끝!! 그럼, 이해가 안가면 어캄!
		System.out.println("1. 생성자 내부에서 this: " + this);
		
		
//		System.out.println("1. name: " + name);
//		System.out.println("2. age: " + age);
		
	// *** 생성자 역할: new 연산자가 힙에 생성한 객체의 필드의 값을
	//					개발자가 원하는 값으로 초기화 해주는 역할을 수행
//		this.name = name;
//		this.age = age;
	} // 기본생성자(Default Constructor)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // end class