package ch12;

public class MainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		Student student = new Student("이순신", 10_000);
		Student studentKim = new Student("김유신", 50_000);
		Bus bus100 = new Bus(100, 0, 0);
		Bus bus200 = new Bus(200, 0, 0);
		Subway subway1 = new Subway(3, 0, 0);
		
		student.takeBus(bus100); // 이순신이 1300원을 내고 버스100을 탔다.
		student.showInfo(); // 출력값 : 학생에 이름 이순신
		                                             // 현재 학생에 용돈 : 8700 (10,000-1,300)
		System.out.println("===========");
		student.takeBus(bus200); // 이순신이 1300원을 내고 버스200을 탔다.
		student.showInfo(); // 출력값 : 학생에 이름 이순신
                                                     // 현재 학생에 용돈 : 7400 (8,700-1,300)
		
		System.out.println("===========");
		// 버스 100
		bus100.showInfo(); // 출력값 : 버스 번호 : 100
											        // 현재 승객 수 : 1 (0+1)
		                                            // 현재 수익금 : 1300 (0+1,300)
		System.out.println("===========");
		//버스200
		bus200.showInfo(); // 출력값 : 버스 번호 : 200
											        // 현재 승객 수 : 1 (0+1)
		                                            // 현재 수익금 : 1300 (0+1,300)
		System.out.println("===========");
		// 주소값
		studentKim.takeSubway(subway1); // 김유신이 1500원을 내고 지하철1을 탔다.
		studentKim.showInfo(); // 출력값 : 학생에 이름 김유신
		                                                   // 현재 학생에 용돈 : 48500 (50,000-1,500)
		System.out.println("===========");
		// 지하철 1
		subway1.showInfo(); // 출력값 : 지하철 호선 번호 : 3
											         // 현재 승객 수 : 1 (0+1)
		                                             // 현재 수익금 : 1500 (0+1,500)
		

	} // end of main

} // end of class
