package pack;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * This class contains the swing components which are making the user able to choose how many clicks
 * per second the program should make.
 */
public class PCPS extends JPanel {

  private static final long serialVersionUID = 1L;
  
  public JComboBox<Integer> comboCPS;  
  
  public PCPS() {
    createPane();
    comboCPS = new JComboBox<Integer>();
    createPaneComponents();
  }
  
  /**
   * This method creates the components which are within the pane and finally adds them to it.
   */
  private void createPaneComponents() {
    comboCPS.setBounds(10, 22, 85, 33);
    for(int i = 1; i <= 100; i++) {
      comboCPS.addItem(i);
    }
    add(comboCPS);
  }
  
  /**
   * This method is creates the pane. It sets the border for example.
   */
  private void createPane() {
    setBorder(new TitledBorder(null, "CPS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    setBounds(10, 11, 106, 68);
    setLayout(null);
  }
}
