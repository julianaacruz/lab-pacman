package Screens;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	private PImage menu;
	private PImage board;
	private PImage scores;
	private PImage marker;
	private PImage howto;
    //private PImage blue, yellow, red, orange;
    // private PApplet app;
	/*public PImage pacman1;
    private PImage up1,up2;
    private PImage down1,down2;
    private PImage left1,left2;
    private PImage right1,right2;*/
    private boolean htp = true;
	public int screen = 0;
	Pacman pacman;
	Maze maze;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(600,700);

	}
	public void setup() {
		//pacman1 = loadImage("Pacman1.png");
		menu = loadImage ("Menu.png");
		  marker = loadImage ("Marker.png");
		  board = loadImage ("Board.png");
		  scores = loadImage ("HighScores.png");
		  howto = loadImage ("HowToPlay.png");
			/*blue = loadImage("Inky.png");
			red = loadImage("Blinky.png");
			yellow = loadImage("Kiiro.png");
			orange = loadImage("Clyde.png");*/
			
			pacman = new Pacman(this);
			maze = new Maze (this);

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
				//pacman1.loadPixels();
				//image(pacman1,286,472);
				pacman.drawPacman();
				maze.drawMaze();
				maze.keyPressed();
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
	
			
	



