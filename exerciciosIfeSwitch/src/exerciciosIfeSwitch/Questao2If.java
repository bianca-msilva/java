package exerciciosIfeSwitch;

import java.util.Scanner;

public class Questao2If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número qualquer: ");
		num = input.nextInt();
		
		if(num % 2 == 1 && num > 0) {
			System.out.printf("O número %d é ímpar e positivo", num);
		}else if(num % 2 == 1 && num < 0) {
			System.out.printf("O número %d é ímpar e negativo", num); 
		}else if(num % 2 == 0 && num > 0) {
			System.out.printf("O número %d é par e positivo", num);
		}else if(num == 0) {
			System.out.printf("O número %d é nulo", num);
		}
		else{
			System.out.printf("O número %d é par e negativo", num);
		}
		input.close();
	}

}
