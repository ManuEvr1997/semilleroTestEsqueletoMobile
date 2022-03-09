package PageObject;

import java.io.File;
import java.util.Properties;
import MapObject.MapsObjethHomeClaro;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetHomeClaro extends MapsObjethHomeClaro {

	public PagsObjetHomeClaro(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void seccionActualizarDatos(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta) throws Exception {
		
		tiempoEspera(2000);
		click(iconoPerfil, rutaCarpeta);
		tiempoEspera(2000);
		click(buttonConfCuenta, rutaCarpeta);
		tiempoEspera(2000);
		click(actualizarDatos, rutaCarpeta);
		tiempoEspera(2000);
		click(botonConfCel, rutaCarpeta);
		tiempoEspera(2000);
		
	}

}
