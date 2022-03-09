package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjethHomeClaro extends ClaseBaseClaroApp {

	public MapsObjethHomeClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	protected By iconoPerfil = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By buttonConfCuenta = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvConfiguracion']");
	protected By actualizarDatos = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By botonConfCel = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
	protected By esfero = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgEditarDir']");
}
