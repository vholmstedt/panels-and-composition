import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MultipleColorsPanel extends JPanel {
	
	public MultipleColorsPanel() {
		setLayout(new GridLayout(2,0,10,10));
		for (int i = 0; i < 10; i++) {
			add(new RandomColorPanel());
		}
	}

	void countCyanPanels() {
		int n = 0;
		for (int i = 0; i < getComponentCount(); i++) {
			if (getComponent(i).getBackground() == Color.CYAN) n++;		
		}
		System.out.println("Antall CYAN er " + n);		
	}
	
}
