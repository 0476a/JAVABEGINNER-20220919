package ch25;

public class Desktop extends Computer {

	@Override
	public void display() {
		// 일반 메서드로 재정의 되었다.
		System.out.println("DeskTop display ");
	}

	@Override
	public void typing() {
		// 일반 메서드로 재정의 되었다.
		System.out.println("키도드로 타이핑 한다. ");
	}
	
	// 추상 메서드를 포함하는 클래스는 추상 클래스가 되어야 한다.
	// 오류를 해결하는 방법
	// 1. DeskTop 클래스 추상 클래스로 만들어 준다.
	// 2. 추상 메서드를 일반 메서드로 재정의 한다. --> 오버라이드

}
