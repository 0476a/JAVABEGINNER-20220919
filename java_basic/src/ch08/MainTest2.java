package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		// 학생 클래스는 메모리에 올려주세요.
		// new 키워드를 사용하면 heap 메모리 영역에 올라간다.
		// s1 : 참조 변수!
		Student s1 = new Student();
		s1.studentName = "김철수";
		s1.height = 180;
		s1.weight = 80;
		
		System.out.println(s1); // 주소값
		System.out.println(s1.studentName); // 출력값 : 김철수
		System.out.println(s1.height); // 출력값 : 180
		System.out.println(s1.weight); // 출력값 : 80
		
	}

}
