package Atividade3;

public class Questao1 {
    public static void main(String[] args) {
        Livro livro = new Livro("O Livro Vermelho", "Mao Tsé-Tung", 1964);
        livro.imprimir();
    }
}

class Livro {
    String titulo;
    String autor;
    int ano;

    Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
