package Package1;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	
// Java Reflection API를 이용한 어노테이션 처리
		// 이 API의 시작은 바로 "Clazz객체"를 얻는 것에서 시작됩니다.(***)
	public static void main(String[] args) {
		// 1. Service 클래스에 대한 Clazz 객체를 획득해서,
		// 이 Clazz 객체로부터, 현재 클래스에 명시적으로 선언된 모든 메소드를
		// Method[] 배열객체로 획득합니다.
		
		Class clazz = Service2.class;
		Method[] declaredMethods = clazz.getDeclaredMethods();
		 
		// 2. Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			
			// 3. PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// 3-1. PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 3-2. 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 3-3. 구분선 출력
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				} // if for
				
				System.out.println();
				
				try {
					// 3-4 메소드 호출
					method.invoke(new Service2());
				} catch (Exception e) {;;}  // try-catch
				
				System.out.println();
			} // if
		} // for
				
	} // main

} // end class
