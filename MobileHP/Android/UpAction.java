package tests.MobileHP.Android;


import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.TouchAction;

/**
 * Creates an up gesture.
 */
public class UpAction extends TouchAction implements Action {

  private final int x;
  private final int y;

  public UpAction(TouchScreen touchScreen, int x, int y) {
    super(touchScreen, null);
    this.x = x;
    this.y = y;
  }

  public void perform() {
    touchScreen.up(x, y);
  }

}

