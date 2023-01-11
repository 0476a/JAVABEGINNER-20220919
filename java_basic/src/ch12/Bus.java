package ch12;

public class Bus {
	
	int busNumber;
	int personCount;
	int money;
	
	// 생성자 - 리턴 타입이 없다. 클래스 이름과 같다 (대문자)
	// 컴파일러가 기본생성자 만들어 주지 않는다
	// 버스라는 객체를 메모리에 올리기 위해서 Bus(100, 1, 10) <-- 강제성이 부여 되었다.
	public Bus(int b, int p, int m) {
		busNumber = b;
		personCount = p;
		money = m;
	}
	
	// 버스를 탈 때 (수익금의 증가, 승객 증가)
	public void take(int pay) {
		// 1000 = 1000;
		// money = money + pay
		money += pay; // 'take' 함수를 사용할 때 money 값에 pay를 더해 준다.
		//personCount = personCount + 1;
		personCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("현재 승객 수 : " + personCount);
		System.out.println("현재 수익금 : " + money);
	}

} // end of class
