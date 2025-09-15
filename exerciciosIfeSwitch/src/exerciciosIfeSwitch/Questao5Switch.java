package exerciciosIfeSwitch;

import java.util.Scanner;

public class Questao5Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int item, qtde;
		
		System.out.println("---------------------------------------------");
		System.out.println("| Código |     Produto     | Preço Unitário |");
		System.out.println("---------------------------------------------");
		System.out.println("|    1   | Cachorro quente |    R$10,00    |");
		System.out.println("---------------------------------------------");
		System.out.println("|    2   |     X-Salada    | 	R$15,00    |");
		System.out.println("---------------------------------------------");
		System.out.println("|    3   |     X-Bacon     | 	R$18,00    |");
		System.out.println("---------------------------------------------");
		System.out.println("|    4   |      Bauru      | 	R$12,00    |");
		System.out.println("---------------------------------------------");
		System.out.println("|    5   |   Refrigerante  |     R$8,00    |");
		System.out.println("---------------------------------------------");
		System.out.println("|    6   | Suco de laranja |  	R$13,00    |");
		System.out.println("---------------------------------------------");
		
		System.out.println("Digite o item desejado: ");
		item = input.nextInt();
		if(item < 1 || item > 6) {
		    System.out.println("Opção inválida! Digite um número entre 1 e 6.");
		    item = input.nextInt();
		    System.out.println("Digite a quantidade do item desejado: ");
		    qtde = input.nextInt();
			switch(item){
			
			case 1: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 10);
				break;
				
			case 2: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde,  qtde * 15);
				break;
				
			case 3: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 18);
				break;
				
			case 4: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 12);
				break;
				
			case 5: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 8);
				break;
				
			case 6: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 13);
				break;
			default:
				System.out.printf("Opção inválida!");
			}
		} else {
		    System.out.println("Digite a quantidade do item desejado: ");
		    qtde = input.nextInt();
			
			switch(item){
			
			case 1: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 10);
				break;
				
			case 2: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde,  qtde * 15);
				break;
				
			case 3: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 18);
				break;
				
			case 4: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 12);
				break;
				
			case 5: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 8);
				break;
				
			case 6: 
				System.out.printf("Então, a quantidade do item Cachorro Quente será %d."
						+ "\nO valor total da compra é de: R$%d", qtde, qtde * 13);
				break;
			default:
				System.out.printf("Opção inválida!");
			}
		}
		input.close();
	}

}
