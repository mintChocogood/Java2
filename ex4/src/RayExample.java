
public class RayExample {

	// Car 클래스에 선언된 인스턴스멤버(필드+메소드)를 사용하는 예제
	public static void main(String[] args) {

		// 인스턴스(객체) 없이는 사용할 수 없기 때문에,
		// 우선 인스턴스(객체)부터 생성해야 만 한다!! (***)
		Ray myRay = new Ray("레이");
		Ray yourRay = new Ray("마티즈");
		               
		myRay.run();                 // 인스턴스 메소드 호출
		yourRay.run();               // 인스턴스 메소드 호출
	}

}
