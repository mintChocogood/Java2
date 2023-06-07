
public class Car3 {
	String 제조사;
	String 모델명;
	String 컬러;
	int 최대속도;
	
	Car3() {
		System.out.println("Car3::Constructor invoked");
	} // 기본 생성자
	
	Car3(String 모델명) {
		this(모델명, null);   // 다른 생성자 호출, 무조건 생성자안에서 맨 위에 위치하여야함
		System.out.println("Car3::Car(모델명) invoked");
//		this.모델명 = 모델명;
		// this(모델명, null); <= 생성자 안에서 맨위에 위치하지않으면 성립하지않음
		
	} // 생성자 2
	
	Car3(String 모델명, String 컬러){
		this(null, 모델명, 컬러, 0);
		System.out.println("Car::Car(모델명, 컬러) invoked");
//		this.모델명 = 모델명;
//		this.컬러 = 컬러;
		
	} // 생성자 3
	
	Car3(String 제조사, String 모델명, String 컬러, int 최대속도){
		System.out.println("Car::Car(제조사, 모델명, 컬러, 최대속도) invoked");
		this.제조사 = 제조사;
		this.모델명 = 모델명;
		this.컬러 = 컬러;
		this.최대속도 = 최대속도;
	} // 생성자 4
	
	
	
	
	
	
	
	
	
	
	
	
	
}
