package swing.s_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorChangeFrame3  extends JFrame implements ActionListener{

	
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	public ColorChangeFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		button3 = new JButton("버튼3");
		button4 = new JButton("버튼4");
		button5 = new JButton("버튼5");
	}
	private void setInitLayout() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(panel);
		panel.setBackground(Color.black);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		
		setVisible(true);
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			panel.setBackground(Color.red);
		} else if (e.getSource() == button2) {
			panel.setBackground(Color.blue);
		} else if (e.getSource() == button3) {
			panel.setBackground(Color.green);
		} else if (e.getSource() == button4) {
			panel.setBackground(Color.yellow);
		} else if (e.getSource() == button5) {
			panel.setBackground(Color.pink);
		} 
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame3();
	}
}
