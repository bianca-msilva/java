package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Questao03Set {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		
		while (valores.size() < 10) {
            int resposta;

            do {
                System.out.print("Digite um número qualquer, sem repetições: ");
                resposta = input.nextInt();

                if (valores.contains(resposta)) {
                    System.out.println("Número repetido! Tente outro.");
                }
            } while (valores.contains(resposta)); // repete até que seja único

            valores.add(resposta);
        }

		
		Iterator<Integer> iterador = valores.iterator();
		
		System.out.println("Números digitados: ");
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}

}
