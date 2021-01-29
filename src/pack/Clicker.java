package pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class clicks in a sertant way with the given user input.
 */
public class Clicker extends Robot {

  private Window window;

  public Clicker(Window window) throws AWTException {
    this.window = window;
    runAutoClicker();
  }

  /**
   * This method runs the AutoClicker.
   */
  private void runAutoClicker() {
    Timer t = new Timer();
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (window.pRUN.currentlyRunning == true) {
          for (int i = 1; i <= (int) window.pCPS.comboCPS.getSelectedItem(); i++) {
            if (window.pMouseButton.comboMB
                .getSelectedItem() == window.pMouseButton.switcherItem1) {
              mousePress(InputEvent.BUTTON1_DOWN_MASK);
              delay(1000 / (int) window.pCPS.comboCPS.getSelectedItem() / 2);
              mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
              delay(1000 / (int) window.pCPS.comboCPS.getSelectedItem() / 2);
            } else if (window.pMouseButton.comboMB
                .getSelectedItem() == window.pMouseButton.switcherItem2) {
              mousePress(InputEvent.BUTTON3_DOWN_MASK);
              delay(1000 / (int) window.pCPS.comboCPS.getSelectedItem() / 2);
              mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
              delay(1000 / (int) window.pCPS.comboCPS.getSelectedItem() / 2);
            }
          }
        }
      }
    }, 0, 1);
  }
}
