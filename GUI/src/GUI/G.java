package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class hello extends Frame 
{
	//Container c;
	hello()
	{
		
		setTitle("event handling");
		setVisible(true);
		setSize(500,300);
		setLocation(300,100);
		setBackground(Color.BLACK);
		setForeground(Color.BLUE);
		
		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
				
				);
	}
		
		
	public void paint(Graphics g)
	{
		// To draw 
		
		//g.drawString("MOHIT",100,100);
		//g.drawLine(300,200,300,400);
		//g.drawRect(100,100, 100, 100); 					// border
		//g.drawRoundRect(200, 100, 350, 200, 30, 100);		// rounded in corner
		
		//g.drawOval(200,100,350,200); 
		//g.drawArc(100, 100, 200, 200, 90, 110);  // imagine 4 quadrant give start angle and total angle
		
		/* polygon
		
		int x[] = {100,300,200};
		int y[] = {200,100,300};
		int n = 3;
		g.drawPolygon(x, y, n); //write all point
		
		*/
		
		/*
		pentagon
		
		int x[] = {200,300,250,150,100};  // clockwise direction
		int y[] = {100,200,400,400,200};
		int n = 5;
		g.drawPolygon(x, y, n); //write all point
		
		*/
		
		//note the program is running on thread so we can manuplate it 
		
		/*
		//color
		 
		 g.drawRect(100,100,200,200);  // it will make a rect with border
		 g.setColor(Color.RED); 		// it will set the color of all the later red (to variate color) 
		 
		*/
		 
		
		 /*
		 // To delay the program for half second can be used multiple time
		 try
		 {
			 Thread.sleep(500);
		 }
		 catch(Exception e)
		 {
			 
		 }
		 
		 // note : parameter of fill < parameter of draw (To get the border)
		 
		 g.fillRect(120, 120, 160, 160); // it will fill it by default color of border
		 g.setColor(Color.green);
		 g.fillRect(150,150,100,100);
		 
		 */
		
		 // fill method can be used for all draw 
		 // it can make our own color by r g b values
		 
		 //To draw 3d figures
		 //g.draw3DRect(220, 220, 260, 260, true); // if true then raised if false then !
		 
		/* To print number 
		 for(int i=0;i<10;i++)
		 {
			
			// if apply thread class then also applicable by  try and catch block
			
			g.drawString("" + i, 100 + i*50, 100); 
			
		 }
		*/
		
		/* To draw 10 lines
		for(int i=0;i<10;i++) 
		{
			//Thread can be used
			g.drawLine(200,300+i*20,400,300+i*20);
		}
		*/
		
		//To draw a moving line
		
		/*
		// make a point
		int x1 = 100;
		int y1 = 100;
		int x2 = 101;
		int y2 = 100;
		
		for(int i=0;i<100;i++)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
				
			}
			g.drawLine(x1++,y1,x2++,y2);
		}
		*/
		
		/*
		// To draw a moving 2d figure
		int x1 = 100;
		int y1 = 100;
		int x2 = 101;
		int y2 = 100;
		
		for(int i=0;i<100;i++)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
				
			}
			g.drawLine(x1,y1,x2++,y2);
		}
		for(int i=0;i<100;i++)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
				
			}
			g.setColor(Color.red);
			g.drawLine(x1,y1,x2,y2++);
		}
		
		// it will make a line then variate color then make a triangle by sweeping the line
		
		*/
		
		// making oval shape
		int x1 = 100;
		int y1 = 100;
		int x2 = 200;
		int y2 = 200;
		int sa = 0;
		int s = 30;
		
		for(int i=0;i<300;i++)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
				
			}
			
			int r1 = (int)Math.round(Math.random()*255);
			int g1 = (int)Math.round(Math.random()*255);
			int b1 = (int)Math.round(Math.random()*255);
			Color c = new Color(r1,g1,b1);
			g.setColor(c);
			g.fillArc(x1, y1, x2, y2, sa, s++);  			
		}
		
		
		// how to change the color of instantly
		
		/* all in java. lang package
		 * it possess a a Math library
		 * Math.max|min(45,50) ; it will return 50
		 * Math.pow(2,3) => 8 ; Math.sqrt(64) => 8 ; Math.cbrt(64) => 4 ;
		 * Math.ceil|floor(5.5) => 5
		 * Math.sin(x) ...
		 * Math.random generates number between 0 and 1 and 
		 * we can change color by random function because range of color 0 to 255
		 */
		
		 
	}
	
}


public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello frame = new hello();
	}

}
