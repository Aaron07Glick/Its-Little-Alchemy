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
		{

		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		sidebar.display(g);
		for (int i = 0; i < elements.size(); i++) {
			elements.get(i).draw(g);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void gameframe() {
		gameframe.setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (clicked != null) {
			x = e.getX();
			y = e.getY();
			newElement.setX(x);
			newElement.setY(y);
		}

		newElement.x = e.getX() - 25;
		newElement.y = e.getY() - 25;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int originalLength = elements.size();
		for (int i = 0; i < originalLength; i++) {
			if (e.getX() > elements.get(i).getX() && e.getX() < (elements.get(i).getX() + 50)) {
				if (e.getY() > elements.get(i).getY() && e.getY() < (elements.get(i).getY() + 50)) {
					clicked = elements.get(i);
					newElement = clicked;
					if (!(elements.contains(newElement))) {
						elements.add(newElement);
					}

					System.out.println(clicked.elementName);

				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int element1 = 0;
		int element2 = 0;
		int elementcount = 0;
		clicked = null;
		int originalLength = elements.size();
		for (int i = 0; i < originalLength; i++) {
			if (e.getX() > elements.get(i).getX() && e.getX() < (elements.get(i).getX() + 50)) {
				if (e.getY() > elements.get(i).getY() && e.getY() < (elements.get(i).getY() + 50)) {
					elementcount++;
					System.out.println(elementcount);

					if (elementcount == 2) {
						System.out.println("combining elements");
						System.out.println(elements.get(i).elementName);
						System.out.println(elements.get(element1).elementName);
						break;
					}
					element1 = i;
				}
			}
		}

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
