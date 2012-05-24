package tests.MobileHP.Android;


import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.internal.Locatable;

/**
 * Creates a flick gesture.
 */
public class FlickAction extends TouchAction implements Action {

  private final int xSpeed;
  private final int ySpeed;

  public FlickAction(TouchScreen touchScreen, int xSpeed, int ySpeed) {
    super(touchScreen, null);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public void perform() {
    touchScreen.flick(xSpeed, ySpeed);
  }

}
