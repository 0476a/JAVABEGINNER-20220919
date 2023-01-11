package swing.s_06;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame1 extends JFrame implements MouseListener{

	JLabel jLabel;
	Container rootContainer;
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		
		// 프레임 안에 자동으로 루트 패널이 생성 되어 실행 된다.
		rootContainer = getContentPane();
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jLabel = new JLabel("Hello Java");
	}

	private void setInitLayout() {
		setLayout(null);
		// 크기, 위치
		jLabel.setSize(100,100);
		jLabel.setLocation(200,200);
		add(jLabel);
		setVisible(true);
	}

	private void addEventListener() {
		// 이름이 다르다 !! - 마우스 이벤트 !!
		rootContainer.addMouseListener(this);
		
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame1();
	}

	// 주석 + 힌트 (컴파일러한테)
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked ~ 실행됨");
		System.out.println(e.getX() + " : " + e.getY());
		jLabel.setLocation(e.getX(), e.getY());
		jLabel.setText("1111");
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed ~ 실행됨");
//		System.out.println(e.getX() + " : " + e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased ~ 실행됨");
//		System.out.println(e.getX() + " : " + e.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered ~ 실행됨");
//		System.out.println(e.getX() + " : " + e.getY());
		jLabel.setText("들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited ~ 실행됨");
//		System.out.println(e.getX() + " : " + e.getY());
		jLabel.setText("나감");
	}
	
	
	
	
}
