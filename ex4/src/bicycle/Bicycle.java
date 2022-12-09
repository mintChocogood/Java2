package bicycle;

public class Bicycle {
	String model;
	double speed;
	String rider;
	
	Break breaked = new Break();
	Sit sit = new Sit();
	Chain chain= new Chain();
	Pedal pedal= new Pedal();
	Unlock unlock = new Unlock();
	Wheel wheel = new Wheel();
	
		
		public Bicycle(String model, double speed ,String rider) {
			this.model = model;
					
			System.out.println(this.model);
			
			sit.sitDown();
			pedal.press(); 
			wheel.굴러가다();
			
		}
		public void 굴러가다() {
			;;
		}

		public void p() {
			;;
		}


		public void s() {
			;;
		}
		
		public void wheel() {
			;;
		}
		
	
} //bicycle


