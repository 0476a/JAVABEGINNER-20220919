package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		Car aiBmw = new AICar();
		Car bmw = new ManualCar();
		
		aiBmw.run(); //출력값 : 시동을 켭니다.
//		                                    자동차가 자율 주행을 합니다.
//		                                    자동차가 스스로 멈춤.
//		                                    시동을 끕니다.
		
		System.out.println("-----------");
		bmw.run(); //출력값 : 시동을 켭니다.
//                                      사람이 운전을 합니다.
//                                      사람이 브레이크를 밟아서 멈춘다.
//                                      시동을 끕니다.

	} // end of main

} // end of class
