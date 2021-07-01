package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*

class MyFrame extends Jframe | JPanel | EVENT
{

	
	// note : it is good to extend a JFrame class and make its object in main method and make a frame
}

*/


public class EVENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		
		JFrame frame = new JFrame();   				// it will create a object of invisible java frame
		frame.setVisible(true);	       				// it will make the java frame visible
		frame.setSize(700, 500);       				// it will set the size of java frame
		frame.setLocation(100, 50);    				// it will set the location of java frame
		frame.setBounds(700, 500, 100, 50); 		// it will set the size and location of java frame together
		frame.setTitle("java frame"); 				// it will set the title of the java frame
		Container c = frame.getContentPane();   	// it will generate a container 
		c.setBackground(Color.RED);					// it will set a background color
		frame.setResizable(false);					// it will resize | !resize the java frame
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // it will exit the java frame on close
		c.setLayout(null); 									// it will set the layout null
		
		
		
		Canvas canvas = new Canvas();
		canvas.setVisible(true);	       		// it will make the java frame visible
		canvas.setSize(700, 500);       		// it will set the size of java frame
		canvas.setLocation(100, 50);    		// it will set the location of java frame
		canvas.setBounds(700, 500, 100, 50); 	// it will set the size and location of java frame together
		canvas.setColor(Color.RED);         	// it will color the canvas
		
		c.add(canvas) ;
		
		note : it is applicable to paint the canvas and add it in the java frame or container
		
		// Dialog
		 
		     Dialog dialog = new Dialog() ;
		     dialog.setVisible(true) ;
		     dialog.setSize(700, 500);       		
			 dialog.setLocation(100, 50);    		
			 dialog.setBounds(700, 500, 100, 50); 
			 dialog.setTitle("java frame"); 		
			
			c.add(dialog) ;
		
		
		
		
		// JLabel
		
			JLabel label = new JLabel("...");	    	// it will create a object of label and give the label name
			label.setText("...");					  	// it will change the label name 
			label.setBounds(100, 50, 200, 30);        	// it will set the location and size of label division
			Font f = new Font("",Font.BOLD,30);  	// it will set the font size and font style
			label.setFont(f);							// it will add that font in the label
			c.add(label);								// it will add the label in java frame
			
		
		//Image
		 
			ImageIcon icon = new ImageIcon("file.jpg");   // it will create a object of image
			JLabel label = new JLabel(icon);              // it will create a object of label and add image object
			c.add(label);           					  // it will add label in container
		
		 it will set a icon image 
		 icon.getIconWidth() it will tell the width of icon directly applied in set location and size
		
		
		
		// To add both image and label together
				
			ImageIcon icon = new ImageIcon("file.jpg");
			JLabel label = new JLabel("text",icon,JLabel.);  
			label.setBounds(100, 50, 200, 30);      
			c.add(label);
			
		
		// it will together add image and text in label
		// it can float right and left the label by JLabel.LEFT | JLabel.RIGHT
		
		
		// JTextField
		
			JTextField mytext = new JTextField();  		//it will give a user input box and create a object
			mytext.setBounds(100, 50, 200, 40);    		// it will give height and width of division and location
			Font f = new Font("arial",Font.BOLD,30);  	// it will create a font object 
			mytext.setFont(f);  						// it will change the font in the text box | add it in text box
			mytext.setBackground(Color.YELLOW); 		// it will change the background color of text field
			mytext.setForeground(Color.GREEN);     		// it will set the foreground color of field
			c.add(mytext);
				
		
		// how to create a color ?
		 	
		 	Color color = new Color(120,100,50);   // it will create a new value of color by r,g,b value
		 	mytext.setBackground(color);			// it will set a background color
		
		
		//JPasswordField
		
			JPasswordField pass = new JPasswordField();  // it will create a object of JPasswordField || password input
			pass.setBounds(100,100,200,40); 			 // it will set location and size of field
			Font f = new Font("arial",Font.BOLD,30);	 // it will set the font size
			pass.setFont(f);  							 // it will change the font in the password box
			pass.setBackground(Color.YELLOW); 			 // it will change the backgound color of password field
			pass.setForeground(Color.GREEN);			 // it will set the the  foreground color of field
			
			c.add(pass);	
			
		//JButton
		
			JButton button = new JButton("...");  		// it will create a button object and name it 
			button.setBounds(100,150,200,40); 			// it will set the size and location of button
			Font f = new Font("arial",Font.BOLD,30);   	// it will create a font object
			button.setText("submit"); 					// it will variate the text of the button
			button.setFont(f);  						// it will change the font in the button
			button.setBackground(Color.YELLOW); 		// it will change the background color of button
			button.setForeground(Color.GREEN);			// it will variate foreground color of button
			
		//To add cursor
		
			Cursor cur = new Cursor(Cursor.HAND_CURSOR); // it will make a hand cursor (general) object on hover
			button.setCursor(cur);						// it will add the cursor on the button
			Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR); // it will make a plus cursor on hover
			Cursor cur = new Cursor(Cursor.WAIT_CURSOR);	  // it will make a loading cursor
			
		//JRadioButton
		
			JRadioButton radiobutton = new JRadioButton("male");  // it will create a radio button for text male
			JRadioButton radiobutton = new JRadioButton("female");		// it will create a radio button for text female
			
		// it will set size and location of radiobuttons
				
				radiobutton.setBounds(100,22,100,40);			
				rbutton.setBounds(100,225,200,40);
				
		// grouping of radio button it will make click in a once
		
				ButtonGroup gender = new ButtonGroup();   // it will make a object to group the radiobuttons
				gender.add(radiobutton);    	// it will add first radio button
				gender.add(radiobutton);			// it will add else radio button
				
		// it can set font and color like a simple button
		
		// if need to select one button initially
				radiobutton.setSelected(true);
		
		// To enable or disable a button
				radiobutton.setEnabled(false);
		
		// JCheckBox
		
			JCheckBox check = new JCheckBox("hello");   // it will create a checkbox and text
			check.setBounds(100,300,100,50);			// it will set its location
		
		// it can set font and color easily         
		
		//if need to select one box initially
			check.setSelected(true);
		
		//To enable or disable
			check.setEnabled(false);
		
		// JComboBox
			
			String[] array = {"a","b","c"};
			JComboBox box = new JComboBox(array);   // it will make a drop down box with all option of array
			box.setBounds(100,425,100,40);			// it will set the bound 
			
		// if more option then selecting may have problem  
		// so it need to enable write
				box.setEditable(true);
		
		// it can set font and color easily
		
		// it can select a box initially
		
				box.setSelectedIndex(1);
				box.setSelectedItem("a");
				
		// how to check and know the user selection ?
		// apply anonymous inner class apply label.setText(Integer.toString(box.getSelectedIndex())
		// apply anonymous inner class apply label.setTex(box.getSelectedItem())

		// how to add and remove item in JComboBox ?
				box.addItem("a");
				box.removeItem("a");
				
		
		// choice
		   
		   Choice c = new Choice() ;   // it will create a empty drop down box 
		   
		   // it will add the element in drop down box
		   
		   c.add("a");
		   c.add("b");
		   c.add("c");
		    
		   c.remove("a") ; // it will remove the item by the choice box
		    
		   String s = c.getSelectedItem() ;  // To get the selected item
		
		 
		// list
		 
		 	List list = new List();
		 	List list = new List(5,true); // it will initialize it by 5 rows && multiple value can be selected
		 	list.add("a") ;
		 	list.add("b") ;
		 	list.add("c") ;
		
		note : In list (1) or (>1) item can be selected
		note : In choice 1 item can be selected
		
		
		// Menu bar (it is not a component so it !can be added in container or frame directly)
		 
			MenuBar menu = new MenuBar();   // it will create a menu bar
			
		// To create menu
			 
			 Menu a = new Menu("a"); 
			 Menu b = new Menu("b");
			 Menu c = new Menu("c");
			 
		// adding menu in menu bar
			  
			 menu.add(a);
			 menu.add(b);
			 menu.add(c);
			 
		// To add shortcut keys
			 
			 MenuShortcut p = new MenuShortcut(KeyEvent.VK_ENTER) ;  the object will be reference of enter key
			 
			 
			 
		// creating menu item in menu
			 
			 MenuItem x = new MenuItem("x",p)  ;  // it will select the x menu item by a menu if press enter
			 MenuItem y = new MenuItem("y")  ;
			 MenuItem z = new MenuItem("z")  ;
			 
			
			setMenuBar(menu);  		// adding menu in menu bar
		
			
		// adding the item in menu bar
			
			a.add(x);
			a.add(y);
			a.add(z); 
			 
		// it is applicable to add menu in menu
			  
			a.add(a) ;  
			a.add(b) ;
			a.add(c) ;
			
		// note : if a,b,c possess item then it will be a nested menu
		     
		    
		
		// JtextArea
		
				JTextArea area = new JTextArea();   // it will create thee object of J Text Area
				area.setBounds(100, 475, 200, 200);  // it will set the bound of area
				area.setFont(f);					// it will set the font of area
				
				c.add(area);
				c.add(button);
				c.add(radiobutton);
				c.add(rbutton);
				c.add(check);
				c.add(box);
				
		// To add both image on a button
				
				ImageIcon icon = new ImageIcon("file.jpg");
				JButton button = new JButton(icon);
				button.setBounds(100,150,icon.getWidth(),40); // it will set size of button = image
				
				c.add(button);
				
		// note : add all the component in the container	
		
		
		*/

		
	}

}
