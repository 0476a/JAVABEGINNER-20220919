package swing.s_01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout2 extends JFrame{

	
	// 배열로 수정 해주세요.
	private JButton[] buttons = new JButton[6];
	
	// 배치관리자 선언
	private FlowLayout flowLayout;
	
	// 배열을 어떻게 선언하는가 !!! --> how(문법), why(왜)
	
	public MyFlowLayout2() {
		initData();
		setInitLayout();
		
		// 순서도 중요하다. (순서를 바꾸면 NullPointerException 발생)
	}
	
	// 데이터에 초기화 (값을 넣는 기능으로 만들꺼임)
	private void initData() {
		setTitle("배치관리자 - FlowLayout");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		flowLayout = new FlowLayout();
		// hgap 수평으로 띄운다. vgap은 수직으로 띄운다.
		flowLayout = new FlowLayout(FlowLayout.CENTER, 50, 300);
		
	
		// 문자열 + i 사용해서 for 문을 사용해주세요.
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1) );
		}
	}
	
	
	// 화면을 컴포넌트를 추가한다거나 사리지게 하는 기능을 담당
	private void setInitLayout() {
		setVisible(true);
		// 배치 관리자를 등록해보자.
		setLayout(flowLayout);
		// 기본적을 덮어쓰기됨. 그래서 레이아웃을 사용해줌.
		
		
		// 문자열 + i 사용해서 for 문을 사용해주세요.
		
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
}
