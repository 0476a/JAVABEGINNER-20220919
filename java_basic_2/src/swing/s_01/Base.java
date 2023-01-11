package swing.s_01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Base extends JFrame{
	JButton[] buttons = new JButton[3];
	public Base() {
		initData();
		setInitLayout();
	}
	public void initData() {
		setTitle("창의 이름");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttons[0] = new JButton("버튼 1");
	}
	public void setInitLayout() {
		setVisible(true);
		add(buttons[0]);
	}
} // end of class
