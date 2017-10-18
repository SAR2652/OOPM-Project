import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.*;
import java.io.*;
import java.io.BufferedReader;


class text_area extends JFrame
{

        JTextArea textArea;
        JScrollPane scrollpane;
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem newAction,saveAction,openAction;

        public text_area()
        {

        // creates new window
          super("SAS");
          setSize(500,500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creates new text area
          textArea = new JTextArea();
          textArea.setLineWrap(true);
          textArea.setFont(new Font("Serif",Font.ITALIC,15));

        // creates new scroll pane
          scrollpane = new JScrollPane(textArea);
          getContentPane().add(scrollpane);
          setVisible(true);

        // calls create_menu
         create_menu();

        }

        public void create_menu()
        {
                menuBar = new JMenuBar();
                menu = new JMenu("FILE");
                newAction = new JMenuItem("New");
                
                newAction.addActionListener(new ActionListener()
                {
                        public void actionPerformed(ActionEvent e)
                        {
                               new text_area();
                        }
                });

                saveAction = new JMenuItem("Save");  
            


            //implements the save function 

                saveAction.addActionListener(new ActionListener()
         {
                public void actionPerformed(ActionEvent e)
                {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("Specify new File");
                        fileChooser.setSelectedFile(new File("file1"));
                        int userSelection = fileChooser.showSaveDialog(fileChooser);
                 
                        if(userSelection == JFileChooser.APPROVE_OPTION)
                        {
                                File file = fileChooser.getSelectedFile();

                                BufferedWriter  writer = null;
                                try

                                {
                                        writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()+""));
                                        writer.write(textArea.getText());
                                        writer.close();
                                }

                                catch(IOException a)
                                {
                                    System.out.println("Something went Wrong");
                                }
                        }
                        
                }
         });

             // implements the open function

                openAction = new JMenuItem("Open");

                openAction.addActionListener(new ActionListener()
                {

                 public void actionPerformed(ActionEvent e )
                 {
                      JFileChooser fileChooser = new JFileChooser();
                      int ans = fileChooser.showOpenDialog(fileChooser);
                      if(ans == JFileChooser.APPROVE_OPTION)
                      {
                        File file = fileChooser.getSelectedFile();
                        String filename = fileChooser.getSelectedFile().getName();

                        System.out.println(filename);

                       try 
                       {
                          FileReader fr = new FileReader(file);
                          BufferedReader br = new BufferedReader(fr);

                          
                          String s=""; int c=0;
                                while((c=br.read())!=-1)
                                        s+=(char)c; 

                         textArea.append(s);

                        
                                br.close();
                                fr.close();
                       }

                       catch(IOException b)
                       {
                          System.out.println("Something went wrong\n");
                       }

                      }
              }
                });







                menuBar.add(menu);
                menu.add(newAction);
                menu.add(saveAction);
                menu.add(openAction);
                setJMenuBar(menuBar);


        }

      
}



public class editor
{
        public static void main(String args[])
        {
               new text_area();
        }
}