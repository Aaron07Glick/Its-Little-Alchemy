package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AlchemyGame extends JPanel implements ActionListener {
	public static void main(String[] args) {
		AlchemyGame game = new AlchemyGame();
	}

	JFrame gameframe = new JFrame();
	JPanel gamepanel = new JPanel();

	AlchemyGame() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void gameframe() {
		// TODO Auto-generated method stub
		gameframe.setVisible(true);
	}
}
