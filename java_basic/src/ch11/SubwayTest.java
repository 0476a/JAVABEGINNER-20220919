package ch11;

public class SubwayTest {

	public static void main(String[] args) {
		Subway s1 = new Subway();
		Subway s2 = new Subway();
		
		s1.subwayName = "1호선";
		s1.subwayPay = 1850;
		s1.subwayRoute = "다대포 방면";
		s1.subwayStop = 38;
		
		s2.subwayName = "2호선";
		s2.subwayPay = 2150;
		s2.subwayRoute = "수영 방면";
		s2.subwayStop = 16;
		
		s1.subwayName(); // 출력값 : 호선은 1호선입니다.
		s1.subwayPay(); // 출력값 : 지하철 요금은 1850원입니다.
		s1.subwayRoute(); // 출력값 : 경로는 다대포 방면입니다.
		s1.subwayStop(); // 출력값 : 총 38개의 역이 있습니다.
		System.out.println("===============");
		s2.subwayName(); // 출력값 : 호선은 2호선입니다.
		s2.subwayPay(); // 출력값 : 지하철 요금은 2150원입니다.
		s2.subwayRoute(); // 출력값 : 경로는 수영 방면입니다.
		s2.subwayStop(); // 출력값 : 총 16개의 역이 있습니다.
		

	}

}
