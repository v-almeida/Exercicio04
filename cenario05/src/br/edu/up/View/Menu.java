package br.edu.up.View;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private int opcao;

    public void exibirMenu() {
        System.out.println("1. Incluir evento");
        System.out.println("2. Alterar evento");
        System.out.println("3. Listar eventos");
        System.out.println("4. Excluir evento");
        System.out.println("5. Incluir reserva");
        System.out.println("6. Alterar reserva");
        System.out.println("7. Listar reservas");
        System.out.println("8. Excluir reserva");
        System.out.println("9. Sair");
        System.out.println("Por favor, escolha uma opção:");

        opcao = scanner.nextInt();
    }

    public int getOpcao() {
        return opcao;
    }
}
