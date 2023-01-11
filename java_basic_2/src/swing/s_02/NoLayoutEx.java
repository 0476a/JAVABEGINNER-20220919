package swing.s_02;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame{
	// 멤버변수, 초기화 - 상수 ..
	// 메서드 선언 (사용X)
	// 생성자 선언
	// 할 수 없는것 식을 사용할 수 없다.(10 + 20;)
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("좌표값 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		button4 = new JButton("button 4");
		button5 = new JButton("button 5");
	}
	private void setInitLayout() {
		// 배치 관리자
		setLayout(null); // <-- 좌표값으로 컴포넌트를 배치할 수 있다.
		// 단 주의점 : 좌표값으로 레이아웃을 지정하면 버튼에 크기와 위치를 직접 지정해야 한다.
		
		// 버튼 크기를 먼저 만들어야 화면에 나온다. 기본값은 0.0 <-- 보이지 않음!!
		button1.setSize(150, 150);
		button1.setLocation(10, 10);
		
		button2.setSize(150, 150);
		button2.setLocation(100, 100);
		
		button3.setSize(150, 150);
		button3.setLocation(200, 200);
		
		button4.setSize(150, 150);
		button4.setLocation(300, 300);
		
		button5.setSize(150, 150);
		button5.setLocation(400, 400);
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		setVisible(true);
		
	}
} // end of class
