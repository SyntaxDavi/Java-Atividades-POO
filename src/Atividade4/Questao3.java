package Atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProdutos();
        estoque.imprimirProdutos();
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProdutos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos deseja adicionar? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            produtos.add(new Produto(nome, preco, quantidade));
        }
    }

    void imprimirProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto p : produtos) {
            System.out.println("Nome: " + p.nome + ", Preço: " + p.preco + ", Quantidade: " + p.quantidade);
        }
    }
}
