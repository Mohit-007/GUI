package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator {

	static JLabel num1 = new JLabel("First Number");
	static JLabel num2 = new JLabel("Second Number");
	static JTextField num1t = new JTextField();
	static JTextField num2t = new JTextField();
	static JButton add = new JButton("+");
	static JButton subtract = new JButton("-");
	static JButton multiply = new JButton("*");
	static JButton divide = new JButton("/");
	static JLabel ans = new JLabel("Result");
	static JTextField anst = new JTextField();

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(200, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
//		Container c = f.getContentPane();
//		//c.setLayout(null);
//		c.setLayout(new GridLayout(2, 2));
		
//		num1.setBounds(50,50,75,25);
//		num2.setBounds(50,90,75,25);
//	
//		num1t.setBounds(130,50,100,25);
//		num2t.setBounds(130,90,100,25);
//	
//		add.setBounds(20,130,80,30);
//		subtract.setBounds(100,130,80,30);
//		multiply.setBounds(180,130,80,30);
//		divide.setBounds(260,130,80,30);
//		
//		ans.setBounds(50, 180, 70, 25);
//		anst.setBounds(130,180,70,25);

		
		add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				add_action(e);
			}
		});
		
		subtract.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e)
					{
						//subtract_action(e);
					}
				});
		
		multiply.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				//multiply_action(e);
			}
		});
		
		divide.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				//divide_action(e);
			}
		});

		
		
		
		

		
		c.add(num1);
		c.add(num1t);
		c.add(num2);
		c.add(num2t);
		c.add(ans);
		c.add(anst);
		c.add(add);
		c.add(subtract);
		c.add(multiply);
		c.add(divide);
		
		num1t.setBackground(Color.green);
		num2t.setBackground(Color.green);
		anst.setBackground(Color.red);

		Font f1 = new Font("comic sans",Font.BOLD, 30);
		num1.setFont(f1);
		num1t.setFont(f1);
		num2.setFont(f1);
		num2t.setFont(f1);
		ans.setFont(f1);
		anst.setFont(f1);
		
		add.setFont(f1);	subtract.setFont(f1);	multiply.setFont(f1);	divide.setFont(f1);
		num1.setForeground(Color.white);		num1t.setForeground(Color.white);		num2.setForeground(Color.white);		num2t.setForeground(Color.white);
		
		c.setLayout(new GridLayout(5,2));
		f.add(c);
	}
	
	public static void add_action(ActionEvent e)
	{
		String s1 = num1t.getText();
		String s2 = num2t.getText();
		
		float n1 = Float.parseFloat(s1); 	//(wrraper) 
		float n2 = Float.parseFloat(s2);
		float n3 = n1 + n2 ;
		String s3 = Float.toString(n3);
		anst.setText(s3);
	}
	// similarly make all method

	
}

//how to make a jar file (executable file) ?
//make a new folder on desktop
//copy anonymous class file and main class in that new folder
//make a manifest file Main-Class: (class name) enter
//open cmd prompt write  jar -cfm calc.jar manifest.txt *
