package swing.s_08;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements KeyListener {

	JLabel backgroundLabel;
	JLabel playerLabel;
	JLabel badplayerLabel;
	int badplayerX = 100;
	int badplayerY = 400;
	int playerX = 100;
	int playerY = 350;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("움직이는 간단한 게임 만들어 보기");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JLabel 이미지 올리자
		backgroundLabel = new JLabel(new ImageIcon("background2.png"));
		playerLabel = new JLabel(new ImageIcon("player2.png"));
		badplayerLabel = new JLabel(new ImageIcon("badplayer3.png"));
	}

	private void setInitLayout() {
		setLayout(null);
		// 컴포넌트에 크기, 위치를 직접 지정해야 된다.
		playerLabel.setSize(150,150);
		playerLabel.setLocation(playerX, playerY);
		backgroundLabel.setSize(800, 800);
		backgroundLabel.setLocation(0,0);
		badplayerLabel.setSize(150,150);
		badplayerLabel.setLocation(badplayerX, badplayerY);
		add(playerLabel);
		add(badplayerLabel);
		add(backgroundLabel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}
	
	// 메인함수 / 메인 작업자
	public static void main(String[] args) {
		new MainFrame();
	} // end of main

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyCode : " + e.getKeyCode());
		// 만약 오른쪽 방향키가 눌러졌으면!!
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// x 좌표값 --> 현재 이미지 좌표값에서 더하기 10만큼 움직여라
			playerX += 10;
			playerLabel.setLocation(playerX, playerY);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			playerX -= 10;
			playerLabel.setLocation(playerX, playerY);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			playerY -= 10;
			playerLabel.setLocation(playerX, playerY);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			playerY += 10;
			playerLabel.setLocation(playerX, playerY);
		}
	}

	// 추가로 위쪽, 아래쪽 움직이게 구현해주세요~~
	
	
	@Override
	public void keyReleased(KeyEvent e) {

	}

}
