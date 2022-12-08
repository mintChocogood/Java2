import java.util.Arrays;

public class Ray {
	// 1. 필드 선언
	String model; // 모델명
	int speed; // 현재속도
	
	// 2. 생성자 선언
	public Ray(String model) {
		this.model = model;
	} // 생성자
	
	// 3. 메소드 선언
	void run() {         	// 달리다
		for(int i = 10; i<=50; i+=10) {
			System.out.println(
					this.model + "가 달립니다. (시속:" + this.speed + "km/h");
			
		} //for
		
	} // run
	
	
	
	
	
}// end class
