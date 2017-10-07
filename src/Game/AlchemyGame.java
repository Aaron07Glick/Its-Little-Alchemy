package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class AlchemyGame extends JComponent implements ActionListener, Runnable, MouseMotionListener, MouseListener {
	Timer paintTicker = new Timer(20, this);

	JFrame gameframe = new JFrame();

	SideBar sidebar = new SideBar();
	int x = 1840;
	int y = 10;

	public void run() {
		gameframe.add(this);
		paintTicker.start();
	}

	AlchemyGame() {
		gameframe.setSize(2000, 1000);
		gameframe.addMouseListener(this);
		gameframe.addMouseMotionListener(this);

	}

	public void paint(Graphics g) {
		// Graphics2D g2 = (Graphics2D)g;
		g.setColor(Color.black);
		sidebar.display(g);
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);

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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("mouse moved");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
