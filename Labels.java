import javax.swing.*;
class Labels extends JFrame
{
  JPanel pnl = new JPanel();
  ImageIcon duke = new ImageIcon("duke.png");
  JLabel lbl1 = new JLabel(duke);
  JLabel lbl2 = new JLabel("Duke is the friendly mascot of Java Technology.");
  JLabel lbl3 = new JLabel("Duke",duke, JLabel.CENTER); 
  public Labels()
  {
    super("Swing Window");
    setSize(1000, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);
    lbl1.setToolTipText("Duke - The Java Mascot");
    lbl3.setHorizontalTextPosition(JLabel.CENTER);
    lbl3.setVerticalTextPosition(JLabel.BOTTOM);
    pnl.add(lbl1);
    pnl.add(lbl2);
    pnl.add(lbl3);   
  }
  public static void main(String[] args)
  {
    Labels gui = new Labels();
  }
}
