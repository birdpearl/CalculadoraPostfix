

public interface calculadora{
    public int suma(int x, int y);
    public int resta(int x, int y);
    public int multiplicacion(int x, int y);
    public int division(int x, int y);

    public int operar(Stack x);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operaci�n
    
    public String decode(String a);//funci�n que se encarga de leer el archivo y decodificar cada l�nea para realizar las operaciones de cada una
}