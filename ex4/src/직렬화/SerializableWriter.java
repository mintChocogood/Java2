package 직렬화;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	// 핵심포인트: 지정된 경로의 파일에, ClassA/ClassB/ClassC 타입의 객체를
	// 직렬화하여 저장하자!
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos;){
		ClassA classA = new ClassA();		// Serializable 꼬리표를 달고 있는 객체 생성 
		
		// 객체의 필드를 직접 초기화
		classA.field1 = 1;
		classA.field2.field1 = 2;
		ClassA.field3 = 3;				// 정적필드는 기본값으로 바뀜
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush();
		} // 트라이
	} // main

} // end class
