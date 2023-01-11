package swing.s_07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame1 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyFrame1() {
		initData();
		initSetLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("key 이벤트 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void initSetLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		area.addKeyListener(this);
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		new MyFrame1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed 호출 !!!");
//		System.out.println(e.getExtendedKeyCode());
//		System.out.println(e.getID());
//		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("getKeyCode : " + e.getKeyCode());
//		area.setText("code : " + e.getKeyCode());
		area.append("code : " + e.getKeyCode() + "\n");
	}

}
