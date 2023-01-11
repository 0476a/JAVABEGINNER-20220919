package ch17;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("홍길동질럿");
		Zealot zealot2 = new Zealot("이순신질럿");
		Marine marine1 = new Marine("티모마린");
		Marine marine2 = new Marine("야스오마린");
		Zergling zergling1 = new Zergling("애쉬저글링");
		Zergling zergling2 = new Zergling("누누저글링");
		
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
		zealot1.attackMarine(marine1); // 출력값 : 홍길동질럿 이 티모마린을 공격합니다.
																	   // 티모마린은 이미 사망하였습니다.
		                                                               // 공격 hp 0 이거나 0보다 작다면 공격기능을 없애기
		
		marine1.showInfo(); // 출력값 : ==== 정보창 ====
		//                                             유닛이름 : 티모마린
		//                                                공격력 : 5
		//                                                   체력 : 0 (공격력 10의 홍길동질럿에게 11번 데미지 받음)
		//                                              ==== ==== ====
		
		marine2.attackZealot(zealot1); // 출력값 : 야스오마린 이 홍길동질럿을 공격합니다.
		marine2.attackZealot(zealot1); // 출력값 : 야스오마린 이 홍길동질럿을 공격합니다.
		marine2.attackZealot(zealot1); // 출력값 : 야스오마린 이 홍길동질럿을 공격합니다.
		
		zealot1.showInfo(); // 출력값 : ==== 정보창 ====
		//                                             유닛이름 : 홍길동질럿
		//                                                공격력 : 10
		//                                                   체력 : 85 (공격력 5의 야스오마린에게 3번 데미지 받음)
		//                                              ==== ==== ==== 
		
		
		// 여기서 질럿1에 hp만 확인하고 싶다면??
		// getter 사용
		System.out.println(zealot1.getHp()); // 출력값 : 85
		
		
	} // end of main

} // end of class
