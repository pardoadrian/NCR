package ncr;

import java.util.Arrays;

public class Anagrama {

	public int getCantidadAnagramas(String cadena, String subcadena) {
		
		
		
		
		int M = cadena.length();
		int N = subcadena.length();
		int cantidadAnagramas = 0;
		
		if (N > M) {
			System.out.println("Error: longitud de subcadena no debe ser mayor a longitud de cadena");
			return -1;
		}
		
		
		
		subcadena = ordenar(subcadena.toLowerCase());
		
				
		for (int i = 0; i <= M - N; i++) {
			
			
			
            if (comparar(ordenar(cadena.substring(i, i + N).toLowerCase()), subcadena)){
            	
            	cantidadAnagramas++;
            	
            }
        }
		
        return cantidadAnagramas;
		
		
		
	}

	private String ordenar(String str) {

		char[] array = str.toCharArray();
		Arrays.sort(array);

		return new String(array);

	}

	private boolean comparar(String cadena, String subcadena) {

		if (cadena.equals(subcadena))
			return true;
		else
			return false;

	}

}
