
package br.edu.up;
import java.util.Scanner;

import br.edu.up.controller.Estacionamento;
import br.edu.up.models.Carro;

public class Program {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Entrada de carro");
            System.out.println("2. Saída de carro");
            System.out.println("3. Emitir relatório");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o modelo do carro:");
                    String modelo = scanner.nextLine();

                    System.out.println("Digite a placa do carro:");
                    String placa = scanner.nextLine();

                    System.out.println("Digite a cor do carro:");
                    String cor = scanner.nextLine();

                    Carro novoCarro = new Carro(modelo, placa, cor);
                    boolean sucesso = estacionamento.entradaCarro(novoCarro);

                    if (sucesso) {
                        System.out.println("Carro estacionado com sucesso!");
                    } else {
                        System.out.println("Não há vagas disponíveis.");
                    }
                    break;

                case 2:
                    System.out.println("Digite a placa do carro a ser retirado:");
                    String placaSaida = scanner.nextLine();

                    Carro carroSaida = estacionamento.saidaCarro(placaSaida);

                    if (carroSaida != null) {
                        System.out.println("Carro com placa " + placaSaida + " saiu.");
                    } else {
                        System.out.println("Carro com placa " + placaSaida + " não encontrado.");
                    }
                    break;

                case 3:
                    estacionamento.emitirRelatorio();
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
