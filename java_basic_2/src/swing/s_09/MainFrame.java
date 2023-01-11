package swing.s_09;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	JLabel backgroundLabel;
	JLabel playerLabel1;
	JLabel playerLabel2;

	int playerX1 = 100;
	int playerY1 = 350;
	int playerX2 = 300;
	int playerY2 = 450;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// 익명 클래스
//		Thread thread = new Thread();
//		thread.start();
		// new
		// 익명 클래스 Thread (익명 구현 클래스로).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println("-");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		//////////////////////////////////////////////////////////////////
		
		
	}

	private void initData() {
		setTitle("움직이는 간단 게임");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundLabel = new JLabel(new ImageIcon("background2.png"));
		playerLabel1 = new JLabel(new ImageIcon("player2.png"));
		playerLabel2 = new JLabel(new ImageIcon("badplayer3.png"));
	}

	private void setInitLayout() {
		setLayout(null);
		backgroundLabel.setSize(800, 800);
		backgroundLabel.setLocation(0, 0);

		playerLabel1.setSize(150, 150);
		playerLabel1.setLocation(playerX1, playerY1);

		playerLabel2.setSize(150, 150);
		playerLabel2.setLocation(playerX2, playerY2);

		add(playerLabel1);
		add(playerLabel2);
		add(backgroundLabel);

		setVisible(true);
	}

	private void addEventListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					playerX1 += 10;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					playerX1 -= 10;
				}
				playerLabel1.setLocation(playerX1, playerY1);
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

	}
}
