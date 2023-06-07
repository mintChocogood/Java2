package prac026_Animal;


public class AnimalExample {

	// 핵심포인트: 이전의 일반 부모타입 클래스에 기반한 다형성 구현을
	//			   부모타입인 추상클래스에 기반한 다형성 구현으로 변경
	//			   (변경내용의 핵심은, 자식클래스에서 메소드 재정의를 반드시 하도록
	// 			    강제성이 부여된 추상메소드를 상속시킴)
	public static void main(String[] args) {
		Dog dog = new Dog();	// 다형성-1이 전혀 아님!!
		Cat cat = new Cat();	// 다형성-1이 전혀 아님!!
		
		dog.sound();			// 자기자신의 메소드 호출
		cat.sound();			// 자기자신의 메소드 호출
		
//		========================
		
		// 다형성-1, 2를 이용한 다형성 발현
		Animal animal = new Dog();		// 다형성-1
		animal.sound();  				// 다형성-2
		
		animal = new Cat();				// 다형성-1
		animal.sound();  				// 다형성-2
		
//		========================
		
		AnimalExample.animalSound(new Dog());
		AnimalExample.animalSound(new Cat());
	} // main
	
	public static void animalSound(
			Animal animal	// 다형성-1: 부모타입의 매개변수
		) {
		animal.sound();		// 다형성-2: 인자인 자식객체의 재정의된 메소드가 무조건 호출
	} // animal sound

} // end class
