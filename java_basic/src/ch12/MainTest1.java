package ch12;

public class MainTest1 {

	public static void main(String[] args) {
	
		// 생성자 ---> 생성을 시키는 자 !!!
		Bus bus100 = new Bus(1001, 1, 1);
		bus100.showInfo(); // 출력값 : 버스번호 : 1001
										            // 현재 승객 수 : 1
													// 현재 수익금 : 1
		System.out.println("==============");
		Bus bus200 = new Bus(200, 10, 1000);
		bus200.showInfo(); // 출력값 : 버스번호 : 200
        								// 현재 승객 수 : 10
										// 현재 수익금 : 1000
		System.out.println("==============");
		
		Student student = new Student("홍길동", 100);
//		Student student2 = new Student(); X
		// 사용자정의 생성자를 만들게 되면 강제성이 부여된다.
		student.showInfo(); // 출력값 ; 학생에 이름 홍길동
										        	 // 현재 학생에 용돈 : 100
		System.out.println("==============");
		
//		bus100.busNumber = 1001;
//		bus100.personCount = 0;
//		bus100.money = 0; // 값을 하나씩 넣고 있다. (초기화)
		Subway subway1 = new Subway(); // Subway에 똑같은 생성자가 존재함.
//		subway1.lineNumber = 1;
//		subway1.personCount = 0;
//		subway1.money = 0; // 값을 하나씩 넣어줘야한다.
		subway1.showInfo(); // 출력값 : 지하철 호선 번호 : 1
												      // 현재 승객 수 : 10
		                                              // 현재 수익금 : 1000 
		// Subway 해당 생성자 내에 이미 호선번호, 승객수, 수익금이 초기화 되어있음.
		System.out.println("==============");
		
		Subway subway2 = new Subway(2, 100, 1000);
		subway2.showInfo(); // 출력값 : 지하철 호선 번호 : 2
	                                      // 현재 승객 수 : 100
                                          // 현재 수익금 : 1000 
		
	} // end of main

} // end of class
