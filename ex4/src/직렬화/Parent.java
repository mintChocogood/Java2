package 직렬화;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString

// Non-Serializable 함 : 객체의 직렬화/역직렬화 불가능
public class Parent 
//	implements Serializable  
	{
	
	public String field1;
	
	
} // end class
