
public class Car {

	
	// 필드 : (1) 객체의 고유속성  (2) 객체의 상태  (3) 부품
	// 필드는 관례상 "선언" 만으로 끝나야 하나, 아래 보시는 바와 같이,
	// 선언과 동시에 초기값을 줄 수는 있지만, 실전에서는 아래와 같이 "절대", Never,
	// Ever 하지 않고, 순수히 필드 선언만 합니다.  (***)
	
//	(1) 객체의 고유속성(필드)
	String company; // 필드의 선언과 동시에 초기화 수행
	String model = "그랜저";       // Ditto. ("상동" 이라는 뜻)
	String color = "검정";         // Ditto. 
	int maxSpeed = 350;            // Ditto.
	
//	(2) 객체의 상태
	int speed;            // 현재속도, 선언만 함(** Best **)


} //end class

