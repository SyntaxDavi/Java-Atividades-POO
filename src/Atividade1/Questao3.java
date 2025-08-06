package Atividade1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Insira o Raio do Circulo: ");
        double raio = scanner.nextDouble();

        double area = PI * (raio * raio);
        System.out.println("O valor do Raio do Circulo: " + area);

        double perimetro = 2 * PI * raio;
        System.out.println("O valor do Perimetro: " + perimetro);

        scanner.close();
    }
}
