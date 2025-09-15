package exerciciosIfeSwitch;

import java.util.Scanner;


public class Questao4 {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a, b, c;
		
		System.out.println("----------------------");
		System.out.println("   Qual é o animal?   ");
		System.out.println("----------------------");
		
		System.out.print("O animal é vertebrado ou invertebrado?\nResposta: ");
		a = input.nextLine();
		
		if(a.equalsIgnoreCase("vertebrado")) {
			System.out.print("O animal é ave ou mamífero?\nResposta: ");
			b = input.nextLine();
			if(b.equalsIgnoreCase("ave")) {
				System.out.print("O animal é carnívoro ou onívoro?\nResposta: ");
				c = input.nextLine();
				if(c.equalsIgnoreCase("carnivoro")) {
					System.out.println("O animal é uma Águia");
				}else if(c.equalsIgnoreCase("onivoro")) {
					System.out.println("O animal é uma Pomba!");
				}else {
					System.out.println("Resposta inválida, digite uma opção válida!");
				}
			}else if(b.equalsIgnoreCase("mamifero")) {
				System.out.print("O animal é onívoro ou herbívoro?\nResposta: ");
				c = input.nextLine();
				if(c.equalsIgnoreCase("onivoro")) {
					System.out.println("O animal é um Homem!");
				}else if(c.equalsIgnoreCase("herbivoro")) {
					System.out.println("O animal é uma Vaca!");
				}else {
					System.out.println("Resposta inválida, digite uma opção válida!");
				}
			}else {
				System.out.println("Resposta inválida, digite uma opção válida!");
			}
		}else if(a.equalsIgnoreCase("invertebrado")) {
			System.out.print("O animal é inseto ou anelídeo?\nResposta: ");
			b = input.nextLine();
			if(b.equalsIgnoreCase("inseto")) {
				System.out.print("O animal é hematófago ou herbívoro?\nResposta: ");
				c = input.nextLine();
				if(c.equalsIgnoreCase("hematofago")) {
					System.out.println("O animal é uma Pulga!");
				}else if(c.equalsIgnoreCase("herbivoro")) {
					System.out.println("O animal é uma Lagarta!");
				}else {
					System.out.println("Resposta inválida, digite uma opção válida!");
				}
			}else if(b.equalsIgnoreCase("anelideo")) {
				System.out.print("O animal é hematófago ou onívoro?\nResposta: ");
				c = input.nextLine();
				if(c.equalsIgnoreCase("hematofago")) {
					System.out.println("O animal é uma Sanguessuga!");
				}else if(c.equalsIgnoreCase("onivoro")) {
					System.out.println("O animal é uma Minhoca!");
				}else {
					System.out.println("Resposta inválida, digite uma opção válida!");
				}
			}else {
				System.out.println("Resposta inválida, digite uma opção válida!");
			}
		}else {
			System.out.println("Resposta inválida, digite uma opção válida!");
			
		}
		
		input.close();
	}

}
