package br.edu.up.View;

import java.util.Scanner;
import br.edu.up.controller.*;
import br.edu.up.models.*;

public class View {

    private ServController e_control;
    private Scanner scanner;

    public View() {
        this.e_control = new ServController();
        this.scanner = new Scanner(System.in);
    }
    public void View() {
        while (true) {
            System.out.println("Seja bem vindo!");
                System.out.println("temos as Seguintes opções");
                    System.out.println("|");
                        System.out.println("|");
                            System.out.println("|");
                                System.out.println("|");
                                     System.out.println("Aperte(1) para Reserva");
                                        System.out.println("Aperte(2) para Evento");
                                            String nome = (scanner.nextInt() == 1) ? "Reserva" : "Evento";
                                                System.out.println("1. Incluir " + nome);
                                                    System.out.println("2. Alterar " + nome);
                                                        System.out.println("3. Listar " + nome);
                                                            System.out.println("4. Excluir " + nome);
                                                                System.out.println("5. Sair");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println(incluirEvento(nome));
                    break;
                case 2:
                    System.out.println(alterarServico(nome));
                    break;
                case 3:
                    listarServicos(nome);
                    break;
                case 4:
                    System.out.println(excluirEvento(nome));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("ERRO!");
                    break;
            }
        }
    }
                public String incluirEvento(String servico) {
                System.out.println("Digite o nome do " + servico + ":");
                 String nome = scanner.nextLine();
                if (!this.e_control.VerificarEvento(nome)) {
                 if (servico.equals("evento")) {
                System.out.println("Digite a data!:");
                String data = scanner.nextLine();
                System.out.println("informe o local do evento!");
                String local = scanner.nextLine();
                System.out.println("Informe a lotação máxima do evento!");
                int lotacaoMaxima = scanner.nextInt();
                System.out.println("Informe quantidade de ingressos!");
                int qtdeIngressosVendidos = scanner.nextInt();
                System.out.println("Informe o valor dos ingressos!");
                double precoIngresso = scanner.nextDouble();
                scanner.nextLine(); 
                this.e_control.setEvento(nome, data, local, lotacaoMaxima, qtdeIngressosVendidos, precoIngresso);
                    return "Evento criado.";
                } else if (servico.equals("reserva")) {
                System.out.println("Qual a data da reserva?");
                String data = scanner.nextLine();
                System.out.println("Qual o nome do responsável?");
                String nomeResponsavel = scanner.nextLine();
                System.out.println("Qual valor da reserva?");
                double valor = scanner.nextDouble();
                System.out.println("Quantas pessoas para sua reserva?");
                int qtdePessoas = scanner.nextInt();
                scanner.nextLine(); 
                this.e_control.setReserva(nome, data, nomeResponsavel, valor, qtdePessoas);
                return "Reserva criada.";
            }
        }
        return "Este serviço já existe.";
    }
    public String alterarServico(String servi) {
        System.out.println("Digite o nome do " + servi + " a ser alterado:");
        String nome = scanner.nextLine();
        Serv serv = this.e_control.getServico(nome);
        if (serv == null) {
            return "Serviço não encontrado.";
        }
        if ((servi.equals("reserva") && serv instanceof Evento) || (servi.equals("evento") && serv instanceof Reserva)) {
            return "Você um nome de outro serviço.";
        }
        boolean b = true;
        while (b) {
            System.out.println("Deseja alterar qual informação?");
            if (serv instanceof Reserva) {
                Reserva reserva = (Reserva) serv;
                System.out.println("1 - Nome");
                System.out.println("2 - Data");
                System.out.println("3 - Responsável");
                System.out.println("4 - Quantidade de pessoas");
                System.out.println("5 - Valor");
                System.out.println("6 - Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine(); 
                switch (opcao) {
                    case 1:
                        System.out.println("Informe o novo nome:");
                        reserva.setNome(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Informe a nova data:");
                        reserva.setData(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Informe o novo responsável:");
                        reserva.setNomeResponsavel(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Digite a nova quantidade de pessoas:");
                        reserva.setQtdePessoas(scanner.nextInt());
                        scanner.nextLine(); 
                        break;
                    case 5:
                        System.out.println("Digite o novo valor:");
                        reserva.setValor(scanner.nextDouble());
                        scanner.nextLine(); 
                        break;
                    case 6:
                        b = false;
                        break;
                    default:
                        System.out.println("ERRO!");
                        break;
                }
            } else if (serv instanceof Evento) {
                Evento evento = (Evento) serv;
                System.out.println("1 - Nome");
                System.out.println("2 - Data");
                System.out.println("3 - Local");
                System.out.println("4 - Lotação Máxima");
                System.out.println("5 - Ingressos Vendidos");
                System.out.println("6 - Preço do ingresso");
                System.out.println("7 - Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine(); 
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o novo nome:");
                        evento.setNome(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Digite a nova data:");
                        evento.setData(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Digite o novo local:");
                        evento.setLocal(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Digite a nova lotação máxima:");
                        evento.setLotacaoMaxima(scanner.nextInt());
                        scanner.nextLine();
                        break;
                    case 5:
                        System.out.println("Digite a nova quantidade de ingressos vendidos:");
                        evento.setQtdeIngressosVendidos(scanner.nextInt());
                        scanner.nextLine(); 
                        break;
                    case 6:
                        System.out.println("Digite o novo preço do ingresso:");
                        evento.setPrecoIngresso(scanner.nextDouble());
                        scanner.nextLine(); 
                        break;
                    case 7:
                        b = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }
        return servi + " alterado.";
    }
    public void listarServicos(String tipoServico) {
        Serv[] vetor = e_control.getServicos();
        for (Serv servico : vetor) {
            if (tipoServico.equals("evento") && servico instanceof Evento) {
                System.out.println(servico.toString());
            } else if (tipoServico.equals("reserva") && servico instanceof Reserva) {
                System.out.println(servico.toString());
            }
        }
    }
    public String excluirEvento(String servico) {
        System.out.println("Digite o nome do " + servico + " a ser excluído:");
        String nome = scanner.nextLine();
        if (this.e_control.VerificarEvento(nome)) {
            e_control.excluirEvento(nome);
            return servico + " excluído!";
        }
        return "Não encontrado.";
    }
}
