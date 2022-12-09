package bicycle02;

public interface ISaddle {
	
	public static final int MIN_SADDLE_HEIGHT = 0;
	public static final int MAX_SADDLE_HEIGHT = 100;
	public abstract void setSaddle(int height);
	public abstract void getOn();
	public abstract void getOff();
	
	
	public default void getOnOff(boolean onSaddle) {
		if(onSaddle) {
			getOn();
		} else {
			getOff();
		} // if-else
	} // getOnOff
	

} // end interface
