package br.edu.up;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        String mes;
        int dia;
        String nome;
        String local;
        String assunto;
        boolean bissexto;
        int hora;
        Mes mesM;
        Dia diaD;
        Compromisso[] compromissos = new Compromisso[24 * 365];
        Ano anoA;
        int contador = 0;

        while (true) {
            System.out.println(" Para Agendar compromisso aperte (1)");
            System.out.println(" Para Listar compromissos aperte (2)");
            System.out.println(" Para fazer o Cancelamento aperte (3)");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("insira o ano do agendamento!");
                    ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Esse ano é Bissexto? 1 sim 2 não");
                    int bissextoInput = scanner.nextInt();
                    bissexto = (bissextoInput == 1);
                    scanner.nextLine();

                    System.out.println("Insira o mês do agendamento!");
                    mes = scanner.nextLine();

                    System.out.println("insira o dia do agendamento");
                    dia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("insira seu nome!");
                    nome = scanner.nextLine();

                    System.out.println("informe o lugar!");
                    local = scanner.nextLine();

                    System.out.println("informe o assunto!");
                    assunto = scanner.nextLine();

                    System.out.println("Informe o horário!");
                    hora = scanner.nextInt();
                    scanner.nextLine();

                    compromissos[contador] = new Compromisso(nome, local, assunto, hora);
                    diaD = new Dia(dia, compromissos[contador]);
                    mesM = new Mes(mes);
                    mesM.addDia(diaD);
                    anoA = new Ano(ano, bissexto, mesM);

                    System.out.println("Compromisso agendado:");
                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nome: " + compromissos[i].getPessoa());
                        System.out.println("Local: " + compromissos[i].getLocal());
                        System.out.println("Assunto: " + compromissos[i].getAssunto());
                        System.out.println("Hora: " + compromissos[i].getHora());
                    }
                    System.out.println("Digite qualquer número para voltar ao menu principal");
                    int voltar = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Informe o nome do compromisso que deseja cancelar:");
                    String nomeCompromisso = scanner.nextLine();
                    for (int i = 0; i < contador; i++) {
                        if (compromissos[i].getPessoa().equals(nomeCompromisso)) {
                            // Desloca todos os compromissos para preencher o espaço do compromisso cancelado
                            for (int j = i; j < contador - 1; j++) {
                                compromissos[j] = compromissos[j + 1];
                            }
                            // Diminui o contador de compromissos
                            contador--;
                            System.out.println("Compromisso cancelado.");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("ERRO!. Tente mais uma vez.");
                    break;
            }
        }
    }
}
