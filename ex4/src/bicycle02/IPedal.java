package bicycle02;

public interface IPedal {

	public abstract void stepOn();
	public abstract void stepOff();
	
	public default void stepOnOff(boolean steps) {
		if(steps) {
			stepOn();
		} else {
			stepOff();
		} // if-else
	} // stepOnOff
	
} // end interface
