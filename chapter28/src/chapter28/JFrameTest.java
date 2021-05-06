package chapter28;

import javax.swing.*;

public class JFrameTest {
	private JFrame frame;

	JFrameTest() {
		frame = new JFrame("JFrame");
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		JFrameTest jt = new JFrameTest();

	}

}