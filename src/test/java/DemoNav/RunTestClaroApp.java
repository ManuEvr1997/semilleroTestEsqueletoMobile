package DemoNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import PageObject.PagsObjectCloseSesionClaroApp;
import PageObject.PagsObjectIngresoClaro;
import PageObject.PagsObjetDatosDirClaro;
import PageObject.PagsObjetFormClaro;
import PageObject.PagsObjetHomeClaro;
import PageObject.PagsObjetPagoApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class RunTestClaroApp {

	private AppiumDriver<MobileElement> driver;
	Properties propiedades;
	ReadExcelFile leer;
	WriteExcelFile escribir;
	ClaseBaseClaroApp claseBase;
	PagsObjectIngresoClaro ingresoClaro;
	PagsObjetHomeClaro homeActualizarDatos;
	PagsObjetDatosDirClaro datosDir;
	PagsObjetFormClaro formulario;
	PagsObjectCloseSesionClaroApp closeSesion;
	PagsObjetPagoApp pagos;
	
	
	

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws InterruptedException, IOException {

		driver = ClaseBaseClaroApp.AppiumDriverConnection();

		// INSTANCIA DE CLASES
		ingresoClaro = new PagsObjectIngresoClaro(driver);
		homeActualizarDatos = new PagsObjetHomeClaro(driver);
		datosDir = new PagsObjetDatosDirClaro(driver);
		formulario = new PagsObjetFormClaro(driver);
		closeSesion = new PagsObjectCloseSesionClaroApp(driver);
		pagos = new PagsObjetPagoApp(driver);
		
	
		// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
		propiedades = new Properties();
		
		// INSTANCIAR CLASES DE EXCEL
		leer = new ReadExcelFile();
		escribir = new WriteExcelFile();

		// CREAR LA VARIABLE TIPO INPUTSTRING
		InputStream entrada = null;

		// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
		try {
			entrada = new FileInputStream("./Properties/datos.properties");
			propiedades.load(entrada);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			// TODO: handle exception
		}

	}


	
	@Test
	public void TestClaroApp() throws Exception {	
		if (leer.getCellValue(propiedades.getProperty("PathExcel"), "ejecucion", 0, 0).equals("x")) {
			
			//INSTANCIA CLASE BASE
			claseBase = new ClaseBaseClaroApp(driver);
			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			// CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
			File rutaCarpeta = claseBase.crearCarpeta(propiedades, nomTest);  
			// METDOD REGISTRO
			ingresoClaro.ingresoApp(leer, propiedades, "datos", rutaCarpeta);
			// METODO PASOS A ACTUALIZAR DATOS
			homeActualizarDatos.seccionActualizarDatos(leer, propiedades, nomTest, rutaCarpeta);
			// METODO DE ACTUALIZAR DATOS
			datosDir.datosEdit(leer, propiedades, "datos", rutaCarpeta);
			// METODO FROMULARIO
			formulario.fillForm(leer, propiedades, "datos", rutaCarpeta);
			// CERRAR SESION
			closeSesion.closeSesionApp(leer, propiedades, nomTest, rutaCarpeta);
			//METODO PAGO
			
		}else{
			
			claseBase = new ClaseBaseClaroApp(driver);
			
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
			File rutaCarpeta = claseBase.crearCarpeta(propiedades, nomTest);  
			
			ingresoClaro.ingresoApp(leer, propiedades, "datos", rutaCarpeta);
			
			pagos.pagarFactura(leer, propiedades, "datos", rutaCarpeta);
		}
		
	}

	@After
	public void cerrar() {
		driver.quit();
	}

}

	

