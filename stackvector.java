/*
Nombre de la clase: stackvector.java
Programadora:Ana gabriela Ramírez
Lenguaje: java
Fecha de modificación:6/2/21
*/
//se importan los paquetes necesarios
package calcupk;

import java.util.Vector;
//import java.util.ArrayList;

public class stackvector<E> implements Stack<E>
{
	Vector<E> data;

	public stackvector()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}