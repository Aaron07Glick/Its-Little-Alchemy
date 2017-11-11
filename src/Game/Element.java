package Game;

import java.awt.Color;
import java.awt.Graphics;

public class Element {
	int x;
	int y;
	Color color;
	ElementName elementName;
	int id;

	enum ElementName {
		AIR, EARTH, FIRE, WATER
	}

	Element(int id) {
		this.x = 1840;
		this.id = id;
		switch (id) {
		case 0:
			this.elementName = ElementName.AIR;
			this.color = Color.WHITE;
			System.out.println("created air");
			break;
		case 1:
			this.elementName = ElementName.EARTH;
			this.color = Color.gray;
			System.out.println("created earth");
			break;
		case 2:
			this.elementName = ElementName.FIRE;
			this.color = Color.red;
			System.out.println("create fire");
			break;
		case 3:
			this.elementName = ElementName.WATER;
			this.color = Color.blue;
			System.out.println("created water");
			break;
		}

	}

	int getX() {
		return this.x;
	}

	int getY() {
		return this.y;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

	int Value(int i) {
		switch (elementName) {
		case AIR:
			return 1;

		case EARTH:
			return 2;

		case FIRE:
			return 3;

		case WATER:
			return 4;
		default:
			return 0;
		}
	}

	void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(x, y, 50, 50);
	}
}
