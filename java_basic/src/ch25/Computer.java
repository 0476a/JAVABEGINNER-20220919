package ch25;

// 추상클래스란 추상메서드를 포함하는 클래스 단 필수 조건 아닙니다.
// 기본적으로 new 할 수 없게 만든다.
public abstract class Computer {
	
	// 메서드에 선언부만 존재
	// 추상 메서드를 포함 클래스는 추상 클래스가 되어야 한다.
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

} 
