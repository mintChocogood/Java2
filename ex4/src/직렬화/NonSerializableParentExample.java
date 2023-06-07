package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
@Log4j2
@ToString
public class NonSerializableParentExample {

	
	// 핵심포인트: 상속관계에 있는 부모객체와 자식객체가 있을 때,
	//			   부모타입은 Non-Serializable 하고, 자식타입은 Serializable 할 때,
	//			   자식객체를 파일에 직렬화 시킨다면, 과연 부모객체는 어떻게 될까??
	//  	 	   분명히, 힙에는 자식객체보다 먼저 부모객체가 생성된다!! 라는 대전제가 있다.
	public static void main(String[] args) throws Exception {
		
//		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		try(fos; oos;){
//		Child child = new Child();
//		
//		child.field1 = "홍길동";
//		child.field2 = "홍삼원";
//		
//		// 직렬화 전에 자식객체를 출력해봅니다.
//		log.info("1. child: {}" , child);
//		log.info("2. child.field1: {}" , child.field1);
//		// 자식객체의 직렬화 수행:
//		// (*주의*) 객체를 직렬화 할 때,
//		//			직렬화 대상 객체가 부모/자식 상속관계를 가진다면,
//		//			상속관계를 따라서, ***부모객체까지*** 직렬화 대상에 포함시켜 수행된다!
//		oos.writeObject(child);	// *** 객체의 직렬화 수행!
//		
//		oos.flush();
//		} // 트라이
		
//		----------------------------------------------
		
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try(fis; ois;) {
			Child child2 = (Child) ois.readObject();
			
			log.info("3. child2: {}", child2);
			log.info("4. child2.field2", child2.field1);
		} // 트라이
	} // main

} // end class
