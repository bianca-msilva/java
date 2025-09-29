package optional;

import java.util.Optional;

public class Exemplo01 {
	public static void main(String[] args) {
        
		String[] palavras = new String[10];
		
		// Não tem certeza se é nulo
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);  // Guardou/encapsulou o valor no optional
		
		if(checaNulo.isPresent()) {
		String palavra = palavras[5].toLowerCase();
		System.out.println(palavra);
		}else {
			System.out.println("O valor é nulo!");
		}
	}
	
}
