package pa.pb.pc;

public interface MyInterface {		// 클래스로 선언할 객체의 규격
	// 추상메소드 (객체의 접점즉 규격)
	public abstract void 메소드1();	
	
	// 디폴트 메소드를 도대체 어떻게 사용하란 것인가~~~
	public default void 메소드2() {
		System.out.println("MyInterface::메소드2 실행.");
	}
	
} // end interface
