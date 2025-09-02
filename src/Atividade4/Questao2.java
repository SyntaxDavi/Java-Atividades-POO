package Atividade4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.preencher();
        lista.imprimir();
        System.out.println("Maior elemento: " + lista.maiorElemento());
        System.out.println("Quantidade de numeros pares: " + lista.contarPares());
        System.out.println("Média dos elementos: " + lista.media());
    }
}

class Lista {
    private int[] elementos;
    private int tamanho;

    Lista(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
    }

    void preencher() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            elementos[i] = sc.nextInt();
        }
    }

    void imprimir() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    int maiorElemento() {
        int maior = elementos[0];
        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    int contarPares() {
        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    double media() {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += elementos[i];
        }
        return (double) soma / tamanho;
    }
}
