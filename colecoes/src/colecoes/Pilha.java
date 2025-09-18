package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("1984");
		pilha.push("O assasino do zodíaco");
		pilha.push("Echo Park");
		pilha.push("Laranja mecânica");
		pilha.push("Crime e Castigo");
		
		System.out.println(pilha);
		
		pilha.pop(); // Retira o último colocado
		System.out.println(pilha);
		//pilha.poll(); // Retira e mostra o elemento retirado
		System.out.println(pilha.poll());
		System.out.println(pilha);
		
		System.out.println(" O livro A menina que roubava livros está na pilha? " + pilha.contains("A menina que roubava livros"));
		

	}

}
