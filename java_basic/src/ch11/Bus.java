package ch11;

public class Bus {
	// 변수명을 사용할때 주의점
	// 버스에 멤버 변수를 선언, 기능을 설계 해보자
	// 멤버 변수 선언
	int busNumber;
	String busColor;
	int busPay;
	int busStop;
	
	// 기능 (메서드 선언)
	public void totalBusStop() {
		System.out.println("총" + busStop + "개 의 정류장이 있습니다.");
	}
	
	public void busPay() {
		System.out.println("버스 요금은" + busPay + "원 입니다.");
	}
	
	public void busColor() {
		System.out.println("버스 색은" + busColor + "입니다.");
	}
	
	public void busNumber() {
		System.out.println("버스 번호는" + busNumber + "입니다.");
	}
	

} // end of class
