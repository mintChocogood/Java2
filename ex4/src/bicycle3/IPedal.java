package bicycle3;

public interface IPedal{
	
	
	public abstract void moveSlow(); 
	public abstract void moveNormal();
	public abstract void moveFast();
	
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
