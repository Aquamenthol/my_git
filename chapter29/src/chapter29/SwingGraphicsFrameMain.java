package chapter29;

import java.awt.Graphics;

import javax.swing.*;

class SwingGraphicsFrame extends JFrame {
	public SwingGraphicsFrame() {
		this.setTitle("Hello World!!!");
	}
	
	public void pain(Graphics g) {
		g.drawString("Hello World", 512, 150);
	}
}
public class SwingGraphicsFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingGraphicsFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1024, 300);
		f.setVisible(true);
	}

}
