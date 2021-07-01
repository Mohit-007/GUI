package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Focus extends JFrame implements  FocusListener
{
	Container c;
    JTextField textfield = new JTextField();
	JTextField text = new JTextField();
	JTextArea textarea = new JTextArea(); 
	Focus()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		// array of  color
		
		
		textfield.setBounds(50, 50, 150, 40);
		text.setBounds(50, 120, 150, 40);
		
		textarea.setBounds(230,50,200,250);
		
		textfield.addFocusListener(this);
		
		c.add(textfield);
		c.add(text);
		c.add(textarea);
		
	}
	
	public void focusGained(FocusEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("focus gained");
	}
	public void focusLost(FocusEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("focus lost");
	}
	
}


public class FOCUSLISTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Focus frame = new Focus();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
