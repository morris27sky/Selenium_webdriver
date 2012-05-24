package tests.MobileHP.Android;

	import org.openqa.selenium.TouchScreen;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.internal.TouchAction;
	import org.openqa.selenium.internal.Locatable;

	/**
	 * Creates a double tap gesture on a touch screen.
	 */
	public class DoubleTapAction extends TouchAction implements Action {

	  public DoubleTapAction(TouchScreen touchScreen, Locatable locationProvider) {
	    super(touchScreen, locationProvider);
	  }

	  public void perform() {
	    touchScreen.doubleTap(getActionLocation());
	  }

	}
