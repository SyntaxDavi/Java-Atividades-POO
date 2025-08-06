package Atividade1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Insira o seu peso: ");
        double peso = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.println("Seu IMC: %.2f" + IMC);

        scanner.close();
    }
}
