package PageObject;

import java.io.File;
import java.util.Properties;

import MapObject.MapsObjectPagoApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetPagoApp extends MapsObjectPagoApp
{
	public PagsObjetPagoApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}


	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void pagarFactura(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta) throws Exception {
		
		
		tiempoEspera(2000);
		//BOTON PAGO	
		click(btnPago, rutaCarpeta);
		tiempoEspera(6000);
		//BOTON FACTURA		
		click(btnFact, rutaCarpeta);
		tiempoEspera(2000);
		//BOTON SELECCIONAR FACTURA		
		click(btnSelecFact, rutaCarpeta);
		tiempoEspera(6000);
		//BOTON SELECCIONAR METODO DE PAGO
//		click(btnMPago, rutaCarpeta);
//		tiempoEspera(4000);
		tocarPantalla(370,460);
		//BOTON SELECCIOANR TARJETA
//		click(btntarjeta, rutaCarpeta);
		tiempoEspera(2000);
		tocarPantalla(260,800);
		tiempoEspera(2000);
		//BOTON CONTINUAR
//		click(btnCont, rutaCarpeta);
		tocarPantalla(350,730);
		tiempoEspera(8000);
//		scrollVertical(rutaCarpeta, 330, 930, 430, 4);
		tiempoEspera(2000);
		//CAMPO NUMERO TARJETA
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"Pago",1,10),txtNombreTC,rutaCarpeta);
		tiempoEspera(2000);
		//DESPLEGABLE TIPO DE ID
		click(selTipoID ,rutaCarpeta);
		tiempoEspera(2000);
		//CAMPO CC
		click(selTipoCC ,rutaCarpeta);
		//CAMPO ID
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"Pago",1,11),txtNumID,rutaCarpeta);
		//CAMPO TELEFONO
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"Pago",1,12),txtNumTel,rutaCarpeta);
		//CAMPO EMAIL
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"Pago",1,13),txtEmail,rutaCarpeta);
		scrollVertical(rutaCarpeta, 572, 1800, 1400, 2);
		//BOTON CANCELAR PAGO
		click(btnCancePago ,rutaCarpeta);
		//BOTON RETROCEDER
		click(btnAtrás ,rutaCarpeta);
		//BOTON INICIO
		click(btnInicio ,rutaCarpeta);
		tiempoEspera(3000);
		//BOTON PERFIL
		click(btnImgUsuario ,rutaCarpeta);
		//BOTON CERRAR SESION
		click(btnCerrarSesion ,rutaCarpeta);
		tiempoEspera(1000);
		//BOTON MODAL DE ACEPTAR CERRAAR SESION
		click(aceptCerrarSesion ,rutaCarpeta);
	}


}