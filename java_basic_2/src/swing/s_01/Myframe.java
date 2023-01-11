package swing.s_01;

import javax.swing.JFrame;

public class Myframe extends JFrame{
	
	// 인스턴스화 될 때 (new 할때) 가장 먼저 실행되는 코드이다.
	public Myframe() {
		super.setTitle("myframe");
		super.setSize(500, 500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                                                   // 생성없이 상수를 넣으므로 static 사용
		
		System.out.println("생성자가 실행 되었습니다.");
		
		super.setVisible(true);
		
	}
	

}
