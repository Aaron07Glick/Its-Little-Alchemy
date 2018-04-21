package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.Timer;

public class AlchemyGame extends JComponent implements ActionListener, Runnable, MouseMotionListener, MouseListener, MouseWheelListener {
	ArrayList<Element> elements = new ArrayList<>();
	ArrayList<Element> sideElement = new ArrayList<>();
	Timer paintTicker = new Timer(20, this);
	JFrame gameframe = new JFrame();
	Element clicked;
	Element newElement;
	SideBar sidebar = new SideBar();
	int x = 1840;
	int y = 10;
	ArrayList<Recipe> recipebook = new ArrayList<>();
	int offset = 0;

	public void run() {
		gameframe.add(this);
		paintTicker.start();
	}

	AlchemyGame() {
		recipebook.add(new Recipe(0, 2, 4));
		recipebook.add(new Recipe(0, 4, 5));
		recipebook.add(new Recipe(0, 5, 7));
		recipebook.add(new Recipe(1, 3, 14));
		recipebook.add(new Recipe(1, 5, 8));
		recipebook.add(new Recipe(2, 8, 9));
		recipebook.add(new Recipe(2,9,10));
		recipebook.add(new Recipe(9,10,11));
		recipebook.add(new Recipe(11, 10, 12));
		recipebook.add(new Recipe(3, 9, 6));
		recipebook.add(new Recipe(11,12,13));
		recipebook.add(new Recipe(3,14,15));
		recipebook.add(new Recipe(2,3,16));
		recipebook.add(new Recipe(1,16,17));
		recipebook.add(new Recipe(1,15,18));
		recipebook.add(new Recipe(18,1,19));
		recipebook.add(new Recipe(19,18,20));
		recipebook.add(new Recipe(20,15,21));
		recipebook.add(new Recipe(0,3,22));
		recipebook.add(new Recipe(1,22,23));
		recipebook.add(new Recipe(29, 17, 24));
		recipebook.add(new Recipe(4,5,25));
		recipebook.add(new Recipe(29,5,26));
		recipebook.add(new Recipe(5,6,29));
		recipebook.add(new Recipe(23,9,27));
		recipebook.add(new Recipe(27,17,28));
		recipebook.add(new Recipe(29,25,30));
		recipebook.add(new Recipe(2,6,34));
		recipebook.add(new Recipe(34,30,32));
		recipebook.add(new Recipe(28,29,31));
		recipebook.add(new Recipe(2, 29, 33));
		recipebook.add(new Recipe(34,2,35));
		recipebook.add(new Recipe(35,6,36));
		recipebook.add(new Recipe(34,25,38));
		recipebook.add(new Recipe(34,38,37));
		recipebook.add(new Recipe(37,38,39));
		recipebook.add(new Recipe(39,30,40));

		gameframe.setSize(2000, 1000);
		gameframe.addMouseWheelListener(this);
		gameframe.addMouseListener(this);
		gameframe.addMouseMotionListener(this);
		
		
		if (elements.isEmpty()) {
			
			for (int i = 0; i < 4; i++) {
				System.out.println("creating elements:" + i);

				elements.add(new Element(i));
				elements.get(i).setSidebar(true);
				elements.get(i).setY((elements.size()) * 80);
				sideElement.add(elements.get(i));
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
			newElement.x = e.getX() - 25;
			newElement.y = e.getY() - 25;
		}

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
			if(elements.get(i).getX() > 1800 && !elements.get(i).getSideBar()) {
				elements.remove(clicked);
			}
			if (e.getX() > elements.get(i).getX() && e.getX() < (elements.get(i).getX() + 100)) {
				if (e.getY() > elements.get(i).getY() && e.getY() < (elements.get(i).getY() + 100)) {
					if (!(elements.get(i).getSideBar())) {
						clicked = elements.get(i);
						newElement = clicked;
						if (!(elements.contains(newElement))) {
							elements.add(newElement);
						}

						System.out.println(clicked.elementName);
					} else {
						clicked = new Element(elements.get(i).id);
						clicked.setX(elements.get(i).getX());
						clicked.setY(elements.get(i).getY());
						newElement = clicked;
						if (!(elements.contains(newElement))) {
							elements.add(newElement);
						}

						System.out.println(clicked.elementName);
						clicked.setSidebar(false);

					}
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
		
		for (int i = 0; i < elements.size(); i++) {
			if (e.getX() > elements.get(i).getX() && e.getX() < (elements.get(i).getX() + 90)) {
				if (e.getY() > elements.get(i).getY() && e.getY() < (elements.get(i).getY() + 90)) {
					// System.out.println("combining elements");
					// System.out.println(elements.get(i).elementName);
					// System.out.println(elements.get(element1).elementName);
					if (clicked != null && elements.get(i).getX() < 1800) {
						for (int j = 0; j < recipebook.size(); j++) {
						
							if (recipebook.get(j).id1 == clicked.id && recipebook.get(j).id2 == elements.get(i).id) {
								Element temp = new Element(recipebook.get(j).product);
								temp.x = e.getX();
								temp.y = e.getY();
								elements.remove(elements.get(i));
								elements.remove(clicked);
								boolean sidebarContains = false;
								for (int k = 0; k < elements.size(); k++) {
									if (temp.id == elements.get(k).id) {
										sidebarContains = true;
									}
								}
								if(sidebarContains == false) {
								sideBarAdd(recipebook.get(j).product);
								}
								elements.add(temp);
								break;
							}

							else if (recipebook.get(j).id2 == clicked.id
									&& recipebook.get(j).id1 == elements.get(i).id) {
								Element temp = new Element(recipebook.get(j).product);
								temp.x = e.getX();
								temp.y = e.getY();
								elements.remove(elements.get(i));
								elements.remove(clicked);
								boolean sidebarContains = false;
								for (int k = 0; k < elements.size(); k++) {
									if (temp.id == elements.get(k).id) {
										sidebarContains = true;
									}
								}
								if(sidebarContains == false) {
								sideBarAdd(recipebook.get(j).product);
								}
								elements.add(temp);
								break;
							}
						}

					}
					if(clicked.getX() > 1800) {
						elements.remove(clicked);
					}
					element1 = i;
				}
			}
		}
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

	void sideBarAdd(int tempId) {
		// Graphics g;
		int count = 0;
		for (Element element : elements) {
			if (element.sidebar) {
				count++;
			}
		}
		count++;
		// math for location goes here
		Element element = new Element(tempId);
		elements.add(element);
		element.setY(count * 80 + offset);
		elements.get(elements.size() - 1).setSidebar(true);
		sideElement.add(element);
		// elements.get(elements.size()-1).draw(g);
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
		int notches = e.getWheelRotation();
		if(notches < 0) {
			offset -=10 ;
		}
		else if(notches > 0) {
			offset +=10;
		}
		for (Element element : sideElement) {
			if(notches < 0) {
				element.y-=10;
			}
			else if(notches > 0) {
				element.y+=10;
			}
		}
	}
}
