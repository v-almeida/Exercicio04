package br.edu.up.views;

import java.util.Scanner;
import br.edu.up.models.*;
import br.edu.up.controller.SeguradoraControler;

public class SeguradoraView {

    private SeguradoraControler controler;
    private Scanner scanner;

    public SeguradoraView() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Informe sua seguradora!");
        controler = new SeguradoraControler(scanner.nextLine());
        while (true) {

            System.out.println("\n Gerenciamento de Seguros ");
            System.out.println("1. Listar seguros");
            System.out.println("2. Adicionar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros que tem");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarSeguros();
                    break;
                case 2:
                    adicionarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    private void listarSeguros() {
        System.out.println("\nLista de Seguros:");
        controler.listarSeguros().forEach(seguro -> System.out.println(seguro.toString()));
    }

    private void adicionarSeguro() {
        System.out.println("Escolha o tipo de seguro a ser adicionado:");
        System.out.println("1. Seguro de Veículo");
        System.out.println("2. Seguro de Vida");
        System.out.print("Digite sua escolha: ");
        int tipoSeguro = scanner.nextInt();
        if (tipoSeguro == 1 || tipoSeguro == 2) {
            scanner.nextLine();

            String apolice = "N" + (controler.quantidadeSeguros() + 1) + "BR";
            System.out.print("Digite o valor do seguro: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            if (tipoSeguro == 1) {
                System.out.print("Digite o valor da franquia: ");
                double valorFranquia = scanner.nextDouble();
                System.out.print("Tem carro reserva? (true/false): ");
                boolean temCarroReserva = scanner.nextBoolean();
                System.out.print("Cobre vidros? (true/false): ");
                boolean cobreVidros = scanner.nextBoolean();
                scanner.nextLine();

                SeguroVeiculo seguro = new SeguroVeiculo(apolice, valor, valorFranquia, temCarroReserva, cobreVidros);
                controler.incluirSeguro(seguro);
            } else if (tipoSeguro == 2) {
                System.out.print("Cobre doença? (true/false): ");
                boolean cobreDoenca = scanner.nextBoolean();
                System.out.print("Cobre acidente? (true/false): ");
                boolean cobreAcidente = scanner.nextBoolean();
                scanner.nextLine();

                SeguroVida seguro = new SeguroVida(apolice, valor, cobreDoenca, cobreAcidente);
                controler.incluirSeguro(seguro);
            }
            System.out.println(controler.localizarSeguro(apolice)[0]);

        } else {
            System.out.println("\nTipo de seguro inválido!");
        }
    }

    private void excluirSeguro() {
        System.out.print("Digite o número da apólice do seguro a ser excluído: ");
        String apolice = scanner.nextLine();
        String resultado = controler.excluirSeguro(apolice);
        System.out.println(resultado);
    }

    private void excluirTodosSeguros() {
        controler.excluirTodosSeguros();
    }
}