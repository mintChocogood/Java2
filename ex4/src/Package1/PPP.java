package Package1;

import lombok.extern.log4j.Log4j2;
import pa.pb.pc.Parent;

@Log4j2
public class PPP {
	
	// 익명자식 객체 코딩기법을 통해,
	// 명시적인 자식클래스의 선언없이 자식객체 생성 및 사용
	public static void main(String[] args) {
   
	Parent parent = new Parent() { // 다형성-1
	 @Override
	public void parentMethod() {
		log.info("아빠메소드 호출");
	} // 아빠메소드
	}; // "익명자식객체"
	
	log.info("1. parent: {} " , parent);
	
	parent.age = 23;
	parent.name = "기서";
	
	parent.parentMethod(); 		// 다형성-2
	
	
	}
} // class
