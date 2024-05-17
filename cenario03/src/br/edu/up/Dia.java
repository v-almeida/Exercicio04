package br.edu.up;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes,Compromisso compromisso) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
        this.compromissos[compromisso.getHora()-1]=compromisso;
    }

    public void adicionarCompromisso(Compromisso comp) {
        this.compromissos[comp.getHora()] = comp;
    }

    public void consultarCompromisso() {

    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    

}
