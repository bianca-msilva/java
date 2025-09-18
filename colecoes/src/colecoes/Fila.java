package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// Não é possível fazer:
		// var teste; //Precisa ter uma referência/parâmetro para saber o tipo com que vai operar
		var teste = "Amanhã";
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Bianca");
		fila.add("Ivani");
		fila.add("Elisa");
		fila.add("Jihyo");
		
		System.out.println(fila);
		
		// Retirar um elemento da Fila
		fila.remove(); //removerá o primeiro que estiver por padrão
		fila.remove("Jihyo"); // Remove um específico de acordo com o que você passar
		
		System.out.println(fila);
		
		fila.add("Sana");
		fila.add("Mina"); // Serão acrescentadas ao final da fila INÍCIO [0, 1, 2, ...] FINAL
		
		System.out.println(fila);
		System.out.println("Tamanho da fila é: " + fila.size());
		
		System.out.println("Primeira pessoa da fila é: " + fila.peek()); // Não remove o elemento e mostra a primeira pessoa da Fila
		
		
		
		for(String pessoa : fila) {
			System.out.println(pessoa);
		}
		
		// Outra forma de criar a variável pessoa, para caso mudar o tipo de dado da Fila
		for(var pessoa : fila) { // "var" vai saber o tipo de dado da variável de acordo com o tipo da fila (inferência)
			System.out.println(pessoa);
		}
		
		Queue<Integer> num = new LinkedList<Integer>();
		
		num.add(1);
		num.add(5);
		num.add(2);
		num.add(32);
		num.add(7);
		
		System.out.println(num);
	}

}
