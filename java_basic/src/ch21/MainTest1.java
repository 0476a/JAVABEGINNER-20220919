package ch21;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		for (int i = 0; i <= 10; i++ ) {
			zealot1.attack(marine1);
		} // 출력값 : 질럿1이 마린을 공격합니다. X 11
		  //              마린1은 이미 사망!!
		
		marine1.attack(zealot1); // 출력값 : 마린 1이 질럿을 공격합니다.
		zergling1.attack(marine1); // 출력값 : 저글링1이 마린을 공격합니다.
		                                           //             마린1은 이미 사망
		
		marine1.showInfo(); // 출력값 : === 상태창 ===
		//                                              유닛 이름 : 마린1
		//                                               유닛 공격력 : 5
		//                                                 유닛 hp : 0
		//                                         =================
		

	} // end of main

} // end of class
