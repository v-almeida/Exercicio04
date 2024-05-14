package br.edu.up.models;

public class Estacionamento {
    private static final int NUM_VAGAS = 10;
    private Carro[] vagas;
    private int vagasOcupadas;

    public Estacionamento() {
        vagas = new Carro[NUM_VAGAS];
        vagasOcupadas = 0;
    }

    public boolean entradaCarro(Carro carro) {
        if (vagasOcupadas < NUM_VAGAS) {
            vagas[vagasOcupadas] = carro;
            vagasOcupadas++;
            return true;
        }
        return false;
    }

    public Carro saidaCarro(String placa) {
        for (int i = 0; i < vagasOcupadas; i++) {
            if (vagas[i].getPlaca().equals(placa)) {
                Carro carroSaida = vagas[i];
                vagas[i] = null;
                vagasOcupadas--;
                return carroSaida;
            }
        }
        return null;
    }

    public void emitirRelatorio() {
        int veiculosEntrada = vagasOcupadas;
        int veiculosSaida = NUM_VAGAS - vagasOcupadas;
        double valorTotal = veiculosEntrada * 5.0;

        System.out.println("Relatório:");
        System.out.println("Veículos entraram: " + veiculosEntrada);
        System.out.println("Veículos saíram: " + veiculosSaida);
        System.out.println("Valor total arrecadado: R$ " + valorTotal);
    }
}
