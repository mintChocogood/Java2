package pa.pb;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@Log4j2
@ToString
// 제네릭을 사용하지 않을 때 (타입파라미터를 가지지 않을 때),
// 클래스의 선언
// 핵심포인트: 제네릭 타입 클래스 선언
public class Box<T /*, K, J, E*/> {	// 제네릭 타입 파라미터 T라고 부름!
	private T t;		// 필드의 타입도 제네릭으로 선언
	
	// 메소드의 매개변수와 리턴타입도 제네릭타입 파라미터(T)로 선언
	public T get() {
		log.trace("get() 실행됨.");
		return t;
		} // get
	
	public void set(T t) { 
		log.trace("set({}) 실행됨.", t);
		
		this.t = t; 
		} // set
	
	
	
	
	{
//	private Object object;		// 상자안에 객체를 저장할 필드(다형성-1 이 적용됨)
//	
//	
//	// 상자에 어떤 객체이든 저장해주는 메소드 - 다형성 1을 이용
//	public void set(Object object) {	
//		log.trace("set({}) 실행됨.", object);
//		
//		this.object = object;
//	} // set
//	
//	// 상자에 저장되는 객체를 되돌려주는 메소드
//	public Object get() {
//		log.trace("get() 실행됨.");
//		
//		return this.object;
//	} // get
	}
} // end class
