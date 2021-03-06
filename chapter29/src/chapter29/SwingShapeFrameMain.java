package chapter29;

import java.awt.*;
import javax.swing.*;

class SwingShapeFrame extends JFrame {
	public SwingShapeFrame() {
		this.setTitle("Draw Shape!!!");
	}

	public void paint(Graphics g) {

		// 배경
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 500, 500);
		
		// 글씨 보이기
		g.setColor(Color.DARK_GRAY);
		g.drawString("Draw Shape!", 150, 150);
		
		// 원 그리기
		g.setColor(Color.orange);
		g.drawOval(100, 100, 100, 100);
		
		// 사선그리기
		g.setColor(Color.red);
		g.drawLine(80, 80, 100, 100);
		
		// 사각형
		g.setColor(Color.black);
		g.drawRect(70, 100, 50, 50);
		
		// 색 채운사각형
		g.setColor(Color.cyan);
		g.fillRect(100, 120, 50, 50);
	}
}

public class SwingShapeFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingShapeFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
