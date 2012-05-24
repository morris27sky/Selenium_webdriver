package tests.MobileHP.Android;

import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.internal.Locatable;

/**
 * Creates a long press gesture.
 */
public class LongPressAction extends TouchAction implements Action {

  public LongPressAction(TouchScreen touchScreen, Locatable locationProvider) {
    super(touchScreen, locationProvider);
  }

  public void perform() {
    touchScreen.longPress(getActionLocation());
  }

}

