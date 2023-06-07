package bicycle3;

public interface ISaddle {
	
	int Max_Height = 7;
	int Min_Height = 1;
	
	
	public abstract void Saddle(int s);
	
	
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
