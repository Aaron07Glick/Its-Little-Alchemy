package Game;

import java.awt.Graphics;


public class SideBar {
	int x;
	int y;
	int width;
	int height;
	

	SideBar() {
		this.x = 1800;
		this.y = 0;
		this.width = 120;
		this.height = 1000;
	}

	void display(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
