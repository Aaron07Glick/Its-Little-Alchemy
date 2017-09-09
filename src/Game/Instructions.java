package Game;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Instructions {
	public static void main(String[] args) {
		Instructions a = new Instructions();

	}

	JFrame frame = new JFrame("INSTRUCTIONS");
	JPanel panel = new JPanel();
	JButton button = new JButton("Play game");
	JLabel label = new JLabel("<html> 1. Click and drag an element on the play area"
			+ " <br> 2. Click and drag another element on to the play area <br> "
			+ "3. You have now made a new element</html>", SwingConstants.CENTER);

	Instructions() {
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new GridLayout(2, 1));
		panel.add(label);
		panel.add(button);
		frame.pack();

	}
}
