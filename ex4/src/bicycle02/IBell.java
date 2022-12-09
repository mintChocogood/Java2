package bicycle02;

public interface IBell {
	
	public static final int MIN_DECIBEL = 0;
	public static final int MAX_DECIBEL = 125;
	
	public abstract void ring();
	
	public default int ringTheBell(boolean isRing) {
		if(isRing) {
			ring();
			return MAX_DECIBEL;
		} else {
			return MIN_DECIBEL;
		} // if-else
	} // ringTheBell

} // end interface
