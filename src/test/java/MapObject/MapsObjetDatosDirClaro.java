package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetDatosDirClaro extends ClaseBaseClaroApp {
	// CONSTRUCTOR DE LA CLASE
	public MapsObjetDatosDirClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}
	
	//protected By editDatosDir= By.id("com.clarocolombia.miclaro.debug:id/imgEditarDir");
	protected By esfero = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgEditarDir']");
}
