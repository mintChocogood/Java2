package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoxExample<T> {
	
	public static void main(String[] args) {
		Box box = new Box();				// 비어있는 상자 생성
	
//		---
		
		box.set("아기공룡둘리"); // 상자(Box객체)에 문자열 저장
		
		// 다형성-1: 조상객체 품에 안겨있는 문자열 객체를 강제로(강제형변환)
		//  		 끄집어내어 저장
		String name = (String) box.get();	// 상자에 저장된 객체를 반환
		log.info("1.name: {}" , name);
		
		
		box.set(new Apple() );
		Apple apple = (Apple) box.get();
		
		log.info("2. apple: {}" , apple);
		
		
		
		
		
		
	} // main
	
} // end class
