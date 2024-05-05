package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Mes extends Compromisso {
    private String nome;
    private int qtdeDias;
    private List<Dia> dias = new ArrayList<>();

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
    }

    public void adicionarDia(Dia dia) {
        dias.add(dia);
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        dias.get(diaMes - 1).adicionarCompromisso(comp);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
        dias.get(diaMes - 1).adicionarCompromisso(comp);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        dias.get(diaMes - 1).excluirCompromisso(hora);
    }

    public String listarCompromissos(int diaMes) {
        return dias.get(diaMes - 1).listarCompromissos();
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Dia dia : dias) {
            sb.append(dia.listarCompromissos()).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}

