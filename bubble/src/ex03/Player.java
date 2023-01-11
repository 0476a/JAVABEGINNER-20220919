package ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable{

	private int x;
	private int y;
	
	private ImageIcon playerR;
	private ImageIcon playerL;
	
	// 움직임 상태
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	
	
	
	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		playerL = new ImageIcon("image/playerL.png");
		playerR = new ImageIcon("image/playerR.png");
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		this.setIcon(playerR);
		this.setSize(50, 50);
		this.setLocation(x,y);
	}

	@Override
	public void left() {
		left = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(left) {
					setIcon(playerL);
					x -= 10;
					setLocation(x,y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}

	@Override
	public void right() {
		right = true; // 여기 왔을 때 움직임 right --> true 처리
		// 화살표 한번에 쓰래드 하나 생성
		// 2 번 누르면 쓰래드 추가 생성
		// 3 번 누르면 쓰래드 추가 생성
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(right) {
					setIcon(playerR);
					x += 10;
					setLocation(x,y);
					try {
						Thread.sleep(10); // 0.01초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

	@Override
	public void up() {
		System.out.println("점프");
	}

	@Override
	public void down() {
	}
}
