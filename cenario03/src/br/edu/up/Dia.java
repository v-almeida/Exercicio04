package br.edu.up;

import java.util.ArrayList;

public class Dia {
    private int diaMes;


    
    private ArrayList<Compromisso> compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso comp) {
        this.compromissos.add(comp);
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp.getHora() == hora) {
                return comp;
            }
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        compromissos.removeIf(comp -> comp.getHora() == hora);
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso comp : compromissos) {
            sb.append(comp.getAssunto()).append(" com ").append(comp.getPessoa()).append(" no ").append(comp.getLocal()).append(" às ").append(comp.getHora()).append("\n");
        }
        return sb.toString();
    }

    
}
