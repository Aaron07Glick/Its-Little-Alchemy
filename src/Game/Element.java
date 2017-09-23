package Game;

public class Element{
	

	ElementsName elements;

	enum ElementsName {
		AIR, EARTH, FIRE, WATER
	}

	Elements() {
		this.elements = ElementsName.AIR;
	}

	int Value(int i) {
		switch (elements) {
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
