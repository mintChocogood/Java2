package bicycle02;

public interface IHandle {
	
	public abstract void turnRight(int menu);
	public abstract void turnLeft(int menu);
	public abstract void holdCenter();
	
	public default int holdHandle(int menu) {
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
