package swing.s_07;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame {

	private JTextArea area;

	public MyFrame2() {
		initData();
		initSetLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("key 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void initSetLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		// 1. 익명 클래스로 구현하시오.
//		KeyAdapter keyAdapter = new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				System.out.println("getKeyCode : " + e.getKeyCode());
//				area.append("getKeyCode : " + e.getKeyCode() + "\n" );
//			}
//		};

		// 2. 어텝터를 사용해서 구현하시오.
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("getKeyCode : " + e.getKeyCode());
				area.append("getKeyCode : " + e.getKeyCode() + "\n");
			}
		});

	}

	// 테스트 코드
	public static void main(String[] args) {
		new MyFrame2();
	}

}
