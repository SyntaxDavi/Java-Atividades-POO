package Atividade1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome);

        scanner.close();
    }
}
