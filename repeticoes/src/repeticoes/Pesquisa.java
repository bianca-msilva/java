package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 = 0, totalRespostas = 0;
		long somaIdades = 0;
		double mediaIdades = 0;  // Essas tem que iniciar com um valor pois posteriormente fará atribuições
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte favorito");
			
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			    
			
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			
			System.out.println("Digite seu esporte favorito: ");
			esporte = input.nextInt();
			
			// Total pessoas que gostam de futebol
			
			if(esporte == 1) {
				futebol++;
			}else if(esporte == 2 && idade >=18) { // Total pessoas que gostam de voleibol e são maiores de 18 anos
				voleiM18++;
			}else if (esporte == 3 && idade < 18) { // Total pessoas que gostam de basquetebol e são menores de 18 anos
				basquetem18++;
			}else {
				System.out.println("Opção inexistente");
			}
		
			somaIdades += idade;
			
			totalRespostas ++;
			
			// Para permitir que somente sejam digitados "S" ou "N" - VALIDAÇÃO DE DADOS
			do{
			System.out.println("Deseja continuar (S/N)? ");
			input.skip("\\R");
			continua = input.nextLine().toUpperCase();
			}while(!continua.equals("S") && !continua.equals("N"));
		}
		
		// Calcular após o usuário selecionar para sair do loop
		mediaIdades = Math.round(somaIdades / totalRespostas);
		
		System.out.printf("Total que gostam de futebol %d%n", futebol);
		System.out.printf("Total que gostam de voleibol maiores de 18 anos %d%n", voleiM18);
		System.out.printf("Total que gostam de basquetebol menores de 18 anos %d%n", basquetem18);
		System.out.printf("Média das idades %.2f%n", mediaIdades);
		
		
		input.close();
	}

}
