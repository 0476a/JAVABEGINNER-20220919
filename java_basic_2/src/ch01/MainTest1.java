package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 다형성 : 클래스를 다양한 형태로 바라볼 수 있다.
		
		// 부모 타입으로 자식 객체를 생성하는 상태 -> 업 캐스팅 된 상태
		Animal animal1 = new Human();
		Animal animal2 = new Tiger();
		Animal animal3 = new Eagle();
		
		//
		animal1.move(); // 사람 // 출력값 : 두발로 걷습니다.
		animal2.move(); // 호랑이 // 출력값 : 호랑이가 네 발로 움직입니다.
		animal3.move(); // 독수리 // 출력값 : 독수리가 하늘로 날아 갑니다.

	} // end of main

} // end of class
