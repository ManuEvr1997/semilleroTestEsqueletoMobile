package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectIngresoClaro extends ClaseBaseClaroApp

{
	public MapsObjectIngresoClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	protected By buttonIngresoUserPass = By.xpath("//android.widget.Button[@text='Ingresa con usuario y contraseña']");
	protected By buttonIngresoEmail = By.xpath("//android.widget.TextView[@text='Correo electrónico']");
	//CAMPOS DE USUARIO Y CONTRASEÑA
	protected By fieldUserEmail = By.xpath("//android.widget.EditText[@text='Usuario o correo electrónico']");
	protected By fieldPassword = By.xpath("//android.widget.EditText[@text='Contraseña']");
	//BOTON INICIAR SESION
	protected By iniciarSesion = By.xpath("//android.widget.Button[@text='Iniciar sesión']");
	protected By botonDisp1 = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	protected By botonAcept1 = By.xpath("//android.widget.Button[@text='Continuar']");
	protected By botonAcept2 = By.xpath("//android.widget.LinearLayout/android.widget.Button");
	
}
