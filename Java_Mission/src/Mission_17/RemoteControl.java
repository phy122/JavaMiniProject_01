package Mission_17;

public interface RemoteControl {

	
	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	static void on() {
		System.out.println("전원을 켭니다.");
	}
	static void off() {
		System.out.println("전월을 끕니다.");
		
	}
	
	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
}
