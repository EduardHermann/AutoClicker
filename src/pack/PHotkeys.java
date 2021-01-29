package pack;

import java.awt.Font;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * This class contains the swing components which are making the user able to choose serveral
 * hotkeys which are bettering the user experiance.
 */
public class PHotkeys extends JPanel {

  private static final long serialVersionUID = 1L;

  private JLabel lblRUN;
  public JComboBox<Character> comboRUN;
  private JLabel lblMbSwitcher;
  public JComboBox<Character> comboMB_Switcher;

  public HashMap<Character, Integer> hotkeys;

  public PHotkeys() {
    createPane();
    lblRUN = new JLabel("RUN:");
    comboRUN = new JComboBox<Character>();
    lblMbSwitcher = new JLabel("MB Switcher:");
    comboMB_Switcher = new JComboBox<Character>();

    hotkeys = new HashMap<Character, Integer>();
    hotkeys.put('q', 16);
    hotkeys.put('w', 17);
    hotkeys.put('e', 18);
    hotkeys.put('r', 19);
    hotkeys.put('t', 20);
    hotkeys.put('z', 44);
    hotkeys.put('u', 22);
    hotkeys.put('i', 23);
    hotkeys.put('o', 24);
    hotkeys.put('p', 25);
    hotkeys.put('a', 30);
    hotkeys.put('s', 31);
    hotkeys.put('d', 32);
    hotkeys.put('f', 33);
    hotkeys.put('g', 34);
    hotkeys.put('h', 35);
    hotkeys.put('j', 36);
    hotkeys.put('k', 37);
    hotkeys.put('l', 38);
    hotkeys.put('y', 21);
    hotkeys.put('x', 45);
    hotkeys.put('c', 46);
    hotkeys.put('v', 47);
    hotkeys.put('b', 48);
    hotkeys.put('n', 49);
    hotkeys.put('m', 50);

    createPaneComponents();
  }

  /**
   * This method returns the current KeyCode by the selected hotkey from the user.
   */
  public int getCurrentKeyCodeByCurrentKey(JComboBox<Character> combo) {
    for (Character i : hotkeys.keySet()) {
      if (i == combo.getSelectedItem()) {
        return hotkeys.get(i);
      }
    }
    return 0;
  }

  /**
   * This method creates the components which are within the pane and finally adds them to it.
   */
  private void createPaneComponents() {
    lblRUN.setBounds(10, 22, 96, 33);
    lblRUN.setFont(new Font("Tahoma", Font.PLAIN, 16));
    add(lblRUN);

    comboRUN.setBounds(105, 22, 58, 33);
    comboRUN.addItem(null);
    for (Character i : hotkeys.keySet()) {
      comboRUN.addItem(i);
    }
    add(comboRUN);

    lblMbSwitcher.setBounds(10, 66, 96, 33);
    lblMbSwitcher.setFont(new Font("Tahoma", Font.PLAIN, 16));
    add(lblMbSwitcher);

    comboMB_Switcher.setBounds(105, 66, 58, 33);
    comboMB_Switcher.addItem(null);
    for (Character i : hotkeys.keySet()) {
      comboMB_Switcher.addItem(i);
    }
    add(comboMB_Switcher);
  }

  /**
   * This method is creates the pane. It sets the border for example.
   */
  private void createPane() {
    setBorder(
        new TitledBorder(null, "Hotkeys", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    setBounds(10, 90, 173, 119);
    setLayout(null);
  }
}

