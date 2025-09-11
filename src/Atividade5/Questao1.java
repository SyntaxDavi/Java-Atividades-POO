package Atividade5;

class Veiculo {
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

    double calcularIPVA() {
        return valorFipe * 0.02;
    }

    void imprimir() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor +
                ", Placa: " + placa + ", Valor FIPE: " + valorFipe);
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
            return 0.0; // isento
        }
        return super.calcularIPVA();
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Cavalos: " + cavalos + ", Portas: " + portas + ", IPVA: " + calcularIPVA());
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
        return super.calcularIPVA();
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Cilindradas: " + cilindradas + ", IPVA: " + calcularIPVA());
    }
}

public class Questao1 {
    public static void main(String[] args) {
        Carro c1 = new Carro(2000, "Civic", "Preto", "ABC-1234", 25000, 140, 4);
        Moto m1 = new Moto(2020, "CG 160", "Vermelha", "XYZ-5678", 12000, 160);

        c1.imprimir();
        System.out.println();
        m1.imprimir();
    }
}
