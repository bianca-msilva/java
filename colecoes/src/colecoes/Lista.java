package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		//ArrayList<T> notas = new ArrayList<T>(); // o "T" é de tipagem, o tipo do dado
		
		ArrayList<Integer> num = new ArrayList<Integer>(); //aceita valores repetidos
		
		num.add(5);
		num.add(5);
		num.add(1, 7);  // vai adicionar o valor no índice indicado (índice, valor)
		
		System.out.println(num);
		System.out.println("Exibir o elemento na posição 2: " + num.get(2));
		// Retornar qual o índice de um elemento/valor específico
		System.out.println("Exibir o elemento 10: " + num.indexOf(10));
		
		// Alterar um valor (índice, novo valor)
		num.set(num.indexOf(10), 4);
		// num.remove(índice);
		num.remove(num.indexOf(5)); // quando há dois valores iguais, ele irá remover primeiro encontrado
		
		// For Each, pega cada elemento da sua coleção e faz algo com ele
		// Trabalha diretamente com o valor, não com o índice (usar método .indexOf();
		for(int n : num) {  // "n" é o valor atual que você está lendo
			System.out.println(num);
		}
		
		System.out.println(num.size());
	}

}
