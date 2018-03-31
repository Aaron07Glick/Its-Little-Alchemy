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
			img = loadImg("src/air.png");
			System.out.println("created air");
			this.name = "Air";
			break;
		case 1:
			this.elementName = ElementName.EARTH;
			img = loadImg("src/earth.png");
			System.out.println("created earth");
			this.name = "Earth";
			break;
		case 2:
			this.elementName = ElementName.FIRE;
			//this.color = Color.red;
			img = loadImg("src/fire.png");
			System.out.println("create fire");
			this.name = "Fire";
			break;
		case 3:
			this.elementName = ElementName.WATER;
			img = loadImg("src/water.png");
			System.out.println("created water");
			this.name = "Water";
			break;
		case 4:
			this.elementName = ElementName.STEAM;
			img = loadImg("src/steam.png");
			System.out.println("created Steam");
			this.name = "Steam";
			break;
		case 5:
			this.elementName = ElementName.PRESSURE;
			img = loadImg("src/pressure.png");
			System.out.println("created Pressure");
			this.name = "Pressure";
			break;
		case 6:
			this.elementName = ElementName.STONE;
			img = loadImg("src/stone.png");
			System.out.println("Created Stone");
			this.name = "Stone";
			break;
		case 7:
			this.elementName= ElementName.MIST;
			img = loadImg("src/mist.png");
			System.out.println("Created Mist");
			this.name = "Mist";
			break;
		case 8:
			this.elementName = ElementName.DIRT;
			img = loadImg("src/dirt.png");
			System.out.println("Created Dirt");
			this.name = "Dirt";
			break;
		case 9:
			this.elementName = ElementName.MUD;
			img = loadImg("src/mud.png");
			this.color = Color.gray;
			System.out.println("Created Mud");
			this.name = "Mud";
			break;
		case 10:
			this.elementName = ElementName.BRICK;
			img = loadImg("src/brick.png");
			this.color = Color.red;
			System.out.println("Created Brick");
			this.name = "Brick";
			break;
		case 11:
			this.elementName = ElementName.WALL;
			img = loadImg("src/wall.png");
			this.color = Color.red;
			System.out.println("Created Wall");
			this.name = "Wall";
			break;
		case 12:
			this.elementName = ElementName.HOUSE;
			img = loadImg("src/house.png");
			this.color = Color.orange;
			System.out.println("Created House");
			this.name = "House";
			break;
		case 13:
			this.elementName = ElementName.CITY;
			img = loadImg("src/city.png");
			this.color = Color.orange;
			System.out.println("Created City");
			this.name = "City";
			break;
		case 14:
			this.elementName = ElementName.WATERFALL;
			img = loadImg("src/waterfall.png");
			this.color = Color.blue;
			System.out.println("Created waterFall");
			this.name = "WaterFall";
			break;
		case 15:
			this.elementName = ElementName.OCEAN;
			img = loadImg("src/Ocean.png");
			this.color = Color.blue;
			System.out.println("Created OCEAN");
			this.name = "OCEAN";
			break;
		case 16:
			this.elementName = ElementName.LAVA;
			img = loadImg("src/lava.png");
			this.color = Color.red;
			System.out.println("Created Lava");
			this.name = "Lava";
			break;
		case 17:
			this.elementName = ElementName.VOLCANO;
			img = loadImg("src/volcano.png");
			this.color = Color.lightGray;
			System.out.println("Created Volcano");
			this.name = "Volcano";
			break;
		case 18:
			this.elementName = ElementName.ISLAND;
			img = loadImg("src/island.png");
			this.color = Color.cyan;
			System.out.println("Created island");
			this.name = "Island";
			break;
		case 19:
			this.elementName = ElementName.LAND;
			img = loadImg("src/land.png");
			this.color = Color.DARK_GRAY;
			System.out.println("Created Land");
			this.name = "Land";
			break;
		case 20:
			this.elementName = ElementName.CONTINET;
			img = loadImg("src/Continet.png");
			this.color = Color.green;
			System.out.println("Created Continet");
			this.name = "Continet";
			break;
		case 21:
			this.elementName = ElementName.PLANET;
			img = loadImg("src/planet.png");
			this.color = Color.blue;
			System.out.println("Created Planet");
			this.name = "Planet";
			break;
		case 22:
			this.elementName =ElementName.RAIN;
			img = loadImg("src/rain.png");
			this.color = Color.blue;
			System.out.println("Created Rain");
			this.name = "Rain";
			break;
		case 23:
			this.elementName = ElementName.PLANT;
			img = loadImg("src/plant.png");
			this.color = Color.green;
			System.out.println("Created Plant");
			this.name = "Plant";
			break;
		case 24:
			this.elementName = ElementName.GUNPOWDER;
			img = loadImg("src/GUNPOWDER.png");
			System.out.println("created gunpowder");
			this.name = "Gunpowder";
			break;
		case 25:
			this.elementName = ElementName.ENERGY;
			img = loadImg("src/energy.png");
			System.out.println("created Energy");
			this.name = "Energy";
			break;
		case 26:
			this.elementName = ElementName.DUST;
			img = loadImg("src/dust.png");
			System.out.println("created Dust");
			this.name = "Dust";
			break;
		case 27:
			this.elementName = ElementName.SWAMP;
			img = loadImg("src/Swamp.png");
			System.out.println("created Swamp");
			this.name = "Swamp";
			break;
		case 28:
			this.elementName = ElementName.LIFE;
			img = loadImg("src/DNA.png");
			System.out.println("created LIFE");
			this.name = "Life";
			break;
		case 29:
			this.elementName = ElementName.SAND;
			img = loadImg("src/Sand.png");
			System.out.println("created Sand");
			this.name = "Sand";
			break;
		case 30:
			this.elementName = ElementName.TIME;
			img = loadImg("src/HOURGLASS.png");
			System.out.println("created Time");
			this.name = "Time";
			break;
		case 31:
			this.elementName = ElementName.HUMAN;
			img = loadImg("src/Human.png");
			System.out.println("created HUMAN");
			this.name = "Human";
			break;
		case 32:
			this.elementName = ElementName.CLOCK;
			img = loadImg("src/clock.png");
			System.out.println("created Clock");
			this.name = "Clock";
			break;
		case 33:
			this.elementName = ElementName.GLASS;
			img = loadImg("src/Glass.png");
			System.out.println("created GLASS");
			this.name = "Glass";
			break;
		case 34:
			this.elementName = ElementName.METAL;
			img = loadImg("src/Metal.png");
			System.out.println("created METAL");
			this.name = "Metal";
			break;
		case 35:
			this.elementName = ElementName.BLADE;
			img = loadImg("src/Blade.png");
			System.out.println("created Blade");
			this.name = "Blade";
			break;
		case 36:
			this.elementName = ElementName.SWORD;
			img = loadImg("src/sword.png");
			System.out.println("created Sword");
			this.name = "Sword";
			break;
		case 37:
			this.elementName = ElementName.COMPUTER;
			img = loadImg("src/computer.png");
			System.out.println("created Computer");
			this.name = "Computer";
			break;
		case 38:
			this.elementName = ElementName.ELECTRITY;
			img = loadImg("src/Electity.png");
			System.out.println("ELECTRITY");
			this.name = "ELECTRITY";
			break;
		case 39:
			this.elementName = ElementName.SUPERCOMPUTER;
			img = loadImg("src/SuperComputer.png");
			System.out.println("SUPERCOMPUTER");
			this.name = "SUPERCOMPUTER";
			break;
		case 40:
			this.elementName = ElementName.TIMEMACHINE;
			img = loadImg("src/TimeMachine.png");
			System.out.println("TIMEMACHINE");
			this.name = "TIMEMACHINE";
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
			
		case GUNPOWDER:
			return 25;
			
		case ENERGY:
			return 26;
			
		case DUST:
			return 27;
			
		case SWAMP:
			return 28;
			
		case LIFE:
			return 29;
			
		case SAND:
			return 30;
			
		case TIME:
			return 31;
			
		case HUMAN:
			return 32;
			
		case CLOCK:
			return 33;
			
		case GLASS:
			return 34;
			
		case METAL:
			return 35;
			
		case BLADE:
			return 36;
			
		case SWORD:
			return 37;
			
		case COMPUTER:
			return 38;
			
		case ELECTRITY:
			return 39;
			
		case SUPERCOMPUTER:
			return 40;
			
		case TIMEMACHINE:
			return 41;
			
			
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
	BufferedImage loadImg(String path) {
		BufferedImage elementImg = null;
		try {
		  elementImg = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.out.println("Image not found: " + e);
		}
		return elementImg;
	}
}
