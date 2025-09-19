package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao01Fila {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		int resposta;
		String cliente, clienteRemov;
		
		do {
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("1 - Adicionar um novo Cliente na fila.");
		System.out.println("2 - Listar todos os Clientes na fila");
		System.out.println("3 - Retirar cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("*****************************************");
		System.out.println("Entre com a opção desejada: ");
		resposta = input.nextInt();
		
		if(resposta == 1) {
			System.out.print("Digite o nome do Cliente: ");
			input.nextLine(); 
			cliente = input.nextLine();
			if(!clientes.contains(cliente)) {
				System.out.print("Cliente adicionado!");
				clientes.add(cliente);
			}else {
				System.out.println("Cliente já existente na lista! Digite outro: ");
				cliente = input.nextLine();
				System.out.println("Cliente adicionado!");
				clientes.add(cliente);
			}
			
		}
		else if(resposta == 2) {
			if(!clientes.isEmpty()) {
				System.out.println("Lista de clientes:%n ");
				for(String c : clientes) {
					System.out.println(c);
				}
			}else {
				System.out.println("A fila está vazia!");
			}
			
		}
		else if(resposta == 3) {
			clientes.remove();
			System.out.println("O cliente foi chamado!");
		}
		else {
			System.out.println("Programa finalizado!");
			break;
		}
	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Erro na pausa.");
		}
		
		}while(resposta != 0);
	}

}
