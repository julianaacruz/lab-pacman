package Screens;


import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	private PImage menu;
	private PImage board;
	private PImage scores;
	private PImage marker;
	private PImage howto;
	private PImage pacman1;
	public PImage up1,up2;
	public PImage down1,down2;
	public PImage left1,left2;
	public PImage right1,right2;
	public PImage blue, yellow, red, orange;
	public PApplet app;
	boolean htp = true;
	public int screen = 0;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(600,700);

	}
	public void setup() {
		  menu = loadImage ("Menu.png");
		  marker = loadImage ("Marker.png");
		  board = loadImage ("Board.png");
		  scores = loadImage ("HighScores.png");
		  howto = loadImage ("HowToPlay.png");
			pacman1 = loadImage("Pacman1.png");
			up1 = loadImage("PacmanUp2.png");
			up2 = loadImage("PacmanUp3.png");
			down1 = loadImage("PacmanDown2.png");
			down2 = loadImage("PacmanDown3.png");
			left1 = loadImage("PacmanLeft2.png");
			left2 = loadImage("PacmanLeft3.png");
			right1 = loadImage("PacmanRight2.png");
			right2 = loadImage("PacmanRight3.png");
			blue = loadImage("Inky.png");
			red = loadImage("Blinky.png");
			yellow = loadImage("Kiiro.png");
			orange = loadImage("Clyde.png");

	}
	
	public void draw() {

		switch(screen) {

		  case 0: 
			  int x=330; //pos marker
			  int y=200;
			  menu.loadPixels();
			  marker.loadPixels();
			  if((mouseX>300) && (mouseY>320)) {
				  x=260;
				  y=270;}
			  image (menu,0,0);
			  image (marker,x,y);
			  
			  if (mouseX>360 && mouseY<380 && mouseY>260 && x==330 && mousePressed==true) {
				 screen = 1;  
				 }else if (x==260 && mouseX>320 && mouseY>320 && mouseY<410 && mousePressed==true) {
				 screen = 2;	  
				  }
				break;
		  case 1: 
				board.loadPixels();
				howto.loadPixels();
				image (board,0,0);
				pacman1.loadPixels();
				image(pacman1,286,472);
				if(htp==true) {
					image (howto,92,100);
				}
				if (mouseX>250 && mouseX<385 && mouseY>480 && mouseY<530 && screen==1 && mousePressed==true) {
			    htp=false;
				} 
				
				//
				
				break;
		  case 2:
				scores.loadPixels();
				image (scores,0,0);
				if (mouseX<95 && mouseY<660 && mouseY>600 && mousePressed==true) {
					screen=0;
		}
				break;
		}
	}
	}
	
			
	



