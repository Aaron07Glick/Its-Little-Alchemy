package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;

public class Element {
	int x;
	int y;
	Color color;
	ElementName elementName;
	int id;
	boolean sidebar;
	HashMap<Integer, Integer>map = new HashMap<>();
	enum ElementName {
		AIR, EARTH, FIRE, WATER, STEAM, PRESSURE, STONE, MIST, MUD, BRICK, WALL, HOUSE, CITY, POND, SEA, LAVA, VOLCANO, ISLAND, LAND, CONTINET, PLANET, RAIN, PLANT, GUNPOWDER, 
	}
	String name;
	Element(int id) {
		this.x = 1840;
		this.id = id;
		map.put(hash(name, name), 0);
		map.put(hash(name, name), 1);
		map.put(hash(name, name), 2);
		map.put(hash(name, name), 3);
		switch (id) {
		case 0:
			this.elementName = ElementName.AIR;
			this.color = Color.WHITE;
			System.out.println("created air");
			this.name = "air";
			break;
		case 1:
			this.elementName = ElementName.EARTH;
			this.color = Color.gray;
			System.out.println("created earth");
			this.name = "earth";
			break;
		case 2:
			this.elementName = ElementName.FIRE;
			this.color = Color.red;
			System.out.println("create fire");
			this.name = "fire";
			break;
		case 3:
			this.elementName = ElementName.WATER;
			this.color = Color.blue;
			System.out.println("created water");
			this.name = "water";
			break;
		case 4:
			this.elementName = ElementName.STEAM;
			this.color = Color.GRAY;
			System.out.println("created Steam");
			this.name = "steam";
			break;
			
		}
		
		//new Element(map.get(hash(name, name)));
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
		
		case STEAM:
			return 5;
		
		default:
			return 0;
		}
	}

	void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(x, y, 50, 50);
	}
	public int hash(String a, String b) {
		int sum = 0;
		String bigString = a + b;
		char[] chars = bigString.toCharArray();
		for (char c : chars) {
			sum += (int) c;
		}
		return sum;
		
	}
	public boolean getSideBar() {
		return sidebar;
	}
	public void setSidebar(boolean sidebar) {
		this.sidebar = sidebar;
	}
}
