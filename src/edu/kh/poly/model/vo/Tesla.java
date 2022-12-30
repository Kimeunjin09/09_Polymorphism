package edu.kh.poly.model.vo;

public class Tesla extends Car { // 전기차
	// car를 상속받을 수 있도록! => extends Car(부모)
	
	private int batteryCapacity; // 배터리 용량
	
	//기본생성자 ctrl + space => enter
	public Tesla() { 
		super(); // Car, Object아니고 바로 위에있는 부모 Car
	}
	
	//매개변수 생성자 alt + shift + s -> o 드롭박스(아래방향키) -> 매개변수
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	// getter/setter
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		// super참조변수
		return super.toString() + "/" + batteryCapacity;
	}
}
