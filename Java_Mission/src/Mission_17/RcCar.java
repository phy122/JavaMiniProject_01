package Mission_17;

public class RcCar implements RemoteControl {

	
	int speed;
	@Override
	public void turnOn() {
		System.out.println("RC카의 전원을 켭니다.");
		setSpeed(10);
	}
	@Override
	public void setSpeed(int speed) {
		if(speed > RcCar.MAX_SPEED) {
			System.err.println("RC카의 최대 속력은 200을 넘길 수 없습니다.");
			setSpeed(200);
		}
		else if(speed <RcCar.MIN_SPEED) {
			System.err.println("RC카의 최저 속력은 음수로 갈 수 없습니다.");
			setSpeed(0);
		}
		else {
			 this.speed = speed;
			 System.out.println("RC카의 현재 주행 속도는" + speed + "입니다.");
		}
	
	}
	@Override
	public void turnOff() {
		System.out.println("RC카의 전원을 종료합니다");
		
	}
	
	

}
