package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProductExample {

	// 핵심포인트: 멀티타입 파라미터를 가지는, 제네릭타입의 클래스를
	// 			   어떻게 "사용"(사용할 때)하는지 경험해보자!!
	public static void main(String[] args) {
		// 1. 제네릭 타입 클래스 Product의 객체생성 ---> "사용할 때!!!!" (***)
		//	  So, 타입파라미터 T --> 구체타입으로 "Tv"를 전달
		//        타입파라미터 M --> 구체타입으로 "STring"을 전달

//		Product<Tv, String> product1 = new Product<>();
//		
//		product1.setKind(new Tv());
//		product1.setModel("스마트Tv");
//		
//		Tv tv = product1.getKind();
//		String tvModel = product1.getModel();
//		
//		log.trace("1. tv: {}, 2 tv Model{}, 3. product1: {}" + 
//		tv, tvModel, product1);
		
//		============
		
		Product<Car,String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("아반떼");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		
		log.trace("1. car: {}, 2 carModel{}, 3. product2: {}" + 
				car, carModel, product2);
		
	} // main

} // end class
