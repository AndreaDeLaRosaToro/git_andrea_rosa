package ejemplos_excep_Andrea;

public class SerieAritmetica {
	
	private int a1; // primer t�rmino
	private int d; // incremento o diferencia de un t�rmino a otro
	
	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	SerieAritmetica(int a1, int d){
		this.a1 = a1;
		this.d = d;
	}
	
	// m�todo para mostrar los n primeros t�rminos de la serie
	public void muestra(int n) {
		// se muestran los n primeros t�rminos de la serie
		int i;
		int an;
		
		an = a1;
		for(i = 1; i <= n; i++) {
			System.out.println("a" + i + ": " + an);
			an = an + d / 0;
		}
	}
	
	// m�todo para sumar los n primeros t�rminos de la serie
	public int suma(int n) {
		int i, an, suma=0;
		for(i=0; i < n; i++) {
			an = a1 + (i * d);
			suma = suma + an;
		}
		return suma;
	}

}
