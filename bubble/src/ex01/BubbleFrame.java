package ex01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{

	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		
	}

	private void setInitLayout() {
		setLayout(null); // 좌표기반 레이아웃
		// 크기와, 위치
		add(player);
		
		setLocationRelativeTo(null); // 프레임 정 가운데 배치
		setVisible(true);
	}

	private void addEventListener() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
