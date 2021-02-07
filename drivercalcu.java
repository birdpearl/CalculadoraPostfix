/*
Nombre de la clase: drivercalcu.java
Programadora:Ana gabriela Ramírez
Lenguaje: java
Fecha de modificación:6/2/21
*/
//se importan los paquetes necesarios

package calcupk;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;

public class drivercalcu {
	public static void main(String[] args) {
		
		calculadorac cal=new calculadorac();
		/*try {
			Scanner scan=new Scanner(f);
		}catch(FileNotFoundException e) {
			System.out.println("\n Archivo no encontrado");
		}
		
		while(scan.hasNextLine()){
            ar=ar+scan.nextLine()+".";
		}*/

		//bienvenida al ususario
		
		System.out.println("\n Bienbenido al programa de calculadora POSTFIX");

		//print de todo lo que devuelve al operar el stack
		
		System.out.println("\n"+cal.decode("datos.txt"));
		

	}
}
