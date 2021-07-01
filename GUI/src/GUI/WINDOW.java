package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;



class Win extends JFrame implements  WindowListener
{
	Container c;
	Win()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		// array of  color
		this.addWindowListener(this);
		
	}
	
	public void windowOpened(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("open\n");
	}
	public void windowClosing(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("closing\n");
	}
	public void windowClosed(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("closed\n");
	}
	public void windowActivated(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("activated\n");
	}
	public void windowDeactivated(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("deactivated\n");
	}
	public void windowIconified(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("icon\n");
	}
	public void windowDeiconified(WindowEvent e) // e possess the frame and button (what to change and which is click)
	{
		System.out.println("deicon\n");
	}
	
// note : never call closed because  exit on close
}



public class WINDOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Win frame = new Win();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
