package ch04;

public class MainTest {

	public static void main(String[] args) {

		// 다형성 !!!

		RemoteController[] remote = new RemoteController[3];

		// (remote[0]) <-- ToyRobot에 주소값
		remote[0] = new ToyRobot();
		// 업캐스팅 된 상태이기 떄문에 컴파일 시점 (문법 작성하는 시점에는 데이터 타입만 확인가능하다.)
		// remote[0].name; <-- 불가

		remote[1] = new Refrigerator();
		remote[2] = new Tellevsion();

		// 한번에 모든 객체들을 on 해주겠니??
		for (int i = 0; i < remote.length; i++) {
			remote[i].turnOn();
			System.out.println("----------");
			// 출력값 : 장난감 로봇을 켭니다.
//			               ----------------
//			               냉장고를 켭니다.
//			               ----------------
//			               티비를 켭니다.
//			               ----------------
		}

		for (int i = 0; i < remote.length; i++) {
			remote[i].turnOff();
			System.out.println("----------");
			// 출력값 : 장난감 로봇을 끕니다.
//                         ----------------
//                         냉장고를 끕니다.
//                         ----------------
//                         티비를 끕니다.
//                         ----------------
		}
		
		// 인터페이스도 기본적으로 new 할 수 없다.
		// RemoteController controller = new Tellevsion(); // 업 캐스팅 된 상태

		// 문제 1. foreach 문을 사용해서 notification 메서드를 전부 호출해주세요.
		for (RemoteController r : remote) {
			if (r instanceof ToyRobot) {
				((ToyRobot) r).notification(); // 출력값 : 땅땅땅따아앙 ~~~~
			} else if (r instanceof Refrigerator) {
				((Refrigerator) r).notification(); // 출력값 : 띠ㄸ리링~!~~
			} else if (r instanceof Tellevsion) {
				((Tellevsion) r).notification(); // 출력값 : 텔레~~~비~~~♬
			}
		}

		// 문제2. 반복문을 돌다가 만약 데이터 타입이 ToyRobot 이라면 name 변수에 '건담' 이라는 값을 추가 해주세요.
		// 1. 0 - 1 - 2 - ToyRobot 타입인지 먼저 확인한다.
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				// 여기에 코드가 들어오면 ToyRobot 이라는 데이터 타입을 보장
				// remote[i] // 토이로봇 주소값
				// remote[i].name // 업캐스팅된 상태 -> 안보임 (컴파일 시점)
				((ToyRobot)remote[i]).name = "건담";
			}
		}
		// 문제3. remote[0] 를 활용해서 name 값을 출력해 보세요. -- 다운캐스팅
		String toyRobotName = ((ToyRobot)remote[0]).name;
		System.out.println("toyRobotName : " + toyRobotName);
		// 출력값 : toyRobotName : 건담
	} // end of main

}
// end of class
