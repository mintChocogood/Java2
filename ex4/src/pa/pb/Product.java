package pa.pb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter					// 각각의 필드에 대해서, 자동으로 Setter 메소드 생성
@Getter					// 각각의 필드에 대해서 자동으로 Getter 메소드 생성
@NoArgsConstructor		// 기본생성자를 자동생성

// 제네릭타입 중, "제네릭 클래스"를 "선언" ---> 타입파라미터를 선언
public class Product<T, M> {		// 다중(멀티) 타입 파라미터를 가지고있어요.
	
	private T kind;			// 종류
	private M model;		// 모델

	
	



	// 접어놨음
	
//	============================================================ //
//	1. Setter 메소드란 무엇인가? 어떻게 선언하는가?
//	   지켜야할 규악은 무엇인가?
//	============================================================ //
	
	
	
	// Setter 메소드의 역할 = 지정된 필드에 값을 변경하는 역할 (****)
//							  그래서 매개변수가 있고, 타입을 필드의 타입과 동일
//							  대신, 리턴타입이 없음(즉, void)
	// Setter 메소드의 이름 = 접두사(set) + 필드이름 => 카멜기법적용
	// 예: 접두사(set) + 필드이름(kind) = setkind => setKind
	public void setKind(T kind) {
		this.kind = kind;
	} // setKind
	
	public void setModel(M model) {
		this.model = model;
	} // setModel
	
//	-------------------------------------
	
//	============================================================ //
//	1. Getter 메소드란 무엇인가? 어떻게 선언하는가?
//	   지켜야할 규악은 무엇인가?
//	============================================================ //
	
	// Getter 메소드의 역할 = 지정된 필드의 값을 반환(리턴)해주는 역할 (***)
//							  그래서 매개변수가 없음 (***)
//						      대신, 리턴타입이 필드의 타입과 동일 (***)
	// Getter 메소드의 이름 = 접두사(get) + 필드이름 => 카멜기법적용
	// 예: 접두사(get) + 필드이름(kind) = getkind => getKind
	
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}

} // end class
