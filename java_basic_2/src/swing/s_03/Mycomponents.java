package swing.s_03;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mycomponents extends JFrame{
	
	private JPanel jPanel1;
	private JButton button;
	private JLabel jLabel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JCheckBox jCheckBox;
	
	public Mycomponents() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("컴포넌트 확인하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		
		jPanel1 = new JPanel();
		button = new JButton("button 1");
		jLabel = new JLabel("JLABEL 1");
		textField = new JTextField(10);
		passwordField = new JPasswordField(10);
		jCheckBox = new JCheckBox("사과", true);
	}
	
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
		this.add(jPanel1); // 루트 패널
		jPanel1.setBackground(Color.yellow);
		add(button);
		add(jLabel);
		add(textField);
		add(passwordField);
		add(jCheckBox);
		
		setVisible(true);
	}

}
