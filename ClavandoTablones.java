package ncr;

public class ClavandoTablones {

	
	public int solution(int A[] , int B[], short N, int C[], short M) {
		
		
		short k = 0;//indice de vector que contiene posiciones de inicio de tabla en 
				//vector A y posicion de final de tabla en vector B
		
		short i= 0;//indice de vector que contiene clavos. Uso este indice para contar la cantidad de clavos necesarios
		
			
		//mientras haya tablas restantes y queden clavos por probar
		while(hayTablasRestantes(k,M) && i < N) {
				
				
				if(estaDentroDeIntervalo(A[k],B[k],C[i])) {
					
					++k;//siguiente tabla
					
				}else {
					++i;//muevo clavo 
					
				}
				
			}
		
		//si hay tablas restantes y no quedan clavos por probar, devuelvo -1. Caso contrario, no hay tablas restantes y 
		//devuelvo contador
		if (i == N) return -1;
		else return ++i;
			
		
		
	}
	
		
		
	
	private boolean estaDentroDeIntervalo(int inicioTablon, int finalTablon, int posicionClavo) {
		
		if(posicionClavo <= finalTablon && posicionClavo >= inicioTablon ) return true;
		else return false;
		
	}
	
	private boolean hayTablasRestantes(int k,  int M) {
		
		if( k<M ) {
			return true;
		}else {
			return false;
		}
		
	}
	 
	
}
