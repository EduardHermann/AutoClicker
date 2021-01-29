package pack;

import javax.swing.JFrame;
import java.awt.Toolkit;

/**
 * This class consists of the main frame where all of the swing components are getting placed on.
 */
public class Window extends JFrame {

  private static final long serialVersionUID = 1L;

  public PCPS pCPS;
  public PHotkeys pHotkeys;
  public PMouseButton pMouseButton;
  public PRUN pRUN;

  /**
   * Create the application.
   */
  public Window(PCPS pCPS, PHotkeys pHotkeys, PMouseButton pMouseButton, PRUN pRUN) {
    this.pCPS = pCPS;
    this.pHotkeys = pHotkeys;
    this.pMouseButton = pMouseButton;
    this.pRUN = pRUN;
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    setResizable(false);
    setTitle("AutoClicker by Eduard Hermann");
    setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/icon/icon.png")));
    setBounds(100, 100, 310, 255);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    getContentPane().add(pCPS);
    getContentPane().add(pHotkeys);
    getContentPane().add(pMouseButton);
    getContentPane().add(pRUN);
    setVisible(true);
  }
}
