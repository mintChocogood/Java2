package 직렬화;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor(access=AccessLevel.PUBLIC)
public class ClassB implements Serializable {
	
	int field1;
	
}
