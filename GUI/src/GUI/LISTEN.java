package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LISTEN {

	static Container c ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("anonymous inner class");
		f.setVisible(true);
		f.setBounds(100, 50, 700, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = f.getContentPane();
		c.setBackground(Color.green);
		c.setLayout(null);
		
		JButton red = new JButton("red");
		red.setBounds(100, 50, 70, 30);
		c.add(red);
		
		// anonymous method (Anonymous Inner Class)  
		
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)// class
			{
				redButtonAction(e);   // call the method
			}
		});
		
		//JButton green = new JButton("green");
		//green.setBounds(200, 50, 70, 30);
		//c.add(green);
	}
	

	
		// different method for ddifferent buttons
		static void redButtonAction(ActionEvent e)
		{
			c.setBackground(Color.RED);
		}

}
