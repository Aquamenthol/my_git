package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingActionFrame extends JFrame implements ActionListener {
	private JButton b = new JButton("종료하기");

	public SwingActionFrame() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);

		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

public class SwingActionFrameMain {
	public static void main(String[] args) {
		JFrame f = new SwingActionFrame();
		f.setSize(300, 100);
		f.show();
	}
}
