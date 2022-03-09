package MapObject;

import org.openqa.selenium.By;


import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetFormClaro extends ClaseBaseClaroApp 
{
	public MapsObjetFormClaro (AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	//BOTONES DESPLEGABLES
	protected By desplSelecDepart= By.xpath("//android.widget.LinearLayout/android.widget.Spinner[1]");;
	protected By desplSelecCiudad= By.xpath("//android.widget.CheckedTextView[6]");
	// CAMPO BARRIO
	protected By campoBarrio= By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edtBarrio']");
	// DESPLEGABLE 2 TIPO CALLE
	//CIUDAD TIPO
	protected By cuidadTipo = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[2]");
	//CIUDAD TIPO 2	
	protected By bogotaTipo2 = By.xpath("//android.widget.CheckedTextView[@text='BOGOTÁ, D.C.']");
	protected By tipo = By.xpath("//android.widget.Spinner[3]/android.widget.CheckedTextView");
	protected By tipo2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[5]");
	protected By principal = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.EditText");
	protected By sufijo = By.xpath("//android.widget.CheckedTextView[@text='Selecciona']");
	protected By sufijo2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[2]");
	protected By secundario = By.xpath("//android.view.ViewGroup[2]/android.widget.EditText[1]");
	protected By sufijo3 = By.xpath("//android.view.ViewGroup[2]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By sufijo4 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[7]");
	protected By compu = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.EditText[2]");
	protected By complemento = By.xpath("//android.view.ViewGroup[3]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By complementoSelec = By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"); 
	protected By complemento2 = By.xpath("//android.view.ViewGroup[4]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By complementoSelec2 = By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	protected By numero = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.EditText");
	protected By numero2 = By.xpath("//android.widget.LinearLayout[1]/android.view.ViewGroup[4]/android.widget.EditText");
	protected By validar = By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");
	protected By guardar = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
	protected By cerrar = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button");
}
 