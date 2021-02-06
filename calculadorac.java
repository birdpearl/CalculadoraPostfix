/*
Nombre de la clase:
Programadora:
Lenguaje:
Fecha de modificación:
*/
package calcupk;
import java.util.ArrayList;
import java.io.*;

public class calculadorac implements calculadora {
	 
	public calculadorac(){

	}
	
	
	@Override
	public int suma(int x, int y) {
		int p=x+y;
		return p;
	}

	@Override
	public int resta(int x, int y) {
		int p=x-y;
		return p;
	}

	@Override
	public int multiplicacion(int x, int y) {
		int p=x*y;
		return p;
	}

	@Override
	public int division(int x, int y) {
		if(y==0) {
			return 0;
		}else {
			int p=x/y;
			return p;
		}
	}

	@Override
	public int operar(stackvector x) {
		stackvector<Integer> s1=new stackvector<Integer>();
		while(x.empty()==false) {
			if(x.peek()=="*"||x.peek()=="/"||x.peek()=="+"||x.peek()=="-") {
				if(x.peek().equals("*")) {
					x.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					x.push(String.valueOf(multiplicacion(primero,segundo)));
				}else if(x.peek().equals("/")) {
					x.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					x.push(String.valueOf(division(primero,segundo)));
				}else if(x.peek().equals("+")) {
					x.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					x.push(String.valueOf(suma(primero,segundo)));
				}else {
					x.pop();
					int primero= s1.peek();
					s1.pop();
					int segundo= s1.peek();
					s1.pop();
					x.push(String.valueOf(resta(primero,segundo)));
				}
			}else{
				s1.push(x.peek());
				x.pop();
			}
		}
		return s1.peek();    
	}

	@Override
	public String decode(String a) {
		try{
			File archivo = new File(a);
			BufferedReader t =  new BufferedReader(new FileReader(archivo));
			String acurespuesta ="";
			String postfix="";
			stackvector<String> stacky =new stackvector<String>();
			while((postfix= t.readLine()) != null){
				for(int i=0; i<postfix.length();i++){
					String ch = getCharFromString(postfix, postfix.length()-i); 
					stacky.push(ch);
				}
				acurespuesta =acurespuesta+String.valuesOf(operar(stacky));
			}
			return acurespuesta;

		}catch(FileNotFoundException e){
			return "\n Archivo no encontrado";
		}
		
		
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
