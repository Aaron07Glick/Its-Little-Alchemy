package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class AlchemyGame extends JComponent implements ActionListener, Runnable, MouseMotionListener, MouseListener {
	ArrayList<Element> elements = new ArrayList<>();
	Timer paintTicker = new Timer(20, this);

	JFrame gameframe = new JFrame();

	Icon fire = new ImageIcon("Fire.png");
	Element clicked;
	Element newElement;
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
		if (elements.isEmpty()) {

			for (int i = 0; i < 4; i++) {
				System.out.println("creating elements:" + i);
				elements.add(new Element(i));
				elements.get(i).setY((elements.size()) * 60);
			}

		}
	}

	public void paint(Graphics g) {
		// Graphics2D g2 = (Graphics2D)g;
		g.setColor(Color.black);
		sidebar.display(g);
		// g.setColor(Color.blue);
		for (int i = 0; i < elements.size(); i++) {
			elements.get(i).draw(g);

		}
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
		if (clicked != null) {
			x = e.getX();
			y = e.getY();
			// clicked.setX(x);
			// clicked.setY(y);

			newElement.setX(x);
			newElement.setY(y);
		}

		elements.get(0).x = e.getX();
		elements.get(0).y = e.getY();
		elements.get(1).x = e.getX();
		elements.get(1).y = e.getY();
		elements.get(2).x = e.getX();
		elements.get(2).y = e.getY();
		elements.get(3).x = e.getX();
		elements.get(3).y = e.getY();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("mouse moved");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test");
		int originalLength = elements.size();
		for (int i = 0; i < originalLength; i++) {
			if (e.getX() > elements.get(i).getX() && e.getX() < (elements.get(i).getX() + 50)) {
				// System.out.println("test");
				if (e.getY() > elements.get(i).getY() && e.getY() < (elements.get(i).getY() + 50)) {
					clicked = elements.get(i);
					newElement = new Element(clicked.id);
					elements.add(newElement);
					System.out.println(clicked.elementName);
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		clicked = null;
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
