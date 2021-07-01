package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class Myframe extends JFrame implements ActionListener
{
	// all object will be form here for a particular JFrame 
	
	JButton button = new JButton("click");  // first it makes a button
	JButton buttoni = new JButton("click"); // it can set more than one button that can perform different task
	 
	
	// a container object
	Container c;
    // all extra object needed to add in JFrame
	Cursor cur = new Cursor(Cursor.HAND_CURSOR); // it will make a hand cursor on hover
	
	Myframe()
	{
		// it will create c for this frame
		c = this.getContentPane();
		// it will set all default layout of container null so that ...
		c.setLayout(null);
		// it will set all bounds size and location of button in frame
		button.setBounds(100, 50, 100, 50); // setbound for each button 
		buttoni.setBounds(200, 50, 100, 50); // setBound for buttoni
		// it will add cursor
		button.setCursor(cur); // set cursor for all button
		// it will call the method action listener for the this frame if button is clicked
		button.addActionListener(this);  //set different method for all the button
		buttoni.addActionListener(this);
		//it will add button in the container  
		c.add(button); 
		c.add(buttoni);
	}
	// the function will variate the propertires of JFrame
	
	public void actionPerformed(ActionEvent e) // e possess the frame and button (what to change and which is click)
	{
		if(e.getSource() == button)
			c.setBackground(Color.YELLOW);
		else
			c.setBackground(Color.GREEN);
		
		// apply e.getSource to identify which button
	}
	
	// note : for action listening 
	//	1) implement action listner 
	//	2) addActionListner(this) 
	//	3) overirde method button selection
}


public class LISTEN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myframe f = new Myframe();
		f.setTitle("event handling");
		f.setVisible(true);
		f.setBounds(100, 50, 700, 500);
		
	}

}
