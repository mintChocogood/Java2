package bicycle3;

public interface IBicycle 
extends IBell, IBrake, IHandle, IKickStand, ILock, IPedal, IGear, ISaddle{

	
	public abstract void move();
	
} // end interface
