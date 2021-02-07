
import java.util.ArrayList;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class calculadorac implements calculadora {
	 
	public calculadorac(){

	}

	public int suma(int x, int y) {
		int p=x+y;
		return p;
	}


	public int resta(int x, int y) {
		int p=x-y;
		return p;
	}


	public int multiplicacion(int x, int y) {
		int p=x*y;
		return p;
	}


	public int division(int x, int y) {
		if(y==0) {
			return 0;
		}else {
			int p=x/y;
			return p;
		}
	}

	stackvector<String> stacky =new stackvector<String>();

	public int operar(Stack x) {
		
		stackvector<Integer> s1=new stackvector<Integer>();

		while(stacky.empty()==false) {
			if(stacky.peek()=="*"||stacky.peek()=="/"||stacky.peek()=="+"||stacky.peek()=="-") {
				if(stacky.peek().equals("*")) {
					stacky.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					stacky.push(String.valueOf(multiplicacion(primero,segundo)));
				}else if(stacky.peek().equals("/")) {
					stacky.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					stacky.push(String.valueOf(division(primero,segundo)));
				}else if(stacky.peek().equals("+")) {
					stacky.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					stacky.push(String.valueOf(suma(primero,segundo)));
				}else {
					stacky.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					stacky.push(String.valueOf(resta(primero,segundo)));
				}
			}else{
				
				String temp1 = stacky.peek();
				s1.push((Integer.parseInt(temp1)));
				stacky.pop();
			}
		}
		return s1.peek();    
	}


	public String decode(String a) {

		File archivo = new File(a);
		Scanner scan = null;

		String acurespuesta ="";

		try {
			scan = new Scanner(archivo);
		} catch (FileNotFoundException e) {
			return "\n Archivo no encontrado";
		}
		
		while(scan.hasNextLine()){
			stacky.push(scan.nextLine());
			acurespuesta = acurespuesta+"\nResultado: "+String.valueOf(operar(stacky));

		}
		
		
			
		return acurespuesta;

		
		
		/*for (texto: texto.split("")) {
			if(c==' ') {
				
			}else if(c=='.') {
				total=total+"\nLa respuesta de la linea "+String.valueOf(cont)+" es "+String.valueOf(operar(acu));
				while(acu.empty()==false) {
					acu.pop();
				}
			}else {
				acu.push(c);
			}
		}*/
		
	}

	
}
