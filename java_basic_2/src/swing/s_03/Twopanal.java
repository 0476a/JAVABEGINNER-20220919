package swing.s_03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Twopanal extends JFrame{
	
	JPanel topPanel;
	JPanel bottomPanel;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	JLabel idLabel;
	JTextField idTextField;
	
	public Twopanal() {
		initData();
		setIntitLayout();
	}
	
	private void initData() {
		setTitle("패널 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		button1 = new JButton("아이디 중복확인");
		button2 = new JButton("BUTTON 2");
		button3 = new JButton("BUTTON 3");
		button4 = new JButton("BUTTON 4");
		
		idLabel = new JLabel("id : ");
		idTextField = new JTextField("아이디 입력", 10);
		
	}
	private void setIntitLayout() {
		// 패널을 추가적으로 만드는 이유는 컴포넌트를 그룹화해서 묶을 수 있고 배치관리자를 따로 지정할 수 있다.
		topPanel.setBackground(Color.green);
		topPanel.add(idLabel);
		topPanel.add(idTextField);
		topPanel.add(button1);
		
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 100));
		bottomPanel.setBackground(Color.yellow);
		bottomPanel.add(button2);
		bottomPanel.add(button3);
		bottomPanel.add(button4);
		
		setLayout(new GridLayout(2, 1));
		add(topPanel);
		add(bottomPanel);
		
		setVisible(true);
	}


}
