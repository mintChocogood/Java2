package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectInputOutputStreamExample {

	// 핵심포인트: 우리가 만든 객체를 파일에 저장하자!
	//			   이때, 파일에 저장할 객체를 직렬화(Serialization) 하여 저장합니다!
	// 그럼 객체의 직렬화란? 객체의 필드의 데이터 => 바이트열로 변환하는 과정을 의미(******)
	
	public static void main(String[] args) throws Exception {
		@ToString
		class TTT implements Serializable{
			String name = "기서";
			transient int age = 23;
		} // end class
		
//		--------------------------------
		
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos;){
			// oos.writeObject 메소드가 "객체의 직렬화" 수행
			// 이때, 직렬화 가능한 객체는 Serializable 태그 인터페이스를 구현해야 함!(***)
		oos.writeObject(10);			// Auto-boxing : Integer객체 출력
		oos.writeObject(3.14);			// Ditto : Double 객체 출력
		oos.writeObject(new int[] {1,2,3});		// 배열객체 출력
		oos.writeObject(new String("홍길동"));	// 문자열객체 출력
		
//		---------------------------------------
		
	
		
		TTT obj = new TTT();
		oos.writeObject(obj);	// TTT 타입의 객체는 Serializable 하지 않습니다!!
		
		oos.flush();
		} // 트라이-위드-리소스
		
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try(fis; ois; ){
			// ois.readObject 메소드: 객체의 "역직렬화" 수행
			
		Integer obj1 = (Integer) ois.readObject();	// 객체의 역직렬화 수행
		Double obj2 = (Double) ois.readObject();	// Ditto
		int[] obj3 = (int[]) ois.readObject();		// Ditto
		String obj4 = (String) ois.readObject();	// Ditto
		TTT obj5 = (TTT) ois.readObject();
		
		log.info("1. obj1: {}, type: {}", obj1, obj1.getClass().getName());
		log.info("2. obj2: {}, type: {}", obj2, obj2.getClass().getName());
		log.info("3. obj3: {}, type: {}", Arrays.toString(obj3), obj3.getClass().getName());
		log.info("4. obj4: {}, type: {}", obj4, obj4.getClass().getName());
		log.info("5. obj5: {}, type: {}", obj5, obj5.getClass().getName());
		
		} // 트라이-윗-리소스
		
		
		
		
		
	} // main

} // end class
