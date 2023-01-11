package ch23;

public class MainTest6 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		// 배열 선언 및 생성 -- 업캐스팅, 다운캐스팅, instanceof 사용 !!!
		Fruit[] fruits = new Fruit[5];
		
		// 다형성 -> 업캐스팅!
		fruits[0] = new Peach();
		fruits[1] = new Banana();
		fruits[2] = new Peach();
		fruits[3] = new Banana();
		fruits[4] = new Peach();
		
		// 5번
		// 복숭아 타입이면 "복숭아는 맛있다"를 출력하시오!
		// instaceof, 다운 캐스팅
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showIfo();
			if(fruits[i] instanceof Peach) {
				System.out.println("복숭아는 맛있다.");
			}
			System.out.println("-------------");
		}
		
		// 출력값 : 
//		상품명 : 복숭아
//		가격 : 3000
//		복숭아는 맛있다.
//		-------------
//		상품명 : 바나나
//		가격 : 2000
//		-------------
//		상품명 : 복숭아
//		가격 : 3000
//		복숭아는 맛있다.
//		-------------
//		상품명 : 바나나
//		가격 : 2000
//		-------------
//		상품명 : 복숭아
//		가격 : 3000
//		복숭아는 맛있다.
//		-------------

		
		
	} // end of main

} // end of class
