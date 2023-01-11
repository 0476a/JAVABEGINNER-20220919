package ch23;

public class MainTest2 {

	public static void main(String[] args) {
		
		Banana[] bananas = new Banana[10]; // 담을 수 있는 공간만 생긴거임. 객체 생성 X
		Peach[] peachs = new Peach[10];
		
		for (int i = 0; i < peachs.length; i++) {
			bananas[i] =new Banana();
			peachs[i] = new Peach();
		}
		
		// 자바에서 다형성이란??? (많은 다 형태형)
		// 부모 타입 변수에 자식 객체를 생성할 수 있다.
		// 단, 부모 자식 관계에서만 사용가능하다.
		
		// 부모 데이터 타입 = 자식 데이터 타입 --> 업캐스팅
		Fruit fruit1 = new Banana();
		Fruit fruit2 = new Peach();
		
		// 다형성 - 통으로 관리 할 수 있다.
		// 연관된 데이터 타입
		Fruit[] fruits = new Fruit[20];
		for(int i = 0; i < 10; i++) {
			fruits[i] = new Banana();
		}
		
		for(int i = 10; i < 20; i++) {
			fruits[i] = new Peach();
		}
		
		// 20개
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showIfo();
			System.out.println("-------------");
			// 출력값 : 상품명 : 바나나      
			//              가격 : 2000       
			//              ------------- X 10
			// 출력값 : 상품명 : 복숭아      
			//              가격 : 3000         
			//              ------------- X 10
		}
		
		
	} // end of main

} // end of class
