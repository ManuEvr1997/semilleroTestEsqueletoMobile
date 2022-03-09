package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;

import MapObject.MapsObjectIngresoClaro;
import MapObject.MapsObjetFormClaro;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetFormClaro extends MapsObjetFormClaro

{

	public PagsObjetFormClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void fillForm(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta ) throws Exception {
		
		tiempoEspera(2000);
		click(desplSelecDepart, rutaCarpeta);
		tiempoEspera(2000);
		click(desplSelecCiudad, rutaCarpeta);
		tiempoEspera(5000);
		click(cuidadTipo, rutaCarpeta);
		tiempoEspera(3000);
		click(bogotaTipo2, rutaCarpeta);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,4),campoBarrio,rutaCarpeta);
		tiempoEspera(2000);
		click(tipo, rutaCarpeta);
		tiempoEspera(2000);
		click(tipo2, rutaCarpeta);
		tiempoEspera(2000);
		scrollVertical(rutaCarpeta, 330, 930, 430, 2);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,5),principal,rutaCarpeta);
		tiempoEspera(2000);
		click(sufijo, rutaCarpeta);
		tiempoEspera(2000);
		click(sufijo2, rutaCarpeta);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,6),secundario,rutaCarpeta);
		tiempoEspera(2000);
		click(sufijo3, rutaCarpeta);
		tiempoEspera(2000);
		click(sufijo4, rutaCarpeta);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,7),compu,rutaCarpeta);
		tiempoEspera(2000);
		click(complemento,rutaCarpeta);
		click(complementoSelec,rutaCarpeta);
		tiempoEspera(2000);
		click(complemento2, rutaCarpeta);
		click(complementoSelec2, rutaCarpeta);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,8),numero,rutaCarpeta);
		tiempoEspera(2000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9),numero2,rutaCarpeta);
		tiempoEspera(2000);
		scrollVertical(rutaCarpeta, 330, 930, 430, 1);
		click(validar, rutaCarpeta);
		tiempoEspera(5000);
		click(guardar, rutaCarpeta);
		tiempoEspera(20000);
		click(cerrar,rutaCarpeta);
	}

}
