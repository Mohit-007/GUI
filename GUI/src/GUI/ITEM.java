package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



//it will change the state of frame and element if combo option clicked or if check box clicked

class Fram extends JFrame implements  ItemListener
{
	Container c;
	JCheckBox[] textfield;
	JTextArea textarea = new JTextArea();
	
	Fram()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		// array of  color
		Color[] color = {Color.BLUE,Color.RED,Color.green} ;
		textfield = new JCheckBox[5];
		for(int i=0;i<5;i++)
		{
			textfield[i] = new JCheckBox("BOX " + Integer.toString(i+1));
			textfield[i].setBounds(50,50+(50*i),100,50);
			textfield[i].addItemListener(this);
			
			c.add(textfield[i]);
		}
		
		textarea.setBounds(200, 50, 150, 200);
		c.add(textarea);
		
	}
	
	public void itemStateChanged(ItemEvent e) // e possess the frame and button 
	{
		
		textarea.setText("");
		for(int i=0;i<textfield.length ;i++)
		{
			if(textfield[i].isSelected())
			{
				textarea.append(textfield[i].getText() + "\n");
			}
		}
		
	
	}
}


public class ITEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fram frame = new Fram();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
