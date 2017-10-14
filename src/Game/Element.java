package Game;

public class Element {
	int x;
	int y;
	ElementName elementName;

	enum ElementName {
		AIR, EARTH, FIRE, WATER
	}

	Element(int id) {
		switch (id) {
		case 0:
			this.elementName = ElementName.AIR;
		case 1:
			this.elementName = ElementName.EARTH;
		case 2:
			this.elementName = ElementName.FIRE;
		case 3:
			this.elementName = ElementName.WATER;
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
