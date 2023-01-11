package ch24;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		zealot1.attack(marine1); 
		// 출력값 : 질럿1이 마린1을 공격합니다.
		marine1.showInfo(); 
		// 출력값 : 
//		        === 상태창 ===
//				유닛 이름 : 마린1
//				유닛 공격력 : 5
//				유닛 hp : 90
//				=================
		
	} // end of main

} // end of class
