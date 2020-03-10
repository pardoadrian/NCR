package ncr;

public class ClavandoTablonesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1,4,5,8};
		int B[] = {4,5,9,10};
		int C[] = {4,6,7,10,2};
		short N = 5;
		short M = 4;
		
		ClavandoTablones prueba = new ClavandoTablones();
		int result = prueba.solution(A, B, N, C, M);
		System.out.println(result);
		
		int O[] = {1,4};
		int P[] = {4,5};
		int clavo[] = {2,3};
		N = 2;
		M = 2;
		
		ClavandoTablones prueba2 = new ClavandoTablones();
		int result2 = prueba2.solution(O, P, N, clavo, M);
		System.out.println(result2);

		
		int H[] = {1,4,5,8};
		int K[] = {4,6,8,10};
		int L[] = {2,3,5,7};
		N = 4;
		M = 4;
		
		ClavandoTablones prueba3 = new ClavandoTablones();
		int result3 = prueba3.solution(H, K, N, L, M);
		System.out.println(result3);
		
	}

}
