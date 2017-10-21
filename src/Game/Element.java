package Game;

import java.awt.Color;

public class Element {
	int x;
	int y;
	Color color;
	ElementName elementName;
	

	enum ElementName {
		AIR, EARTH, FIRE, WATER
	}

	Element(int id) {
		switch (id) {
		case 0:
			this.elementName = ElementName.AIR;
			this.color = Color.WHITE;
			this.x = 1840;
		case 1:
			this.elementName = ElementName.EARTH;
			this.color = Color.black;
			this.x = 1840;
		case 2:
			this.elementName = ElementName.FIRE;
			this.color = Color.black;
			this.x = 1840;
		case 3:
			this.elementName = ElementName.WATER;
			this.color = color.blue;
			this.x = 1840;
		}
		this.x = 1840;

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
}
