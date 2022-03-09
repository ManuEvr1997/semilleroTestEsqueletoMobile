package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import MapObject.MapsObjetDatosDirClaro;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetDatosDirClaro extends  MapsObjetDatosDirClaro
{
	public PagsObjetDatosDirClaro(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void datosEdit(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta ) throws Exception 
	{		
		//tiempoEspera(3000);
		click(esfero, rutaCarpeta);
		tiempoEspera(4000);
		
	}
	
	

}
