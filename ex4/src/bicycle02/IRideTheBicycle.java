package bicycle02;

public interface IRideTheBicycle extends IVehicle, IHandle, IBrake, IBell, ILock {
	
	public abstract void changeTire();
	public abstract void changeKickStand(boolean onKickStand);
	
} // end interface
