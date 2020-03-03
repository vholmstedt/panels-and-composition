import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyExample extends JFrame {

	
	public MyExample() {
		add(new MultipleColorsPanel());
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
		((MultipleColorsPanel) getContentPane().getComponent(0)).countCyanPanels();
	}
	
	public static void main(String[] args) {
		new MyExample();
	}

}
