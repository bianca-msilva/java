package operadores;

public class Unario {

	public static void main(String[] args) {
		
		int preIncremento = 8, preIncrementoResultado;
		int posIncremento = 8, posIncrementoResultado;
		
		System.out.printf("Valor original do Pré Incremento: %d%n", preIncremento);
		preIncrementoResultado = ++preIncremento;
		System.out.printf("Após o pré incrementar a variável original: resultado = %d, Valor Original alterado = %d", preIncrementoResultado, preIncremento);
		
		System.out.println();
		
		System.out.printf("Valor original do Pós Incremento: %d%n", posIncremento);
		posIncrementoResultado = posIncremento++;
		System.out.printf("Após o pós incrementar a variável original: resultado = %d, Valor Original alterado = %d", posIncrementoResultado, posIncremento);
		
	}

}
