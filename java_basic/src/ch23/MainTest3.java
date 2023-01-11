package ch23;

public class MainTest3 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// 업캐스팅 <----------
		// 문법을 작성하고 실행시키기전까지
		// 컴파일 시점(사람이 작성한 언어를 기계어로 변역하는 과정)
		Fruit fruit1 = new Banana();
		
		Banana banana1 = new Banana();
		// 컴파일러는 타입만 먼저 바라본다 !!!
		((Banana)(fruit1)).origin = "태국"; // 다운 캐스팅
		
		int num = (int) 10.0;

	} // end of main

} // end of class
