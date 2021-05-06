package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class SwingWindowFrame2 extends WindowAdapter implements ActionListener{
	private JFrame f;
	private JButton b;
	
	public SwingWindowFrame2() {
		f = new JFrame("windowadapter 테스트");
		b = new JButton("제목 바꾸기"); 
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		b.addActionListener(this);
		f.addWindowListener(this);
		f.setSize(300,100);
		f.show();
	}
	
	public void actionPerformed(ActionEvent e) {
		f.setTitle("WindowAdapter, ActionLIstener");
	}
	public void windowsClosing(WindowEvent e) {
		System.exit(0);
		
	}
}
public class SwingWindowFrameMain2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingWindowFrame2();
	}

}

