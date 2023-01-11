package ch02;

// final의 3가지 용법
// class 앞에 final을 사용하면 상속을 못하게 막는다.
// method 앞에 final을 사용하면 오버라이드를 못하게 막는다.
// variable 앞에 final을 사용하면 상수로 만들어 버린다 --> 상수는 한번 초기화 하면 값을 변경할 수 없다.
public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 멈춘다.");
	}

}
