package ch25;

public class MainTest2 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		// 추상 클래스는 기본적으로 new 할 수 없다.
		
		// 업캐스팅
		Computer computer1 = new MyNoteBook();
		Computer computer2 = new Desktop();
		
		computer1.display(); // 출력값 : LG 그램으로 화면으로 표시 합니다.
		computer1.typing(); // 출력값 : 노트북 키보드로 글을 작성
		System.out.println("---------");
		computer2.display(); // 출력값 : DeskTop display 
		computer2.typing(); // 출력값 : 키보드로 타이핑 한다. 

	} // end of main

} // end of class
