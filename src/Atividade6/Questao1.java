package Atividade6;

import java.io.*;
import java.util.*;

abstract class Veiculo {
    int ano;
    String modelo;
    String cor;
    String placa;
    double valorFipe;

    Veiculo(int ano, String modelo, String cor, String placa, double valorFipe) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valorFipe = valorFipe;
    }

    abstract double calcularIPVA();

    abstract String getTipo();

    String formatar() {
        return getTipo() + ";" + ano + ";" + modelo + ";" + cor + ";" + placa + ";" + valorFipe;
    }
}

class Carro extends Veiculo {
    int cavalos;
    int portas;

    Carro(int ano, String modelo, String cor, String placa, double valorFipe, int cavalos, int portas) {
        super(ano, modelo, cor, placa, valorFipe);
        this.cavalos = cavalos;
        this.portas = portas;
    }

    @Override
    double calcularIPVA() {
        int anoAtual = java.time.Year.now().getValue();
        if (anoAtual - ano > 20) {
            return 0.0;
        }
        return valorFipe * 0.02;
    }

    @Override
    String getTipo() {
        return "C";
    }

    @Override
    String formatar() {
        return super.formatar() + ";" + cavalos + ";" + portas;
    }
}

class Moto extends Veiculo {
    int cilindradas;

    Moto(int ano, String modelo, String cor, String placa, double valorFipe, int cilindradas) {
        super(ano, modelo, cor, placa, valorFipe);
        this.cilindradas = cilindradas;
    }

    @Override
    double calcularIPVA() {
        if (cilindradas < 170) {
            return 0.0;
        }
        return valorFipe * 0.02;
    }

    @Override
    String getTipo() {
        return "M";
    }

    @Override
    String formatar() {
        return super.formatar() + ";" + cilindradas;
    }
}

public class Questao1 {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro(2000, "Civic", "Preto", "ABC-1234", 25000, 140, 4));
        veiculos.add(new Carro(2015, "Corolla", "Prata", "DEF-5678", 50000, 150, 4));
        veiculos.add(new Carro(1995, "Fusca", "Azul", "GHI-9012", 10000, 50, 2));
        veiculos.add(new Carro(2021, "Onix", "Branco", "JKL-3456", 40000, 110, 4));
        veiculos.add(new Carro(2018, "Golf", "Cinza", "MNO-7890", 70000, 180, 4));

        veiculos.add(new Moto(2020, "CG 160", "Vermelha", "XYZ-1111", 12000, 160));
        veiculos.add(new Moto(2019, "Biz 125", "Preta", "XYZ-2222", 9000, 125));
        veiculos.add(new Moto(2021, "Hornet", "Amarela", "XYZ-3333", 35000, 600));
        veiculos.add(new Moto(2010, "XTZ 250", "Azul", "XYZ-4444", 15000, 250));
        veiculos.add(new Moto(2022, "Ninja 400", "Verde", "XYZ-5555", 28000, 400));

        salvarArquivo("veiculos.txt", veiculos);
        salvarArquivo("carros.txt", veiculos.stream().filter(v -> v instanceof Carro).toList());
        salvarArquivo("motos.txt", veiculos.stream().filter(v -> v instanceof Moto).toList());

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual arquivo deseja ler? (veiculos.txt / carros.txt / motos.txt): ");
        String nomeArquivo = sc.nextLine();

        lerArquivo(nomeArquivo);
    }

    static void salvarArquivo(String nome, List<Veiculo> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nome))) {
            for (Veiculo v : lista) {
                bw.write(v.formatar());
                bw.newLine();
            }
            System.out.println("Arquivo " + nome + " salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void lerArquivo(String nome) {
        try (BufferedReader br = new BufferedReader(new FileReader(nome))) {
            String linha;
            System.out.println("\nConteúdo de " + nome + ":");
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + nome);
        }
    }
}
