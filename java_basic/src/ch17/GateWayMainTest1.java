package ch17;

public class GateWayMainTest1 {

	public static void main(String[] args) {
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(2);
		Zealot zealot1 = gateWay1.createZealot(); // 출력값 : 질럿을 생산합니다.
		Zealot zealot2 = gateWay1.createZealot(); // 출력값 : 질럿을 생산합니다.
		Zealot zealot3 = gateWay1.createZealot(); // 출력값 : 질럿을 생산합니다.
		Zealot zealot4 = gateWay1.createZealot(); // 출력값 : 질럿을 생산합니다.
		
		zealot1.showInfo(); // 출력값 : ==== 정보창 ====
//                                                      유닛이름 : 질럿1
//                                                         공격력 : 10
//                                                            체력 : 100
//                                                     ==== ==== ====
		
		gateWay1.showInfo(); // 출력값 : === 게이트웨이 정보 ===
//                                                             이름 : 게이트웨이1
		
		System.out.println("질럿 총 생산량 : " + GateWay.zealotCount); 
		// 출력값 : 질럿 총 생산량 : 4

	} // end of main

} // end of class
