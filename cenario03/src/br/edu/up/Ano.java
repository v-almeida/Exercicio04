package br.edu.up;

import java.util.HashMap;
import java.util.Map;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Map<String, Mes> meses = new HashMap<>();

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public void adicionarMes(Mes mes) {
        meses.put(mes.getNome(), mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        Mes mes = meses.get(nomeMes);
        if (mes != null) {
            mes.excluirCompromisso(diaMes, hora);
        }
    }

    public String listarCompromissos(String nomeMes) {
        Mes mes = meses.get(nomeMes);
        return (mes != null) ? mes.listarCompromissos() : "Mês não encontrado.";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses.values()) {
            sb.append(mes.listarCompromissos()).append("\n");
        }
        return sb.toString();
    }
}

