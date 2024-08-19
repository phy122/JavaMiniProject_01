package Mission_17;

public class Drone implements RemoteControl{

	int speed;

	@Override
	public void turnOn() {
		System.out.println("드론의 전원을 켭니다.");
		setSpeed(10);
	}

	@Override
	public void turnOff() {
		System.out.println("드론의 전원을 끕니다.");
		setSpeed(0);
	}

	@Override
	public void setSpeed(int speed) {
		if(MAX_SPEED < speed) {
			System.err.println("드론의 최대 속력은 200을 넘어갈 수 없습니다.");
			setSpeed(200);
		}
		else if(MIN_SPEED > speed) {
			System.err.println("드론의 최저 속력은 0밑으로 내려갈 수 없습니다.");
			setSpeed(0);
		}
		else {
			this.speed = speed; 
		}
		System.out.println("드론의 현재 속력은" + speed + "입니다.");
		
	}

}
