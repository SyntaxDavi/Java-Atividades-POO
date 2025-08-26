package Atividade3;

public class Questao3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davi", "2025001", 10, 0);
        aluno.imprimir();
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.aprovado());
    }
}

class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }

    String aprovado() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}
