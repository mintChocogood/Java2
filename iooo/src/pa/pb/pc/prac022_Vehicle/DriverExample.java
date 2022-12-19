package prac022_Vehicle;

public class DriverExample {

	public static void main(String[] args) {
		// 1. 운전자 생성
		Driver driver = new Driver();
		
		// 2. 버스 생성
		Bus bus = new Bus();				// 자식객체 생성
		// 3. 택시 생성
		Taxi taxi = new Taxi();
		
		// 4. 운전자에게 운전할 차량으로,
		// 	  각각 버스와 택시 전달 (다형성-1)
		
		driver.drive(bus);
		driver.drive(taxi);
	} // main

} // end class
