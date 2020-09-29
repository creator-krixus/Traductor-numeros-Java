import java.util.Scanner;


public class Datos {
	
//Clase donde se declaran las variables y metodo constructor.
	
	protected Scanner ingresar;
	protected String temperatura;
	
//Variables numeros en español.
	
	protected String nombreUno="uno", nombreDos="dos", nombreTres="tres", nombreCuatro="cuatro", nombreCinco="cinco",
				nombreSeis="seis", nombreSiete="siete", nombreOcho="ocho", nombreNueve="nueve", nombreCero="cero";

//Varibles numeros en enteros.
	
	protected String Uno="1", Dos="2", Tres="3", Cuatro="4", Cinco="5", Seis="6", Siete="7", Ocho="8", Nueve="9", Cero="0";
	
//Variables numeros en ingles.
	
	protected String zero="zero", one="one", two="two", three="three", four="four", five="five", six="six", seven="seven",
					eight="eight", nine="nine";
//Metodo constructor.
	
	public Datos() {
		ingresar = new Scanner(System.in);
	}	
}
