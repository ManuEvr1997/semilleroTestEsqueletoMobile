package PageObject;

import java.io.File;
import java.util.Properties;

import MapObject.MapsObjectCloseSesionClaroApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjectCloseSesionClaroApp extends MapsObjectCloseSesionClaroApp
{
		public PagsObjectCloseSesionClaroApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	
	public void urlAcceso(String url) 
	{
		driver.get(url);
	}
	
	
	public void closeSesionApp(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception
		{
		
		click(btnInicio ,rutaCarpeta);
		tiempoEspera(3000);
		click(iconoPerfil, rutaCarpeta);
		click(cerrarSesion, rutaCarpeta);
		tiempoEspera(1000);
		click(aceptCerrarSesion, rutaCarpeta);
		tiempoEspera(1000);

	} 
	

}
