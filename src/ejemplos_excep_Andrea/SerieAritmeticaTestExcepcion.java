package ejemplos_excep_Andrea;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SerieAritmeticaTestExcepcion {

	@Test
	public void TestExcepcionArithmeticException() {
		SerieAritmetica s = new SerieAritmetica(4,2);
		//Realizamos la comprobaci�n de una divisi�n (SerieAritmetica), en este caso, no se puede dividir entre 0 ya que dar�
		// un fallo aritmetico.
		Exception ex = assertThrows(ArithmeticException.class, () -> { //En esta variable se registra y se 
																	// guarda el error.
			s.muestra(2);
		
		});
		
		
		assertTrue(ex.getMessage().contains("by zero"));
		//Si la excepci�n de antes contiene "by zero", ser� que la prueba ha salido correcta, por lo que
		//se da un error de divisi�n.
		
	}

}
