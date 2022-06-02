package ejemplos_excep_Andrea;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MayorNumeroTestExcepcion {
    @Test
    public void TestExcepcionMayorNumero() {
    	
    // Creamos un array con distintos números, el programa lo recorre para luego seleccionar el mayor.
    MayorNumero num = new MayorNumero();
    int cadenaNumeros[] = new int[]{35, 26, 21, 5};

    
    Exception excep = assertThrows(ArrayIndexOutOfBoundsException.class,()->{ 
    	
    	// Aquí se comprueba con la clase "obt_mayotNUmero" cual es el mayor.
    	
        int numeroMayor = num.obt_mayorNumero(cadenaNumeros); 
        System.out.println(numeroMayor);
    });
    	// Se introduce un texto llamado "out of bounds" para comprobar que el proceso realizado sea el correcto
        String texto = "out of bounds";
        //Aquí se muestra el mensaje de la excepcion
        String texto2 = excep.getMessage();
        
        //Por último se comprueba si el texto2 contiene lo del texto, para que nos de error habría que cambiar
        //el contenido del texto.

        assertTrue(texto2.contains(texto)); 
    }

}
	
