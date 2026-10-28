//A program that draws 3 ducks(one out of the water and 2 in) and a background.
import sheffield.*;
public class Assignment2{
	public static void main(String[] args){
		EasyReader fileInput = new EasyReader("duck.txt");
		int[][] duckArray = new int[130][130];
		//reading in the text file and converting them to ints
		for(int rows=0;rows<130;rows++){
			for(int columns=0;columns<130;columns++){
				duckArray[rows][columns]=(int)fileInput.readChar();
			}
		}
		
		EasyGraphics g = new EasyGraphics(520,520);
		//sky
		g.setColor(100,200,255);
		g.fillRectangle(0,389,520,130);
		//grass
		g.setColor(100,250,0);
		g.fillRectangle(0,259,520,130);
		//water
		g.setColor(0,100,150);
		g.fillRectangle(0,0,520,259);
		
		//draw ducks
		for(int rows=0;rows<130;rows+=1){
			for(int columns=0;columns<130;columns+=1){
				if(duckArray[rows][columns]%2==0){
					//eye
					if(duckArray[rows][columns]%22==0){
						g.setColor(0,0,0);
						//large duck in water
						g.fillRectangle(260+columns*2,260-rows*2,2,2);
					
						//small duck in water
						g.fillRectangle(260+columns,130-rows,1,1);
					
						//duck out the water
						g.fillRectangle(250-columns,375-rows,1,1);
					}
				}
				//legs
				else if(duckArray[rows][columns]%5==0){
					g.setColor(250,10,255);
					//duck out the water
					g.fillRectangle(250-columns,375-rows,1,1);
				}
				//bill
				else if(duckArray[rows][columns]%7==0){
					g.setColor(250,5,0);
					//large duck in water
					g.fillRectangle(260+columns*2,260-rows*2,2,2);
					
					//small duck in water 
					g.fillRectangle(260+columns,130-rows,1,1);
					
					//duck out the water
					g.fillRectangle(250-columns,375-rows,1,1);
				}
				//body
				else{
					g.setColor(200,200,0);
					//large duck in water
					g.fillRectangle(260+columns*2,260-rows*2,2,2);
					
					//small duck in water
					g.fillRectangle(260+columns,130-rows,1,1);
					
					//duck out the water
					g.fillRectangle(250-columns,375-rows,1,1);
				}
			}
		}
	}
}