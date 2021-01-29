package pack;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 * This class handles the globel user key pressed input.
 */
public class KeyHandler implements NativeKeyListener {

  Window window;

  public KeyHandler(Window window) {
    this.window = window;
  }

  /**
   * This method changes the state of the program/AutoClicker whenever the user uses his hotkeys.
   */
  @Override
  public void nativeKeyPressed(NativeKeyEvent arg0) {
    if (window.pHotkeys.comboRUN.getSelectedItem() != null) {
      if (arg0.getKeyCode() == window.pHotkeys
          .getCurrentKeyCodeByCurrentKey(window.pHotkeys.comboRUN)) {
        window.pRUN.changeAutoClickerState();
      }
    }

    if (window.pHotkeys.comboMB_Switcher.getSelectedItem() != null) {
      if (arg0.getKeyCode() == window.pHotkeys
          .getCurrentKeyCodeByCurrentKey(window.pHotkeys.comboMB_Switcher)) {
        if (window.pMouseButton.comboMB.getSelectedItem() == window.pMouseButton.switcherItem1) {
          window.pMouseButton.comboMB.setSelectedItem(window.pMouseButton.switcherItem2);
        } else if (window.pMouseButton.comboMB
            .getSelectedItem() == window.pMouseButton.switcherItem2) {
          window.pMouseButton.comboMB.setSelectedItem(window.pMouseButton.switcherItem1);
        }
      }
    }
  }

  @Override
  public void nativeKeyReleased(NativeKeyEvent arg0) {}

  @Override
  public void nativeKeyTyped(NativeKeyEvent arg0) {}
}
