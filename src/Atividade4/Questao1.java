package Atividade4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(2, 3);

        matriz.preencher();
        matriz.imprimir();

        System.out.println("Soma dos elementos: " + matriz.somar());

        matriz.multiplicar(2);
        System.out.println("Matriz após multiplicar por 2:");
        matriz.imprimir();
    }
}

class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;

    Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    void preencher() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                elementos[i][j] = sc.nextInt();
            }
        }
    }

    void imprimir() {
        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(elementos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int somar() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += elementos[i][j];
            }
        }
        return soma;
    }

    void multiplicar(int valor) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] *= valor;
            }
        }
    }
}
