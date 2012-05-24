package tests.MobileHP.Android;

import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.internal.Locatable;

/**
 * Creates a single tap gesture on a touch screen
 */
public class SingleTapAction extends TouchAction implements Action {

  public SingleTapAction(TouchScreen touchScreen, Locatable locationProvider) {
    super(touchScreen, locationProvider);
  }

  public void perform() {
    touchScreen.singleTap(getActionLocation());
  }

}

