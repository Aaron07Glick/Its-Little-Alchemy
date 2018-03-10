package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class Element {
	int x;
	int y;
	Color color;
	ElementName elementName;
	int id;
	boolean sidebar;
	BufferedImage img = null;
	HashMap<Integer, Integer>map = new HashMap<>();
	enum ElementName {
		AIR, EARTH, FIRE, WATER, STEAM, PRESSURE, STONE, MIST, DIRT, MUD, BRICK,
		WALL, HOUSE, CITY, WATERFALL, OCEAN, LAVA, VOLCANO, ISLAND, LAND, CONTINET, 
		PLANET, RAIN, PLANT, GUNPOWDER, ENERGY, DUST, SWAMP, LIFE, SAND, TIME,
		HUMAN, CLOCK, GLASS, METAL, BLADE, SWORD, COMPUTER, ELECTRITY, SUPERCOMPUTER,
		TIMEMACHINE,
		
		
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
			img = loadimg("src/air.png");
			System.out.println("created air");
			this.name = "Air";
			break;
		case 1:
			this.elementName = ElementName.EARTH;
			img = loadimg("src/earth.png");
			System.out.println("created earth");
			this.name = "Earth";
			break;
		case 2:
			this.elementName = ElementName.FIRE;
			//this.color = Color.red;
			img = loadimg("src/fire.png");
			System.out.println("create fire");
			this.name = "Fire";
			break;
		case 3:
			this.elementName = ElementName.WATER;
			img = loadimg("src/water.png");
			System.out.println("created water");
			this.name = "Water";
			break;
		case 4:
			this.elementName = ElementName.STEAM;
			img = loadimg("src/steam.png");
			System.out.println("created Steam");
			this.name = "Steam";
			break;
		case 5:
			this.elementName = ElementName.PRESSURE;
			img = loadimg("src/pressure.png");
			System.out.println("created Pressure");
			this.name = "Pressure";
			break;
		case 6:
			this.elementName = ElementName.STONE;
			img = loadimg("src/stone.png");
			System.out.println("Created Stone");
			this.name = "Stone";
			break;
		case 7:
			this.elementName= ElementName.MIST;
			img = loadimg("src/mist.png");
			System.out.println("Created Mist");
			this.name = "Mist";
			break;
		case 8:
			this.elementName = ElementName.DIRT;
			img = loadimg("src/dirt.png");
			System.out.println("Created Dirt");
			this.name = "Dirt";
			break;
		case 9:
			this.elementName = ElementName.MUD;
			img = loadimg("src/mud.png");
			this.color = Color.gray;
			System.out.println("Created Mud");
			this.name = "Mud";
			break;
		case 10:
			this.elementName = ElementName.BRICK;
			img = loadimg("src/brick.png");
			this.color = Color.red;
			System.out.println("Created Brick");
			this.name = "Brick";
			break;
		case 11:
			this.elementName = ElementName.WALL;
			img = loadimg("src/wall.png");
			this.color = Color.red;
			System.out.println("Created Wall");
			this.name = "Wall";
			break;
		case 12:
			this.elementName = ElementName.HOUSE;
			img = loadimg("src/house.png");
			this.color = Color.orange;
			System.out.println("Created House");
			this.name = "House";
			break;
		case 13:
			this.elementName = ElementName.CITY;
			img = loadimg("src/city.png");
			this.color = Color.orange;
			System.out.println("Created City");
			this.name = "City";
			break;
		case 14:
			this.elementName = ElementName.WATERFALL;
			img = loadimg("src/waterfall.png");
			this.color = Color.blue;
			System.out.println("Created waterFall");
			this.name = "WaterFall";
			break;
		case 15:
			this.elementName = ElementName.OCEAN;
			this.color = Color.blue;
			System.out.println("Created OCEAN");
			this.name = "OCEAN";
			break;
		case 16:
			this.elementName = ElementName.LAVA;
			this.color = Color.red;
			System.out.println("Created Lava");
			this.name = "Lava";
			break;
		case 17:
			this.elementName = ElementName.VOLCANO;
			this.color = Color.lightGray;
			System.out.println("Created Volcano");
			this.name = "Volcano";
			break;
		case 18:
			this.elementName = ElementName.ISLAND;
			this.color = Color.cyan;
			System.out.println("Created island");
			this.name = "Island";
			break;
		case 19:
			this.elementName = ElementName.LAND;
			this.color = Color.DARK_GRAY;
			System.out.println("Created Land");
			this.name = "Land";
			break;
		case 20:
			this.elementName = ElementName.CONTINET;
			this.color = Color.green;
			System.out.println("Created Continet");
			this.name = "Continet";
			break;
		case 21:
			this.elementName = ElementName.PLANET;
			this.color = Color.blue;
			System.out.println("Created Planet");
			this.name = "Planet";
			break;
		case 22:
			this.elementName =ElementName.RAIN;
			this.color = Color.blue;
			System.out.println("Created Rain");
			this.name = "Rain";
			break;
		case 23:
			this.elementName = ElementName.PLANT;
			this.color = Color.green;
			System.out.println("Created Plant");
			this.name = "Plant";
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
		
		case PRESSURE:
			return 6;
		
		case STONE:
			return 7;
		
		case MIST:
			return 8;
			
		case DIRT:
			return 9;
			
		case MUD:
			return 10;
		
		case BRICK:
			return 11;
			
		case WALL:
			return 12;
		
		case HOUSE:
			return 13;
			
		case CITY:
			return 14;
			
		case WATERFALL:
			return 15;
		
		case OCEAN:
			return 16;
		
		case LAVA:
			return 17;
		
		case VOLCANO:
			return 18;
		
		case ISLAND:
			return 19;
			
		case LAND:
			return 20;
			
		case CONTINET:
			return 21;
			
		case PLANET:
			return 22;
			
		case RAIN:
			return 23;
			
		case PLANT:
			return 24;
			
		default:
			return 0;
		}
	}

	void draw(Graphics g) {
		g.drawImage(img, x, y, 64, 64, null);
//		g.setColor(this.color);
//		g.fillRect(x, y, 50, 50);
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
	BufferedImage loadimg(String path) {
		BufferedImage elementImg = null;
		try {
		  elementImg = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.out.println("Image not found: " + e);
		}
		return elementImg;
	}
}
