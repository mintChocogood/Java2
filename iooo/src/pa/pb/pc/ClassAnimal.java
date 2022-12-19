package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ClassAnimal {

	// 핵심포인트: 세번째 런타입 익셉션인, ClassCastException을 경험하고
	//				그 원인으로 잘 기억하자
	public static void main(String[] args) {
		Dog dog = new Dog();
		ClassAnimal.changeDog(dog);
		
		Cat cat = new Cat();
		ClassAnimal.changeDog(cat);		
		
		
		
		
		
	} // main

	public static void changeDog(Animal animal) {	// 다형성-1 발생
		if(animal instanceof Dog dog) {	// Safe casting (안전한 강제 형변환)
//		Dog dog = (Dog) animal;  // Unsafe casting (안전하지않은 강제 형변환)
		log.info("- dog: {}" , dog);}											
	} // 메소드

	
} // end class
	class Animal{;;}
	class Dog extends Animal {;;}
	class Cat extends Animal {;;}





