package br.edu.up;

public class Program {
    public static void main(String[] args) {
        Compromisso encontro = new Compromisso("joao", "jardim botanico", "date", 18);

        System.out.println("Pessoa: " + encontro.getPessoa());
        System.out.println("local: " + encontro.getLocal());
        System.out.println("assunto: " + encontro.getAssunto());
        System.out.println("Horario: " + encontro.getHora());

        Compromisso reuniao = new Compromisso("lucas", "sala de reuniao", "meeting", 20);

        System.out.println("Pessoa: " + encontro.getPessoa());
        System.out.println("local: " + encontro.getLocal());
        System.out.println("assunto: " + encontro.getAssunto());
        System.out.println("Horario: " + encontro.getHora());

    }
}
