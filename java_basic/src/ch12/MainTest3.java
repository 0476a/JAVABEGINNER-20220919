package ch12;

public class MainTest3 {

	public static void main(String[] args) {
		// 학생 객체를 2명이상 생성
		Student student1 = new Student("김철수", 10_000);
		Student student2 = new Student("박사자", 20_000);
		Student student3 = new Student("이득신", 100_000);
		// 버스 객체를 2대 이상 생성
		Bus bus1 = new Bus(148, 0, 0);
		Bus bus2 = new Bus(99, 0, 0);
		// 지하철 객체를 1대 이상 생성
		Subway subway1 = new Subway(1, 0, 0);
		
		//메서드를 호출 시켜서 동작 시켜 보세요!!
		student1.takeBus(bus1); // 김철수가 1300원을 내고 버스1을 탔다.
		student1.showInfo(); // 출력값 : 학생에 이름 김철수
		                                               // 현재 학생에 용돈 : 8700 (10,000-1,300)
		bus1.showInfo(); // 출력값 : 버스 번호 : 148
		                                       // 현재 승객수 : 1 (0+1)
		                                       // 현재 수익금 : 1300 (0+1,300)
		System.out.println("================");
		student2.takeBus(bus2); // 박사자가 1300원을 내고 버스2를 탔다.
		student2.showInfo(); // 출력값 : 학생에 이름 김철수
                                                      // 현재 학생에 용돈 : 18700 (20,000-1,300)
		bus2.showInfo(); // 출력값 : 버스 번호 : 99
		                                       // 현재 승객수 : 1 (0+1)
		                                       // 현재 수익금 : 1300 (0+1,300)
		System.out.println("================");
		student3.takeSubway(subway1); // 이득신이 1500원을 내고 지하철1을 탔다.
		student3.showInfo(); // 출력값 : 학생에 이름 이득신
                                                      // 현재 학생에 용돈 : 98500 (100,000-1,500)
		subway1.showInfo(); // 출력값 : 지하철 호선 번호 : 1
		                                             // 현재 승객수 : 1 (0+1)
		                                             // 현재 수익금 : 1500 (0+1,500)
		System.out.println("================");
		// 비행기라는 클래스를 설계
		Airplane airplane1 = new Airplane("서울", "부산", 0, 0);
		
		// 학생이 비행기를 타다 메서드를 만들어서 동작 시켜 보기!!
		student3.takeAirplane(airplane1); // 이득신이 50000원을 내고 비행기1을 탔다.
		// 학생3
		student3.showInfo(); // 출력값 : 학생에 이름 이득신
		                                               // 현재 학생에 용돈 : 48500 (98,500-50,000)
		// 비행기1
		airplane1.showInfo(); // 출력값 : 출발지 : 서울
		                                              // 도착지 : 부산
		                                              // 현재 승객수 : 1 (0+1)
		                                              // 현재 수익금 : 50000 (0+50,000)
		
		
	} // end of main

} // end of class
