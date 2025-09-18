package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacaxi");
		frutas.add("Manga");
		frutas.add("Cereja");
		frutas.add("Banana");
		frutas.add("abacaxi");
		frutas.add("Abacate");
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
		}

		frutas.remove("Abacaxi"); // A escrita deve estar exatamente igual!
		System.out.println(frutas);
		
		System.out.println("A fruta Amora está presente? " + frutas.contains("Amora"));
		System.out.println("O set está vazio? " + frutas.isEmpty());
		
		frutas.add("Kiwi");
		
		// Para iterar sobre os elementos
		Iterator<String> itFrutas = frutas.iterator();
		
		while(itFrutas.hasNext()) { // Se existir próximo elemento, para exibi-lo
			System.out.println(itFrutas.next());
		}
		
		
		// Cria o ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();  // Instanciar novo objeto
		
		// Adiciona todos os elementos da Coleção Set noo Array
		frutasList.addAll(frutas);
		
		// Ordenação dos dados, null por ser crescente a ordem padrão
		frutasList.sort(null); // null pois não queremos em ordem decrescente
		
		// Ordenação decrescente
		frutasList.sort(Comparator.reverseOrder());  // Classe Comparator deve ser importada
		
		// Lista os dados
		System.out.println(frutasList);
	}

}
