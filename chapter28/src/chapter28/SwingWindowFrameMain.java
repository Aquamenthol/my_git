package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingWindowFrame implements ActionListener, WindowListener {
	JFrame f;
	private JButton b;

	public SwingWindowFrame() {
		f = new JFrame("Window Event �׽�Ʈ");
		b = new JButton("����ٲٱ�");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);

		b.addActionListener(this);

		f.addWindowListener(this);

		f.setSize(300, 100);
		f.show();
	}

	public void actionPerformed(ActionEvent e) {
		f.setTitle("�׼Ǹ����ʿ� �����츮����");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
//	�������̽��� ����� �ް� �Ǹ� ������ ������ �ؾ߸��Ѵ�.
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