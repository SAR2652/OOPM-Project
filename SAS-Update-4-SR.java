import javax.swing.*;
class SAS extends JFrame
{
  JLabel lbl1 = new JLabel("Type Here :");
  JTextArea txtArea = new JTextArea(50, 80);
  JScrollPane pane1 = new JScrollPane(txtArea);
  JScrollPane pane2 = new JScrollPane(txtArea);
  JPanel pnl = new JPanel();
  public SAS()
  {
    super("SAS");
    setSize(1600,900);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);
    lbl1.setHorizontalTextPosition(JLabel.CENTER);
    lbl1.setVerticalTextPosition(JLabel.TOP);
    pnl.add(lbl1);
    txtArea.setLineWrap(true);
    txtArea.setWrapStyleWord(true);
    pane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pnl.add(pane1);
    pnl.add(pane2);
  }
  public static void main(String[] args)
  {
    SAS gui = new SAS();
  }
}
    
      
