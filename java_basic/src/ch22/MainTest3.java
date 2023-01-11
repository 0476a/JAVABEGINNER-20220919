package ch22;

public class MainTest3 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		Zealot[] zealots = new Zealot[3];
		zealots[0] = new Zealot("질럿1");
		zealots[1] = new Zealot("질럿2");
		zealots[2] = new Zealot("질럿3");
		
		// 반복문
		for (int i = 0; i < zealots.length; i++) {
			// new Zealot("질럿1")
			zealots[i].showInfo(); // 출력값 : === 상태창 ===
//                                                            유닛 이름 : 질럿1~3
//                                                         유닛 공격력 : 10
//                                                              유닛 hp : 100
//                                                       =================
		}
		
		// 문제 1 - 마린을 담을 배열 10개 생성
		Marine[] marines = new Marine[10];
		marines[0] = new Marine("마린1");
		marines[1] = new Marine("마린2");
		marines[2] = new Marine("마린3");
		marines[3] = new Marine("마린4");
		marines[4] = new Marine("마린5");
		marines[5] = new Marine("마린6");
		marines[6] = new Marine("마린7");
		marines[7] = new Marine("마린8");
		marines[8] = new Marine("마린9");
		marines[9] = new Marine("마린10");
		
		// 반복문 사용해서 초기화
		for (int i = 0; i < marines.length; i++) {
			// 화면에 showInfo 호출
			marines[i].showInfo();// 출력값 : === 상태창 ===
//                                                          유닛 이름 : 마린1~10
//                                                          유닛 공격력 : 5
//                                                             유닛 hp : 100
//                                                         =================
		}
		
		// 문제2 - 저글링
		Zergling[] zerglings = new Zergling[5];
		zerglings[0] = new Zergling("저글링1");
		zerglings[1] = new Zergling("저글링2");
		zerglings[2] = new Zergling("저글링3");
		zerglings[3] = new Zergling("저글링4");
		zerglings[4] = new Zergling("저글링5");
		
		for (int i = 0; i < zerglings.length; i++) {
			zerglings[i].showInfo(); // 출력값 : === 상태창 ===
//                                                              유닛 이름 : 저글링 1~5
//                                                                    유닛 공격력 : 5
//                                                                   유닛 hp : 100
//                                                           =================
		}

	} // end of main

} // end of class
