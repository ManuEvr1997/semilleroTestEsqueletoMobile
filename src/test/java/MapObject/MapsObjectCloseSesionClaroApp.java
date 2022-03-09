package MapObject;

import org.openqa.selenium.By;

import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class  MapsObjectCloseSesionClaroApp extends ClaseBaseClaroApp

{
	public MapsObjectCloseSesionClaroApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	

	protected By senalBack1 = By.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
	protected By iconoPerfil = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By cerrarSesion = By.xpath("//android.widget.TextView[@text='Cerrar Sesión']");
	protected By aceptCerrarSesion = By.xpath("//android.widget.Button[@text='Cerrar sesión']");
	protected By btnInicio = By.xpath("//android.widget.Button[@text='Inicio']");
}	