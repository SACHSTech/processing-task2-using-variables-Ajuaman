import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// BASE DIEMSIONS USED TO CALCULATE DOOR POSITION
	int baseX = 200;
	int baseY = 400;
	
	public void settings() {
	   size(1000, 1000);
	}
	  
	public void setup() {
	   background(210, 255, 173);
	   strokeWeight(5);
	}

	public void draw() {
		
	   // BASE OF THE HOUSE
	   rect(width/3, (float) (height/1.5), width/3, height/4);
	   fill(138, 132, 127);
	   // DOOR
	   rect((float) (width/2.142), (float) (height / 1.2), width/20, height/12);
	   fill(118, 156, 145);
		
	   // ROOF
	   triangle((width/6), (float) (height/1.5), (width/2), (float) (height/7.5), (float) (width/1.2), (float) (height/1.5));
	   fill(44, 245, 188);
		
	   // WINDOWS
	   ellipse((float) (width/1.71), (float) (height/1.33), width/20, height/20);
	   ellipse((float) (width/2.4), (float) (height/1.33), width/20, height/20);
	   fill(255);
		
	   line(width/2, height/2, (float) (width/3.75), height/2);
	   line(width/2, height/3, (float) (width/2.69), height/3);
	   
	}
}