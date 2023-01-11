package ch11;

public class BusTest1 {

	public static void main(String[] args) {
		
		Bus s1 = new Bus();
		Bus s2 = new Bus();
		Bus s3 = new Bus();
		Bus s4 = new Bus();
		
		s1.busColor = "빨간색";
		s1.busNumber = 1001;
		s1.busPay = 1700;
		s1.busStop = 5;
		
		s2.busColor = "초록색";
		s2.busNumber = 5;
		s2.busPay = 800;
		s2.busStop = 20;
		
		s3.busColor = "파란색";
		s3.busNumber = 99;
		s3.busPay = 1200;
		s3.busStop = 45;	
		
		s4.busColor = "노란색";
		s4.busNumber = 0;
		s4.busPay = 0;
		s4.busStop = 10;
		
		s1.busColor(); // 출력값 : 버스 색은 빨간색입니다.
		s1.busNumber(); // 출력값 : 버스 번호는 1001입니다.
		s1.busPay(); // 출력값 : 버스 요금은 1700원 입니다.
		s1.totalBusStop(); // 출력값 : 총 5개의 정류장이 있습니다.
		System.out.println("=====================");
		s2.busColor(); // 출력값 : 버스 색은 초록색입니다.
		s2.busNumber(); // 출력값 : 버스 번호는 5입니다.
		s2.busPay(); // 출력값 : 버스 요금은 800원 입니다.
		s2.totalBusStop(); // 출력값 : 총20개의 정류장이 있습니다.
		System.out.println("=====================");
		s3.busColor(); // 출력값 : 버스 색은 파란색입니다.
		s3.busNumber(); // 출력값 : 버스 번호는 99입니다.
		s3.busPay(); // 출력값 : 버스 요금은 1200원입니다.
		s3.totalBusStop(); // 출력값 : 총 45개의 정류장이 있습니다.
 		System.out.println("=====================");
		s4.busColor(); // 출력값 : 버스 색은 노란색입니다.
		s4.busNumber(); // 출력값 : 버스 번호는 0입니다.
		s4.busPay(); // 출력값 : 버스 요금은 0원 입니다.
		s4.totalBusStop(); // 출력값 : 총 10개의 정류장이 있습니다.

	}

}
