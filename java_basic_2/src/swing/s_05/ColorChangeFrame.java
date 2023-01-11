package swing.s_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends JFrame implements ActionListener{

	JPanel centerPanel;
	JPanel bottomPanel;
	JButton button1;
	JButton button2;
	

	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerPanel = new JPanel();
		bottomPanel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		
	}
	private void setInitLayout() {
		setLayout(new BorderLayout());
		
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(Color.yellow);
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setBackground(Color.cyan);
		this.add(button1, BorderLayout.WEST);
		this.add(button2, BorderLayout.EAST);
		
		setVisible(true);
	}
	// 이벤트 리스너를 등록해야한다.
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	
	
	// 뭐가 눌러 졌는지 구분하고 동작을 구현해주어야 한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedJButton = (JButton) e.getSource();
		String clicedJButtonName = clickedJButton.getText();
		
		String button1Name = button1.getText();
		
		if(button1Name.equals(clicedJButtonName)) {
			centerPanel.setBackground(Color.black);
		} else {
			bottomPanel.setBackground(Color.blue);
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}
	
}
