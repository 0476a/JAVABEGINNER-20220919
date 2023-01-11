package swing.s_04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame{

	// 내부 클래스 사용해주세요 ~~
	// JPanel 상속해서 재정의 paint 메서드 !!!
	MyJpanel2 myJpanel2;
	
	public MyFrame3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("집모양 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		myJpanel2 = new MyJpanel2();
	}
	private void setInitLayout() {
		setVisible(true);
		add(myJpanel2);
	}
	
	// 내부클래스
	class MyJpanel2 extends JPanel {
		
		private Image image;
		
		public MyJpanel2() {
			// image = new ImageIcon("image3.jpg").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
			g.drawRect(200, 300, 100, 100);
			g.drawLine(200, 300, 250, 250);
			g.drawLine(250, 250, 300, 300);
			g.drawRect(260, 310, 30, 30);
			g.drawLine(275, 310, 275, 340);
		}
	}
} // end of MyFrame3
