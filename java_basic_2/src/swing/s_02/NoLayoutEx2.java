package swing.s_02;

import javax.swing.JButton;
import javax.swing.JFrame;

// 도전과제!! 배열로 변경해서 코드를 완성해 보자!!!
public class NoLayoutEx2 extends JFrame{
	// 멤버변수, 초기화 - 상수 ..
	// 메서드 선언 (사용X)
	// 생성자 선언
	// 할 수 없는것 식을 사용할 수 없다.(10 + 20;)
	
	private JButton[] buttons = new JButton[5];
	
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("좌표값 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i);
		}
		
	}
	private void setInitLayout() {
		// 배치 관리자
		setLayout(null); // <-- 좌표값으로 컴포넌트를 배치할 수 있다.
		// 단 주의점 : 좌표값으로 레이아웃을 지정하면 버튼에 크기와 위치를 직접 지정해야 한다.
		
		// 버튼 크기를 먼저 만들어야 화면에 나온다. 기본값은 0.0 <-- 보이지 않음!!

		for(int i = 0; i < buttons.length; i++) {
			buttons[i].setSize(150, 150);
		}
		buttons[0].setLocation(10, 10);
		buttons[1].setLocation(100, 100);
		buttons[2].setLocation(200, 200);
		buttons[3].setLocation(300, 300);
		buttons[4].setLocation(400, 400);
		
		for(int i = 0; i < buttons.length; i ++) {
			add(buttons[i]);
		}
		
		
		setVisible(true);
		
	}
} // end of class
