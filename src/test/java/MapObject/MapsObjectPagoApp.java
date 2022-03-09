package MapObject;

import org.openqa.selenium.By;

import DemoNav.ClaseBaseClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class  MapsObjectPagoApp extends ClaseBaseClaroApp

{
	public MapsObjectPagoApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	protected By btnPago = By.xpath("//android.widget.FrameLayout[@content-desc=\"Pagos\"]/android.widget.ImageView");
	protected By btnFact = By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
	protected By btnSelecFact = By.xpath("//android.view.ViewGroup/android.widget.Button[2]");
//	protected By btnbarra = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]");
	protected By btnMPago = By.xpath("//android.view.View[@resource-id = 'select']");
	protected By btntarjeta = By.xpath("//android.view.View[@content-desc=\"Tarjeta de Crédito - Débito Tarjeta de Crédito - Débito\"]");
	protected By btnCont = By.xpath("//android.widget.Button[@text='Continuar']");

protected By intNumTC = By.xpath("//android.widget.EditText[@resource-id = 'NUMERO_TARJETA']");

	// INGRESAR MES
	protected By selMonth = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_MES']");
	// INGRESAR AÑO
	protected By selYear = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_ANNO']");
	// INGRESAR CVV
	protected By codCVV = By.xpath("//android.widget.EditText [@resource-id = 'CODIGO_SEGURIDAD']");
	// INGRESAR NUMERO DE CUOTAS
	protected By selCuotas = By.xpath("//android.view.View [@resource-id = 'CUOTAS']");
	protected By btncoutas = By.xpath("//android.widget.CheckedTextView[@text='6']");
	// INGRESAR NOMBRE DE LA TARJETA DE CRÉDITO
	protected By txtNombreTC = By.xpath("//android.widget.EditText[@resource-id = 'NOMBRE_TARJETA']");
	// INGRESAR SELECCIÓN TIPO DE INDENTIFICACIÓN
	protected By selTipoID = By.xpath("//android.view.View[@resource-id = 'TIPO_DOCUMENTO']");
	protected By selTipoCC = By.xpath("//android.widget.CheckedTextView[@text='C.C. (Cédula de Ciudadanía)']");
	// INGRESAR NUMERO DE IDENTIFICACIÓN
	protected By txtNumID = By.xpath("//android.widget.EditText[@resource-id='NUMERO_DOCUMENTO']");
	// INGRESAR TELEFONO
	protected By txtNumTel = By.xpath("//android.widget.EditText[@resource-id='TELEFONO']");
	// INGRESAR CORREO ELECTRONICO
	protected By txtEmail = By.xpath("//android.widget.EditText[@resource-id='EMAIL']");
	// BOTON ACEPTAR
	protected By btnCnfPago = By.xpath("//android.widget.Button [@resource-id = 'mySubmit_']");
	// BOTON CANCELAR
	protected By btnCancePago = By.xpath("//android.widget.Button[@text='Cancelar']");
	// BOTON DEVOLVERSE
	protected By btnAtrás = By.xpath("//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']");
	protected By btnImgUsuario = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btnInicio = By.xpath("//android.widget.Button[@text='Inicio']");
	protected By btnCerrarSesion = By.xpath("//android.widget.TextView[@text='Cerrar Sesión']");
	protected By aceptCerrarSesion = By.xpath("//android.widget.Button[@text='Cerrar sesión']");  

}