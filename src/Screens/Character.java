	package Screens;

	import processing.core.PApplet;
	public class Character extends PApplet {
		//public PImage pacman1;

		public PApplet app;
		public int up;
		public int down;
		public int left;
		public int right;
		public int x;
		public int y;
		public int direction;
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}

	}

