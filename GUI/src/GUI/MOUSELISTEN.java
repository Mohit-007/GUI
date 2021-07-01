package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mouse extends JFrame implements MouseListener, MouseMotionListener
{
	Container c;
    JTextArea text = new JTextArea();
	JTextArea textarea = new JTextArea();
    mouse()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		// array of  color
		
		
		text.setBounds(20, 20, 100, 100);
		textarea.setBounds(150, 20, 250, 300);
		
		text.addMouseListener(this);
		text.addMouseMotionListener(this);
		c.add(textarea);
		c.add(text);
		
	}
	
	public void mouseEntered(MouseEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("Mouse Entered :\n " );  //  the key pressed will be shown
	}
	public void mouseExited(MouseEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("Mouse exited : \n" );  //  the key pressed will be shown
	}
	public void mousePressed(MouseEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("Mouse released \n" );  //  the key pressed will be shown
	}
	public void mouseReleased(MouseEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("Mouse release : \n" );  //  the key pressed will be shown
	}
	public void mouseClicked(MouseEvent e) // e possess the frame and button (what to change and which is click)
	{
		textarea.append("Mouse clicked \n" );  //  the key pressed will be shown
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		textarea.setText("mouse moved at " + e.getX() + e.getY()); // it will give the coordinate of position of mouse

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		textarea.setText("mouse dragged at " + e.getX() + "  "+ e.getY()); // it will give the coordinate of position of mouse

	}
}


public class MOUSELISTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mouse frame = new mouse();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
