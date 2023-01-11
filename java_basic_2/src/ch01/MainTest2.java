package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 배열 : 연관된 데이터 타입을 하나의 변수에 통으로 모아서 관리한다.
		// 길이 : 10, 인덱스 : 9
		Human[] humans = new Human[10];
		
		Animal[] animals = new Animal[10];
		// animals[0] = new Human(); // 다형성
		// 반복문
		for (int i = 0; i < animals.length; i++) {
			if(i % 2 ==0) {
				animals[i] = new Human();
			} else {
				animals[i] = new Tiger();
			}
		}
		
		// for 문에 다른 형태
		// animals 배열에 길이 때문에 10번 반복하게 된다.
		// 순차적으로 animals[0] ---> 주소값 ---> a ---> Animal 데이터 타입에 (즉, 휴먼, 타이거, 독수리)
		// foreach 문
		for (Animal a : animals) {
			a.eating(); // eating을 찾다.
			a.move(); // move를 찾다.
			System.out.println("--------------");
		}
		// 출력값 : 도끼로 사냥을 해서 먹습니다.
//		               두발로 걷습니다.
//		               -----------------
//		               날카로운 이빨로 물어 뜯다
//		               호랑이가 네 발로 움직입니다. X5
		
		// index for 문은 말 그대로 i 값에 접근해서 무언 처리를 할 수 있다.
		// foreach 처음부터 끝까지 무언가 반복시킬 때 자주 사용합니다.
		// index for - 인덱스 값으로 무언가 해야할 때 사용하면 됩니다.
		
		
	} // end of main

} // end of class
