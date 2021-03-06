package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingWindowFrame implements ActionListener, WindowListener {
	JFrame f;
	private JButton b;

	public SwingWindowFrame() {
		f = new JFrame("Window Event 테스트");
		b = new JButton("제목바꾸기");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);

		b.addActionListener(this);

		f.addWindowListener(this);

		f.setSize(300, 100);
		f.show();
	}

	public void actionPerformed(ActionEvent e) {
		f.setTitle("액션리스너와 윈도우리스너");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
//	인터페이스로 상속을 받게 되면 무조건 재정의 해야만한다.
	public void windowActivated(WindowEvent e) {}

	public void windowClosed(WindowEvent e) {}

	public void windowDeactivated(WindowEvent e) {}

	public void windowDeiconified(WindowEvent e) {}

	public void windowIconified(WindowEvent e) {}

	public void windowOpened(WindowEvent e) {}
}

public class SwingWindowFrameMain {
	public static void main(String[] args) {
		new SwingWindowFrame();
	}
}
