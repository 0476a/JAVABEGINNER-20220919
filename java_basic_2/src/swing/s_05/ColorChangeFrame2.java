package swing.s_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame implements ActionListener{

	JPanel centerPanel;
	JPanel bottomPanel;
	JButton button1;
	JButton button2;
	
	
	
	public ColorChangeFrame2() {
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
	
	// 토굴 버튼 개념... 1 --> 2 ---> 1
		boolean isBlack = false; // 변수 - 어떠한 데이터(정보를 담아 둠)
	
	// 뭐가 눌러 졌는지 구분하고 동작을 구현해주어야 한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 구분하기 위해서 다운캐스팅 --> 글자를 변수에 담고, equals
		// 좀 더 간편하게 처리 (영상보고 적기)
		if(e.getSource() == button1) {
			if(isBlack == true) {
				centerPanel.setBackground(Color.black);
				// isBlack = false;
			} else {
				centerPanel.setBackground(Color.white);
				// isBlack = true;
			}
			
			isBlack =! isBlack;
		} else if(e.getSource() == button2) {
			
		}
			
	}
		

	public static void main(String[] args) {
		new ColorChangeFrame2();
	}
	
}
