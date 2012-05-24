package tests.MobileHP.Android;


import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.TouchAction;

/**
 * Creates a move gesture.
 */
public class MoveAction extends TouchAction implements Action {

  private final int x;
  private final int y;

  public MoveAction(TouchScreen touchScreen, int x, int y) {
    super(touchScreen, null);
    this.x = x;
    this.y = y;
  }

  public void perform() {
    touchScreen.move(x, y);
  }

}

