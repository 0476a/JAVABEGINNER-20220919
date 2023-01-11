package ch02;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자동차가 자율 주행을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춤.");
	}

//	@Override // 마음대로 바꾸면 안됨. 막아야함!
//	public void run() {
//		drive();
//		startCar();
//	}
	
	
}
