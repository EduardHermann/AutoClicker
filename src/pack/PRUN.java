package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * This class contains the swing components which are making the user able to start the program.
 */
public class PRUN extends JPanel {

  private static final long serialVersionUID = 1L;

  private JButton btnRUN;
  public boolean currentlyRunning = false;

  public PRUN() {
    createPane();
    btnRUN = new JButton("RUN");
    createPaneComponents();
  }

  /**
   * This method creates the components which are within the pane and finally adds them to it.
   */
  private void createPaneComponents() {
    btnRUN.setBounds(10, 22, 71, 86);
    btnRUN.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        changeAutoClickerState();
      }
    });
    add(btnRUN);
  }

  /**
   * This method changes the current state of the AutoClicker. When the AutoClicker is currently
   * running, this method will make the AutoClicker not run anymore.
   */
  public void changeAutoClickerState() {
    if (currentlyRunning == false) {
      currentlyRunning = true;
      btnRUN.setText("STOP");
    } else {
      currentlyRunning = false;
      btnRUN.setText("RUN");
    }
  }

  /**
   * This method is creates the pane. It sets the border for example.
   */
  private void createPane() {
    setBorder(new TitledBorder(null, "RUN", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    setBounds(193, 90, 91, 119);
    setLayout(null);
  }
}
