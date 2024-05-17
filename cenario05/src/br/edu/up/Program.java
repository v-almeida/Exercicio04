package br.edu.up;

import br.edu.up.controller.EventoController;
import br.edu.up.controller.ReservaController;
import br.edu.up.models.Evento;
import br.edu.up.models.Reserva;

import br.edu.up.View.Menu;

public class Program {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        EventoController eventoController = new EventoController();
        ReservaController reservaController = new ReservaController();
        boolean continuar = true; 
        Evento evento = null; // Adicione esta linha
        Reserva reserva = null; // Adicione esta linha
        

        while (continuar) {
            menu.exibirMenu();
            int opcao = menu.getOpcao();

            switch (opcao) {
            case 1:
                System.out.println("Incluir evento selecionado.");
                evento = new Evento("sad", null, null, 0, 0, 0);
                evento.setNome("big");
                eventoController.incluir(evento);
                break;
            case 2:
                System.out.println("Alterar evento selecionado.");
                evento.setNome("adsada");
                eventoController.alterar(evento);
                break;
            case 3:
                System.out.println("Listar eventos selecionado.");
                eventoController.listar();
                break;
            case 4:
                System.out.println("Excluir evento selecionado.");
                eventoController.excluir(evento);
                break;
            case 5:
                System.out.println("Incluir reserva selecionado.");
                reserva = new Reserva(null, 0, null, 0);
                reserva.setResponsavel("pericles");
                reservaController.incluir(reserva);
                break;
            case 6:
                System.out.println("Alterar reserva selecionado.");
                reserva.setResponsavel("altair");
                reservaController.alterar(reserva);
                break;
            case 7:
                System.out.println("Listar reservas selecionado.");
                reservaController.listar();
                break;
            case 8:
                System.out.println("Excluir reserva selecionado.");
                reservaController.excluir(reserva);
                break;
            case 9:
                System.out.println("Saindo...");
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }




        }


        
    }
}
