package bicycle3;

public interface IHandle {
	
	
//	public abstract void turnLeft();
//	public abstract void turnRight();
	
	public abstract void turnRight(double menu);
	public abstract void turnLeft(double menu);
	public abstract void holdCenter();
	
	public default double holdHandle(double menu) {
		if(menu > 0) {
			turnRight(menu);
			return menu * 5;
		} else if(menu < 0) {
			turnLeft(menu);
			return menu * 5;
		} else {
			holdCenter();
			return menu;
		} // if-else
	} // holdHandle
	
	
} // end interface
