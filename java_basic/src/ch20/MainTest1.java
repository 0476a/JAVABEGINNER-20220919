package ch20;

public class MainTest1 {

	public static void main(String[] args) {
		Banana banana = new Banana();
		Peach peach = new Peach();
		
		banana.showInfo(); // 출력값 : =======
		//                                            상품명: 바나나
		//                                            가격: 2000
		//                                             =======
		
		
		peach.showInfo(); // 출력값 : =======
		//                                            상품명: 복숭아
		//                                            가격: 5000
		//                                             =======

	}

}
