package outrosTestes;

import java.util.Scanner;
import java.text.Normalizer;

public class Questao4If {

    public static String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                         .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                         .toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c;

        System.out.println("----------------------");
        System.out.println("   Qual é o animal?   ");
        System.out.println("----------------------");

        System.out.print("O animal é vertebrado ou invertebrado?\nResposta: ");
        a = removerAcentos(input.nextLine());

        if(a.equals("vertebrado")) {
            System.out.print("O animal é ave ou mamífero?\nResposta: ");
            b = removerAcentos(input.nextLine());

            if(b.equals("ave")) {
                System.out.print("O animal é carnívoro ou onívoro?\nResposta: ");
                c = removerAcentos(input.nextLine());

                if(c.equals("carnivoro")) {
                    System.out.println("O animal é uma Águia!");
                } else if(c.equals("onivoro")) {
                    System.out.println("O animal é uma Pomba!");
                } else {
                    System.out.println("Resposta inválida, digite uma opção válida!");
                }

            } else if(b.equals("mamifero")) {
                System.out.print("O animal é onívoro ou herbívoro?\nResposta: ");
                c = removerAcentos(input.nextLine());

                if(c.equals("onivoro")) {
                    System.out.println("O animal é um Homem!");
                } else if(c.equals("herbivoro")) {
                    System.out.println("O animal é uma Vaca!");
                } else {
                    System.out.println("Resposta inválida, digite uma opção válida!");
                }

            } else {
                System.out.println("Resposta inválida, digite uma opção válida!");
            }

        } else if(a.equals("invertebrado")) {
            System.out.print("O animal é inseto ou anelídeo?\nResposta: ");
            b = removerAcentos(input.nextLine());

            if(b.equals("inseto")) {
                System.out.print("O animal é hematófago ou herbívoro?\nResposta: ");
                c = removerAcentos(input.nextLine());

                if(c.equals("hematofago")) {
                    System.out.println("O animal é uma Pulga!");
                } else if(c.equals("herbivoro")) {
                    System.out.println("O animal é uma Lagarta!");
                } else {
                    System.out.println("Resposta inválida, digite uma opção válida!");
                }

            } else if(b.equals("anelideo")) {
                System.out.print("O animal é hematófago ou onívoro?\nResposta: ");
                c = removerAcentos(input.nextLine());

                if(c.equals("hematofago")) {
                    System.out.println("O animal é uma Sanguessuga!");
                } else if(c.equals("onivoro")) {
                    System.out.println("O animal é uma Minhoca!");
                } else {
                    System.out.println("Resposta inválida, digite uma opção válida!");
                }

            } else {
                System.out.println("Resposta inválida, digite uma opção válida!");
            }

        } else {
            System.out.println("Resposta inválida, digite uma opção válida!");
        }

        input.close();
    }

	}


