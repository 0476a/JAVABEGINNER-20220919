package ch11;

public class Subway {
	// 지하철에 멤버 변수를 선언, 기능을 설계 해보자
	// 멤버 변수 선언
	String subwayName;
	String subwayRoute;
	int subwayPay;
	int subwayStop;
	
	// 기능 (메서드 선언)
	public void subwayName() {
		System.out.println("호선은" + subwayName + "입니다.");
	}
	
	public void subwayRoute() {
		System.out.println("경로는" + subwayRoute + "입니다.");
	}
	
	public void subwayPay() {
		System.out.println("지하철 요금은" + subwayPay + "원 입니다.");
	}
	
	public void subwayStop() {
		System.out.println("총" + subwayStop + "개의 역이 있습니다.");
	}

} // end of class
