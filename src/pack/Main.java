package pack;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 * This class starts the program.
 */
public class Main {

  public static void main(String[] args) {
    PCPS pCPS = new PCPS();
    PHotkeys pHotkeys = new PHotkeys();
    PMouseButton pMouseButton = new PMouseButton();
    PRUN pRUN = new PRUN();
    Window window = new Window(pCPS, pHotkeys, pMouseButton, pRUN);
    try {
      GlobalScreen.registerNativeHook();
      GlobalScreen.addNativeKeyListener(new KeyHandler(window));
    } catch (NativeHookException e2) {
      e2.printStackTrace();
      System.out.println("The global screen KeyListener couldn't get created!");
    }
    // Get the logger for "jnativehook" and set the level to warning.
    Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    logger.setLevel(Level.WARNING);

    // Disables the parent handlers.
    logger.setUseParentHandlers(false);
    try {
      new Clicker(window);
    } catch (AWTException e1) {
      e1.printStackTrace();
      System.out.println("The Clicker couldn't get created!");
    }
  }
}
