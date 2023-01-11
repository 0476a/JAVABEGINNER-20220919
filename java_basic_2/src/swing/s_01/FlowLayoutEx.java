package swing.s_01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	
	// 컴포넌트 (화면에 보이는 것들)
	JButton button1;
	
	// 생성자
	public FlowLayoutEx() {
		setTitle("버튼 배치해보기");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 처리
		setVisible(true); // 화면에 보이게 하라!!!
		
//		button1 = new JButton("버튼");
//		add(button1);
	}

}
