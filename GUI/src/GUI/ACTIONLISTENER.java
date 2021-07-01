package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class frame extends JFrame implements ActionListener
{
	Container c;
    JTextField textfield = new JTextField();;
	
	frame()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		textfield.setBounds(50, 50, 100, 40);
		textfield.addActionListener(this);
		c.add(textfield);
	}
	
	public void actionPerformed(ActionEvent e) // e possess the frame and button (what to change and which is click)
	{
		String text = textfield.getText();
		String newtext = text.toUpperCase();
		textfield.setText(newtext);
	}
}



public class ACTIONLISTENER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame frame = new frame();
		frame.setTitle("event handling");
		frame.setVisible(true);
		frame.setBounds(100, 50, 700, 500);
		
	}

}
