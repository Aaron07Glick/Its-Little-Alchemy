package Game;

import java.awt.Graphics;

public class SideBar {
	int x;
	int y;
	int width;
	int height;

	SideBar() {
		this.x = 1900;
		this.y = 0;
		this.width = 100;
		this.height = 1000;
	}

	void display(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
