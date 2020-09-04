package Screens;

public class Menu extends Main {
	public void setup() {
		menu = loadImage ("Menu.png");
		menu.loadPixels();
		image (menu,0,0);
}
}