package PageObject;

import java.io.File;
import java.util.Properties;
import MapObject.MapsObjectIngresoClaro;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjectIngresoClaro extends MapsObjectIngresoClaro
{
		public PagsObjectIngresoClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	
	public void urlAcceso(String url) 
	{
		driver.get(url);
	}
	
	
	public void ingresoApp(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception
		{
		
		tiempoEspera(6000);
		click(buttonIngresoUserPass, rutaCarpeta);
		tiempoEspera(2000);
		click(buttonIngresoEmail, rutaCarpeta);
		tiempoEspera(2000);
		click(fieldUserEmail, rutaCarpeta);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 1),fieldUserEmail,rutaCarpeta);
		tiempoEspera(2000);
		tocarPantalla(590,230);
		click(fieldPassword, rutaCarpeta);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 2),fieldPassword,rutaCarpeta);
		tiempoEspera(2000);
		tocarPantalla(590,230);
		scrollVertical1(rutaCarpeta, 500,600,200,1);
		click(iniciarSesion, rutaCarpeta);
		tiempoEspera(2000);
		//MODAL DISPOSITIVOS
	/*	click(botonDisp1, rutaCarpeta);
		tiempoEspera(2000);
		click(botonAcept1, rutaCarpeta);
		tiempoEspera(2000);
		click(botonAcept2, rutaCarpeta);
		tiempoEspera(2000); */
		//MODAL DISPOSITIVOS
		
		
	} 
	

}
