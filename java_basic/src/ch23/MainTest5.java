package ch23;

public class MainTest5 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {

		// 다형성을 이용한 배열 선언
		Fruit[] fruits = new Fruit[4];

		// 다형성 !!!
		// 부모 데이터 타입에 자식 객체 --> 업캐스팅
		fruits[0] = new Banana();
		fruits[1] = new Peach();
		fruits[2] = new Banana();
		fruits[3] = new Peach();
		
		// 4번
		// 바나나 타입이면 화면에 origin 변수를 출력하시오!
		// instanceof , 다운 캐스팅
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] instanceof Banana) {
			// 바나나 타입 보장 , 다운 캐스팅
			System.out.println(((Banana)fruits[i]).origin);
			}
			fruits[i].showIfo();
			System.out.println("--------------------");
		}
// 출력값 : 
//		 필리핀
//		 상품명 : 바나나
//		가격 : 2000
//		--------------------
//		상품명 : 복숭아
//		가격 : 3000
//		--------------------
//		필리핀
//		상품명 : 바나나
//		가격 : 2000
//		--------------------
//		상품명 : 복숭아
//		가격 : 3000
//		--------------------

	} // end of main

} // end of class
