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
		
		System.out.println("\n Bienbenido al programa de calculadora POSTFIX");
		
		System.out.println("\n"+cal.decode("datos.txt"));
		

	}
}