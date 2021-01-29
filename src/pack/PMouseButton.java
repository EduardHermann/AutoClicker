package pack;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * This class contains the swing components which are making the user able to choose which button is
 * getting pressed by the program.
 */
public class PMouseButton extends JPanel {

  private static final long serialVersionUID = 1L;

  public JComboBox<String> comboMB;

  public String switcherItem1 = "Left Click";
  public String switcherItem2 = "Right Click";

  public PMouseButton() {
    createPane();
    comboMB = new JComboBox<String>();
    createPaneComponents();
  }

  /**
   * This method creates the components which are within the pane and finally adds them to it.
   */
  private void createPaneComponents() {
    comboMB.setBounds(10, 22, 138, 33);
    comboMB.addItem(switcherItem1);
    comboMB.addItem(switcherItem2);
    add(comboMB);
  }

  /**
   * This method is creates the pane. It sets the border for example.
   */
  private void createPane() {
    setBorder(
        new TitledBorder(null, "Mouse Button", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    setBounds(126, 11, 158, 68);
    setLayout(null);
  }
}
