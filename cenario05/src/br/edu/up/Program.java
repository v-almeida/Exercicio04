package br.edu.up;

import br.edu.up.controller.EventoController;
import br.edu.up.controller.ReservaController;
import br.edu.up.models.Evento;
import br.edu.up.models.Reserva;

import br.edu.up.View.Menu;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        EventoController eventoController = new EventoController();
        ReservaController reservaController = new ReservaController();
        boolean continuar = true; 
        Evento evento = null; 
        Reserva reserva = null; 

        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            menu.exibirMenu();
            int opcao = menu.getOpcao();

            switch (opcao) {
            case 1:
                System.out.println("Incluir evento selecionado.");
                System.out.print("Digite o nome do evento: ");
                String nomeEvento = scanner.nextLine();
                evento = new Evento(nomeEvento, null, null, 0, 0, 0);
                eventoController.incluir(evento);
                break;
            case 2:
                System.out.println("Alterar evento selecionado.");
                System.out.print("Digite o nome do evento que deseja alterar: ");
                nomeEvento = scanner.nextLine();
                System.out.print("Digite o novo nome do evento: ");
                String novoNomeEvento = scanner.nextLine();
                evento = new Evento(novoNomeEvento, null, null, 0, 0, 0);
                if (!eventoController.alterar(nomeEvento, evento)) {
                    System.out.println("Evento não encontrado.");
                }
                break;
            case 3:
                System.out.println("Listar eventos selecionado.");
                eventoController.listar();
                break;
            case 4:
                System.out.println("Excluir evento selecionado.");
                System.out.print("Digite o nome do evento que deseja excluir: ");
                nomeEvento = scanner.nextLine();
                if (!eventoController.excluir(nomeEvento)) {
                    System.out.println("Evento não encontrado.");
                }
                break;
            case 5:
                System.out.println("Incluir reserva selecionado.");
                System.out.print("Digite o nome do responsável pela reserva: ");
                String nomeResponsavel = scanner.nextLine();
                reserva = new Reserva(nomeResponsavel, 100, null,1000);
                reservaController.incluir(reserva);
                break;
            case 6:
                System.out.println("Alterar reserva selecionado.");
                System.out.print("Digite o nome do responsável pela reserva que deseja alterar: ");
                nomeResponsavel = scanner.nextLine();
                System.out.print("Digite o novo nome do responsável pela reserva: ");
                String novoNomeResponsavel = scanner.nextLine();
                reserva = new Reserva(novoNomeResponsavel, 100, null,1000);
                if (!reservaController.alterar(nomeResponsavel, reserva)) {
                    System.out.println("Reserva não encontrada.");
                }
                break;
            case 7:
                System.out.println("Listar reservas selecionado.");
                reservaController.listar();
                break;
            case 8:
                System.out.println("Excluir reserva selecionado.");
                System.out.print("Digite o nome do responsável pela reserva que deseja excluir: ");
                nomeResponsavel = scanner.nextLine();
                if (!reservaController.excluir(nomeResponsavel)) {
                    System.out.println("Reserva não encontrada.");
                }
                break;
            case 9:
                System.out.println("Saindo...");
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
        scanner.close();
    }
}