package app;

public class Car {
	private String carName = null;
	private String bodyColor = null;
	private int maxSpeed = 0;
	private int speed = 0;

	public Car() {

	}

	public Car(String carName, String bodyColor, int maxSpeed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
	}

	public Car(String carName, String bodyColor, int maxSpeed, int speed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	public String getCarName() {
		return this.carName;
	}

	public String getBodyColor() {
		return this.bodyColor;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed >= 0) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out.println("最高速度に、この値" + maxSpeed + "をセットすることはできません");
		}

	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		} else {
			System.out.println("最高速度に、この値" + speed + "をセットすることはできません");

		}
	}
}