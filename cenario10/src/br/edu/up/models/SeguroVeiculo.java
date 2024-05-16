package br.edu.up.models;

public class SeguroVeiculo {
    private double franquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    
    public double getFranquia() {
        return this.franquia;
    }

    
    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    
    public boolean getTemCarroReserva() {
        return this.temCarroReserva;
    }

    
    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    
    public boolean getCobreVidros() {
        return this.cobreVidros;
    }

    
    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }
}
