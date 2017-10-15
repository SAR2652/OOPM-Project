import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
Creates  a frame for the editor
*/
public class createWindow
{
	void show_window()
	{
		JFrame frame = new JFrame("SAS");                     // frame object of type Jframe
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JTextArea textArea = new JTextArea();                 //No parameters given to JTextArea hence it is of unlimited size
                JScrollPane scrollpane = new JScrollPane(textArea);   //adds Scrollpane to JtextArea
                textArea.setLineWrap(true);
                frame.getContentPane().add(scrollpane);
                frame.setVisible(true);

	}
}
