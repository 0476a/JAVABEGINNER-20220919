package ch12;

public class Subway {
	
	int lineNumber;
	int personCount;
	int money;
	
	// 멤버 변수를 제외하고 제일 먼저 실행되는 코드이다.
	// 생성자 오버로딩 (생성자를 여러개 만드는 기법)
	// 생성자 1
	public Subway() {
		lineNumber = 1;
		personCount = 10;
		money = 1000;
	}
	// 생성자 2
	public Subway(int l, int p, int m) {
		lineNumber = l;
		personCount = p;
		money = m;
	}
	
	// 지하철을 탈때 (수익금 증가, 승객 증가)
	public void take(int pay) {
		money += pay;
		personCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 호선 번호 : " + lineNumber);
		System.out.println("현재 승객 수 : " + personCount);
		System.out.println("현재 수익금 : " + money);
	}
	
	

} // end of class
