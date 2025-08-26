package Atividade3;

public class Questao2 {
    public static void main(String[] args) {
        Livro2 livro = new Livro2("O Alquimista", "Paulo Coelho", 1988, "Rocco");
        livro.imprimir();
    }
}

class Livro2 {
    String titulo;
    String autor;
    int ano;
    String editora;

    Livro2(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Editora: " + editora);
    }
}