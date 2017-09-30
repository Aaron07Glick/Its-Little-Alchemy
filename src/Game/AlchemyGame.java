package Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class AlchemyGame extends JComponent implements ActionListener, Runnable {
	Timer paintTicker = new Timer(20, this);

	JFrame gameframe = new JFrame();

	SideBar sidebar = new SideBar();

	public void run() {
		gameframe.add(this);
		paintTicker.start();
	}

	AlchemyGame() {
		gameframe.setSize(2000, 1000);

	}

	public void paint(Graphics g) {
		// Graphics2D g2 = (Graphics2D)g;
		g.fillRect(50, 50, 50, 50);
		sidebar.display(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

	public void gameframe() {
		// TODO Auto-generated method stub
		gameframe.setVisible(true);
	}
}
