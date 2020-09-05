package Screens;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	

	static PImage menu;
	static PImage board;
	static PImage scores;
	static PImage marker;
	static PImage howto;
	static PImage blue, yellow, red, orange;
	static PImage pacman1;
	static PImage up1,up2;
	static PImage down1,down2;
	static PImage left1,left2;
	static PImage right1,right2;
    private boolean htp = true;
	public int screen = 0;
	Pacman pacman;
	Maze maze;
	int size;
	int [][] matrix; 
	float posX,posY;	
	int matX, matY;
	int col,row;

	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(600,700);

	}
	public void setup() {
		pacman1 = loadImage("Pacman1.png");
		menu = loadImage ("Menu.png");
		marker = loadImage ("Marker.png");
		board = loadImage ("Board.png");
		scores = loadImage ("HighScores.png");
		howto = loadImage ("HowToPlay.png");
		blue = loadImage("Inky.png");
		red = loadImage("Blinky.png");
		yellow = loadImage("Kiiro.png");
		orange = loadImage("Clyde.png");
			
		pacman = new Pacman(this);
		maze = new Maze (this);

		col = 30;
		row = 35;
		size=20;
		posX = 100;
		posY = 100;
		matX = 1;
		matY = 1;
	    matrix  = new int [][]{
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1},
			{1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1},
			{1,1,1,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			
		};
	}


	public void draw() {
		//board.loadPixels();
		//image (board,0,0);
	

		//maze.drawMaze();
		//pacman.drawPacman();
		//maze.keyPressed();
		switch(screen) { // PANTALLAS

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
				for (int i = 0; i < col; i++) {
					for (int j = 0; j < row; j++) {
						int a=255;
						stroke(0);
						fill(a,22);
						rect((i*size),(j*size),size,size);
						if(matrix[j][i] == 1) {
							a=0;
							//System.out.println("1");
					}
				}
				}
				

				ellipse(posX,posY,25,25);
				
				//maze.drawMaze();
				//maze.keyPressed();
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
	
	
			
	



