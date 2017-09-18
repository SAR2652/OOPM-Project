import javax.swing.*;
class SAS extends JFrame
{
  JPanel pnl = new JPanel();
  public SAS()
  {
    super("SAS");
    setSize(1920, 1080);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);
  }
  public static void main(String[] args)
  {
    SAS gui = new SAS();
  }
}
    
      
