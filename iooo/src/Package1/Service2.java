package Package1;


public class Service2 {
	private String name;
	private int price;
	
	@PrintAnnotation
	public String getName() {
		return name;
	} // getName
	
	
	public int getPrice() {
		System.out.println("서비스2::getPrice() 호출됨");
		return price;
	} // getPrice
	
	
	
	
	
	
	
} // end class
