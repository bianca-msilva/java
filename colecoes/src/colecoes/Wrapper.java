package colecoes;

public class Wrapper {

	public static void main(String[] args) {
		
		int numero; // primitivo
		Integer idade;  //objeto, permitindo manipulação desse dado
	
				
				String alunes[][] = { {"Felipe", "Jonas", "Julia"}, {"Mariana", "Carlos", "Juliana"}, {"Augusto", "Sabrina", "Julius"} };
 
				for (String[] linha : alunes) {  // percorre cada linha da matriz.
					for (String alune : linha) {  // percorre cada elemento (nome) dentro da linha.
						System.out.println(alune);
					}
				}

	}

}
