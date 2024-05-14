package br.edu.up;

public class Program {
    public static void main(String[] args) {

        Dia dia = new Dia(20);

        Compromisso encontro = new Compromisso("joao", "jardim botanico", "date", 18);

        System.out.println("Pessoa: " + encontro.getPessoa());
        System.out.println("local: " + encontro.getLocal());
        System.out.println("assunto: " + encontro.getAssunto());
        System.out.println("Horario: " + encontro.getHora());
        System.out.println("Dia: " + encontro);

        dia.adicionarCompromisso(encontro);

        Compromisso reuniao = new Compromisso("lucas", "sala de reuniao", "meeting", 20);

        System.out.println("Pessoa: " + encontro.getPessoa());
        System.out.println("local: " + encontro.getLocal());
        System.out.println("assunto: " + encontro.getAssunto());
        System.out.println("Horario: " + encontro.getHora());

    }
}
