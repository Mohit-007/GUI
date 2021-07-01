package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PANEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = frame.getContentPane();
		c.setBackground(Color.white);
		//c.setLayout(null);
		
		//border layout
		BorderLayout B = new BorderLayout(10,5);  // v gap = 10 , h gap = 5
		c.setLayout(B);
		
		//B.setHgap(10);
		//B.setVgap(5);
		
		// JButton
		
		JButton button1 = new JButton("page start");
		JButton button2 = new JButton("page end");
		JButton button3 = new JButton("line start");
		JButton button4 = new JButton("center");
		JButton button5 = new JButton("line end");
		
		c.add(button1,BorderLayout.PAGE_START);
		c.add(button2,BorderLayout.PAGE_END);
		c.add(button3,BorderLayout.LINE_START);
		c.add(button4,BorderLayout.CENTER);
		c.add(button5,BorderLayout.LINE_END);
		
		
		
		/* j panel
		
		// JPanel panel = new JPanel();
		// panel.setBackground(Color.orange);
		// note : it possess border layout so it increase decrease with frame size by default with border of frame)
		
		// JButton button = new JButton("ok");
		// panel.add(button); // it will add button in panel it posses flow layout
		// it can set bounds by panel.setLayout(null) ;
		
		// it can add panel in panel same like panel in container
		//c.add(panel);
		
		// layouts
		// 1) null layout => the component size will not be changed if frame size and we can set element 
		// 2) border layout => 5 areas header , footer , line start , end , center component adjust automatically
		
		*/
	
		
		/*
	    // flowlayout
		//	1) it adjust border size according to test size
		//	2) if horizontal space less then divide in row , if more then all button centred (default)
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		
		FlowLayout F = new FlowLayout(FlowLayout.,5,5);
		c.setLayout(F);
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5,1);   // it can index the button
		
		// apply FlowLayout.LEFT | .RIGHT (it will shift the left or right the button)
		
		// 
		
		// how to set gap in component
		//F.Hgap();
		//F.Vgap();
		
		*/
		
		/* grid layout
		  * 1) all component cover full row and col  
		  * 2) all componenet have same size , it increse with frame size
		  *	3) it is grid type
		 
		*/
		
		/*
		GridLayout G = new GridLayout(1,2,3,4); // row col hgap vgap
		c.setLayout(G);
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5,1);   // it can index the button
		*/

		/*
		  	scroll panel
		  	
		  	scrollPane scroll = new scrollPane() ;  (it will give a scrolling panel in java panel
		 	scroll.add(panel) ;						(it will add panel in scroll panel)
		 	c.add(scroll) ;							(it will add scroll panel in container)
		 	
		 */
		
		
	}

}
