//package sec05.exam01_string_equals;

public class Sample43 {

	public static void main(String[] args) {
		
		// 문자열 리터럴을 값으로 가지고 있는 두 String 타입의 참조변수간에
		// 동등비교 연산자(==,!=)를 실습하는 예제
		
		// 우리가 알고 있는 "문자열 리터럴" 이란 상수는 힙(HEAP) 영역에 한번만 자동생성되는
		// 객체이고, "같은 문자열 리터럴" 을 여러번 사용하는 경우라도, 결국은 하나의 주소를
		// 공유하는게 바로, "문자열 리터럴"이다!
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else { 
			System.out.println("strVar1과 strVar2는 참조가 다름");
		} // if-else

//		=========================
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} // if
		
		
//		=======================
		
		// 두 참조변수의 문자열이 같은 문자로 구성되어 있는가!?
		if(strVar1.equals(strVar2)) { // 대소문자를 구분(case-sensitive)
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} //if
		
		strVar1="ABCD";
		strVar2="aBcD";
		
		// 두 참조변수의 문자열이 같은 문자로 구성되어 있는가!?
		if(strVar1.equalsIgnoreCase(strVar2)) { // 대소문자를 구분하지 않음 (case-insensitive)
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
//		====================
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		// 참조타입변수 2개에 대한, 동등비교연산자(==, !=)는 두 참조변수에 저장되어 있는
		// 객체의 주소가 같은지(==), 다른지(!=)를 비교하는 연산자이다!!
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} //if
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		} // if else
		
//		=========================
		
		// 두 문자열 타입의 참조변수에 저장된 문자열 객체의 "구성문자"가 같은지
		// 다른지를 비교하는 역할을 수행하는게 
		// "기준문자열참조변수".equals("비교문자열참조변수")로 판단한다.
		// 단, Case-Sensitive (대소문자구분)
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} // if
		
		
		
		
		
		
		
		
		
		
		
		
	} // main
} //end class
