import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
Creates  a frame for the editor
*/

 class createWindow
{
	void show_window()
	{
		JFrame frame = new JFrame("SAS");                     // frame object of type Jframe
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollpane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        frame.getContentPane().add(scrollpane);
        frame.setVisible(true);

	}
}



public class SAS
{
	public static void main(String args[])
	{
		createWindow window =  new createWindow();
		window.show_window();


		System.out.println("Hello world");
	}
}