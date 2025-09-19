package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Questao02Pilha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao;
		String livro;

		Deque<String> livros = new ArrayDeque<String>();

		do {
			System.out.println("******************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("******************************");

			System.out.println("Entre com a opção desejada: ");
			opcao = input.nextInt();

			if (opcao == 1) {
				System.out.print("Qual livro deseja adicionar à pilha? R: ");
				input.skip("\\R");
				livro = input.nextLine().toLowerCase();
				if (!livros.contains(livro)) {
					System.out.println("Livro adicionado!");
					livros.push(livro);
				} else {
					System.out.println("Livro já existente na pilha! Digite outro: ");
					livro = input.nextLine().toLowerCase();
					System.out.println("Livro adicionado!");
					livros.push(livro);
				}
			} else if (opcao == 2) {
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Livros na pilha:");
					for (String l : livros) {
						System.out.println(l);
					}
				}
			} else if (opcao == 3) {
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
					} else {
						System.out.println(livros);
						System.out.print("Digite o livro que deseja remover: ");
						input.skip("\\R");
						livro = input.nextLine().toLowerCase();
						if (livros.contains(livro)) {
							livros.remove(livro);
						}else {
							System.out.println("Este livro não existe na pilha!");
						
					}
				}
			} else if (opcao == 0) {
				System.out.println("Programa finalizado!");
				break;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Erro na pausa.");
			}


		} while (opcao != 0);

	}
}