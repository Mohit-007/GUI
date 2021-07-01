package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;




class Framed extends JFrame implements  KeyListener
{
	Container c;
    JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	Framed()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		// array of  color
		
		
		textarea.setBounds(210, 50, 250, 250);
		textfield.setBounds(50, 50, 150, 40);
		
		textfield.addKeyListener(this);
		
		c.add(textfield);
		c.add(textarea);
		
	}
	
	public void keyTyped(KeyEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("key typed : " + e.getKeyChar() + "\n");  //  the key pressed will be shown
	}
	public void keyPressed(KeyEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("key typed : " + e.getKeyChar() + "\n");  //  the key pressed will be shown
	}
	public void keyReleased(KeyEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("key typed : " + e.getKeyChar() + "\n");  //  the key pressed will be shown
	}
}



public class KEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Framed frame = new Framed();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
