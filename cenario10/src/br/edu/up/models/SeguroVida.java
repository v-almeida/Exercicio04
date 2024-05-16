package br.edu.up.models;

public class SeguroVida {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    
    public boolean getCobreDoenca() {
        return this.cobreDoenca;
    }

    
    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    
    public boolean getCobreAcidente() {
        return this.cobreAcidente;
    }

    
    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    
    public String getDados() {
        return "Cobre Doença: " + (this.cobreDoenca ? "Sim" : "Não") +
               ", Cobre Acidente: " + (this.cobreAcidente ? "Sim" : "Não");
    }
}

