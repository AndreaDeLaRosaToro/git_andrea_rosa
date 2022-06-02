package ejemplos_excep_Andrea;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SerieAritmeticaTestExcepcion {

	@Test
	public void TestExcepcionArithmeticException() {
		SerieAritmetica s = new SerieAritmetica(4,2);
		//Realizamos la comprobación de una división (SerieAritmetica), en este caso, no se puede dividir entre 0 ya que dará
		// un fallo aritmetico.
		Exception ex = assertThrows(ArithmeticException.class, () -> { //En esta variable se registra y se 
																	// guarda el error.
			s.muestra(2);
		
		});
		
		
		assertTrue(ex.getMessage().contains("by zero"));
		//Si la excepción de antes contiene "by zero", será que la prueba ha salido correcta, por lo que
		//se da un error de división.
		
	}

}
