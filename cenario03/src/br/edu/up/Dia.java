package br.edu.up;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {
        this.compromissos[comp.getHora()] = comp;
    }

    public void consultarCompromisso() {

    }

}
