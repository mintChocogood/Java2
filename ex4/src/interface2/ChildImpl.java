package interface2;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class ChildImpl implements IParent1, IParent2 {




		

	@Override
	public void 메소드2() {
		log.trace("메소드1() 호출.");
	}

	@Override
	public void 메소드1() {
		log.trace("메소드2() 호출.");
}
	
} // end class
