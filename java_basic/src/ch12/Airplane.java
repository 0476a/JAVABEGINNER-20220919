package ch12;

public class Airplane {
	
	// 멤버 변수
	String startSpace;
	String endSpace;
	int personCount;
	int money;
	
	// 생성자
	public Airplane(String s, String e, int p, int m) {
		startSpace = s;
		endSpace = e;
		personCount = p;
		money = m;
	}
	
	// 비행기를 탙때 (수익금 증가, 승객 증가)
	public void take(int pay) {
		money += pay;
		personCount++;
	}
	
	// 메서드 (멤버함수)
	public void showInfo() {
		System.out.println("출발지 : " + startSpace);
		System.out.println("도착지 : " + endSpace);
		System.out.println("현재 승객 수 : " + personCount);
		System.out.println("현재 수익금 : " + money);
	}

} // end of class
