	package Screens;

	import processing.core.PApplet;
import processing.core.PImage;
	public class Character extends PApplet {
		//public PImage pacman1;
			PApplet app;
			int tamX,tamY;
			

			public Character(PApplet app) {
				this.app = app;
				tamX=20;
				tamY=20;
			}
			
			public void pintar(int posXE, int posYE,PImage image ) {
				//app.fill(255,0,255);
				//app.ellipse(posXE, posYE, tamX, tamY);
				app.image(image,posXE,posYE);
			}
		}
