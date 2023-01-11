package ch23;

public class MainTest4 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// 다형성을 이용한 배열 선언
		Fruit[] fruits = new Fruit[4];
		
		// 다형성 !!!
		fruits[0] = new Banana();
		fruits[1] = new Peach();
		fruits[2] = new Banana();
		fruits[3] = new Peach();
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i].showIfo(); 
			// 출력값 : 상품명 : 바나나
//			                   가격 : 2000
//			                 상품명 : 복숭아
//			                    가격 : 3000
//		                   	상품명 : 바나나
//			                    가격 : 2000
//			                  상품명 : 복숭아
//			                     가격 : 3000
		}
		
		// 꼭 기억!
		// instanceof - 데이터 타입 확인 (다형성에서)
		if (fruits[1] instanceof Banana) {
			System.out.println("바나나 데이터 타입");
		} else {
			System.out.println("바나나 타입이 아닙니다.");
		}
		// 출력값 : 바나나 타입이 아닙니다. (fruits[1]은 Peach 타입이다.)
		System.out.println("-------------------");
		
		// 문제 - 데이터 타입이 바나나 이면 화면에
		// origin 값을 출력하시오.
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] instanceof Banana) {
				System.out.println(((Banana)fruits[i]).origin);
				// 출력값 : 바나나타입에만 필리핀 출력!
			}
			fruits[i].showIfo();
			System.out.println("-----------------");
		}

	} // end of main

} // end of class
