package codingAssessment;

public class CeilingFan {
	
	public static final int OFF = 0;
    
    private int speed = OFF;
	private String direction = "clockwise";
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public void pullSpeedCord() {
		if (speed == 3) {
			speed = OFF;
		} else {
			speed++;
		}
	}
	
    public void pullDirectionCord() {
		if (direction.equals("clockwise"))
			direction = "antiClockwise";
		else 
			direction = "clockwise";
	}
	
	@Override
	public String toString() {
		return "CeilingFan [speed=" + speed + ", direction=" + direction + "]";
	}
	
	public static void main(String[] args) {
		CeilingFan fan1 = new CeilingFan();
		fan1.pullSpeedCord();	
		fan1.pullDirectionCord();
		System.out.println(fan1.toString()); 
	}

}
