package Atividade1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: %.2f°F" + fahrenheit);
        System.out.println("Temperatura em Kelvin: %.2fK" + kelvin);

        scanner.close();
    }
}
