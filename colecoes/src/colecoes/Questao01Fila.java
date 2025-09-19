package colecoes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao01Fila {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		int resposta;
		String cliente, clienteRemov;
		
		System.out.println("*****************************************");
		System.out.println("1 - Adicionar um novo Cliente na fila.");
		System.out.println("2 - Listar todos os Clientes na fila");
		System.out.println("3 - Retirar cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("*****************************************");
		System.out.println("Entre com a opção desejada: ");
		resposta = input.nextInt();
		
		while(resposta != 0) {
			if(resposta == 1) {
				System.out.print("Digite o nome do Cliente: ");
				input.skip("\\R");
				cliente = input.nextLine();
				clientes.add(cliente);
				System.out.print("Digite 1 para continuar e 0 para finalizar: ");
				resposta = input.nextInt();
			}else if(resposta == 3) {
				System.out.println("Digite o nome do Cliente que deseja retirar: ");
				input.skip("\\R");
				cliente = input.nextLine();
				clientes.remove(cliente);
				System.out.println("Digite 1 para continuar e 0 para finalizar: ");
				resposta = input.nextInt();
			}
			else {
				do {
				System.out.println("Opção inválida! Digite outra opção válida: ");
				resposta = input.nextInt();
				}while(resposta != 0 && resposta != 1 && resposta != 2 && resposta != 3 );
			}
		}	
		System.out.println(clientes);
		
	}

}
