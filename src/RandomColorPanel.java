import java.awt.Color;
import java.util.Random;

import javax.swing.JPanel;

public class RandomColorPanel extends JPanel {
	
	Random r = new Random();
	Color[] c = {Color.BLACK, Color.CYAN, Color.DARK_GRAY};
	
	
	public RandomColorPanel() {
		setBackground(c[r.nextInt(c.length)]);
	}

}
