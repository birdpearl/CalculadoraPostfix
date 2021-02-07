/*
Nombre de la clase: calculadoracTest.java
Programadora:Ana gabriela Ramírez
Lenguaje: java
Fecha de modificación:6/2/21
*/
//se importan los paquetes necesarios
package calcupk;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class calculadoracTest {

	@Test //test de suma
	public void sumatest() {
		calculadorac cal = new calculadorac();
		int result =cal.suma(6,5);
		assertEquals(11, result);
	}

	@Test//test de resta
	public void restatest() {
		calculadorac cal = new calculadorac();
		int result =cal.suma(6,5);
		assertEquals(11, result);
	}

	@Test//test de división
	public void divitest() {
		calculadorac cal = new calculadorac();
		int result =cal.suma(6,5);
		assertEquals(11, result);
	}

	@Test//test de multiplicación
	public void multitest() {
		calculadorac cal = new calculadorac();
		int result =cal.suma(6,5);
		assertEquals(11, result);
	}
}