package Mission_17;

public class Driver {
	public static void main(String[] args) {
		RemoteControl Car = new RcCar();
		
		Car.turnOn();
		Car.setSpeed(50);
		Car.setSpeed(250);
		Car.setSpeed(-50);
		Car.turnOff();
		System.out.println();
		RemoteControl.changeBattery();
		System.out.println();
		
		RemoteControl drone = new Drone();
		
		drone.turnOn();
		drone.setSpeed(50);
		drone.setSpeed(250);
		drone.setSpeed(-50);
		drone.turnOff();
		System.out.println();
		RemoteControl.changeBattery();
		System.out.println();
		
	}

}
