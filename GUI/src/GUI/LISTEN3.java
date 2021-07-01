package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class LISTEN3 {
	
	static Container c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("by separate class");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 100, 700, 500);
		
		c =frame.getContentPane();
		c.setLayout(null);
	
		JButton red = new JButton("red");
		red.setBounds(100, 50, 70, 30);
		
		RedListnerClass redlisten = new RedListnerClass();
		red.addActionListener(redlisten);
		
		
		c.add(red);
	
	}

}

class RedListnerClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		LISTEN3.c.setBackground(Color.red);

	}
}
