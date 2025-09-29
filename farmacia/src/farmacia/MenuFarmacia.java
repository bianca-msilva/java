package farmacia;

import java.util.Scanner;

import farmacia.util.Cores;


public class MenuFarmacia {

	private static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao;
		
		
		while(true) {
			System.out.println(Cores.TEXT_CYAN_BOLD + "_________________________________");
			System.out.println(" ");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar todos os produtos");
			System.out.println("3 - Buscar Produto por ID");
			System.out.println("4 - Atualizar Dados do produto");
			System.out.println("5 - Apagar produto");
			System.out.println("0 - Sair");
			System.out.println("_________________________________");
			System.out.println(" " + Cores.TEXT_RESET);
			
			
			System.out.println("Digite a opção desejada: ");
			opcao = input.nextInt();
			
			if(opcao == 0) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nFarmáciaTech - Sua farmácia inteligente");
				sobre();
				input.close();
				System.exit(0); // Usado para encerrar automaticamente a execução do programa, depois códigos posteriores não serão executados
			}
		
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE + "Cadastrar produto");
				break;
				
			case 2:
				System.out.println(Cores.TEXT_PURPLE + "Listar produtos");
				break;
				
			case 3:
				System.out.println(Cores.TEXT_PURPLE + "Busca por ID");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_PURPLE + "Atualizar dados do produto");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_PURPLE + "Apagar produto");
				break;
			
			default:
				System.out.println(Cores.TEXT_PURPLE + "\nOpção inexistente!");
			}
		}
		
	}
	
	public static void sobre() {
		System.out.println(Cores.TEXT_PURPLE_BOLD + "________________________________________________________");
		System.out.println("  ");
		System.out.println(Cores.TEXT_PURPLE_BOLD + "Projeto desenvolvido por: " + Cores.TEXT_RESET + 
				Cores.TEXT_WHITE + "\nBianca Maria - BiancaSi@genstudents.org");
		System.out.println(Cores.TEXT_PURPLE_BOLD + "GitHub: " + Cores.TEXT_RESET + Cores.TEXT_WHITE +"https://github.com/bianca-msilva");
		System.out.println("  ");
		System.out.println(Cores.TEXT_PURPLE_BOLD + "________________________________________________________");
	}
}
