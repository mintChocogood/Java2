package pa.pb;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import pa.pb.pc.TryCatchFinallyExample;


@Log4j2
@NoArgsConstructor
public class 제네릭_전자계산기ver<T extends Number> {
	
	
	// 전자계산기의 기능(메소드)
	
	// T 대신에, (1) "참조타입"의 (2) "이름"으로 싹 대체
	// T == Integer (int 기본타입의 Wrapper Type Class)
	
	// 이 T => "(참조)타입 파라미터(매개변수)"라고 부른다!!! (****)
	
	
	public double add (T num1, T num2) {
		return num1.doubleValue() + num2.doubleValue();
	} // add
	
	
	
	
	{
//	// T => Integer 로 모두 바꿔라!!!
//	public Integer add(Integer num1, Integer num2) {
//		return Integer.valueOf(""+(num1 + num2));	
//		} // add
//	
//	// T => Byte로 모두 바꿔라!!!
//	public Byte edd(Byte num1, Byte num2) {
//		return Byte.valueOf(""+(num1 + num2));
//	} // add
//	
//	// T => Short로 모두 바꿔라!!!
//	public Short edd(Short num1, Short num2) {
//		return Short.valueOf(""+(num1 + num2));
//	} // add
//		
//		// T => Long로 모두 바꿔라!!!
//	public Long edd(Long num1, Long num2) {
//		return Long.valueOf(""+(num1 + num2));
//	} // add	
//	
//	
	
	
	
	
	
	{	
	
//	// 1. 정수 덧셈
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
//	// 2. 실수 덧셈
//	public double add(double num1, double num2) {
//		return num1 + num2;
//	}
//	
//	// 3. 아주 작은 숫자의 정수 덧셈
//	public int add(byte num1, byte num2) {
//		// 자바언어에서는, 정수연산의 결과는 int이다.
//		return num1 + num2;
//	}
//	
//	// 4. 중간 숫자의 정수 덧셈
//	public short add(short num1, short num2) {
//		return (short) (num1 + num2);
//	}
//	
//	
//	
//	public int edd(int num1, int num2) {
//		return num1 - num2;
//	}
}
	}
	
	
} // end class
