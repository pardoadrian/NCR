package ncr;

import ncr.Anagrama;

public class AnagramaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra = "hola, que buena ola Laomir";
		String buscada = "hola";
	
		Anagrama test = new Anagrama();
		
		int result = test.getCantidadAnagramas(palabra, buscada);
		System.out.println(result);
		
		
	}

}
