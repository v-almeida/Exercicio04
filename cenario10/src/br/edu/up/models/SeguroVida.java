package br.edu.up.models;

import java.time.LocalDateTime;

public class SeguroVida extends Seguro {
    private Boolean cobreDoenca;
    private Boolean cobreAcidente;

    public Boolean isCobreDoenca() {
        return this.cobreDoenca;
    }

    public Boolean getCobreDoenca() {
        return this.cobreDoenca;
    }

    public void setCobreDoenca(Boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public Boolean isCobreAcidente() {
        return this.cobreAcidente;
    }

    public Boolean getCobreAcidente() {
        return this.cobreAcidente;
    }

    public void setCobreAcidente(Boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    public SeguroVida(String apolice, double vlrApolice, Boolean cobreDoenca, Boolean cobreAcidente) {
        super.setApolice(apolice);
        super.setVlrApolice(vlrApolice);
        super.setDtFim(dtFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
        this.dtInicio = LocalDateTime.now().toLocalDate();
    }

    public String toString() {
        return "SeguroVida\n   {\n" +
           "   \"apolice\" = \"" + apolice + '\'' +
           "\", \n   \"vlrApolice\" = " + vlrApolice +
           ", \n   \"dtInicio\" = \"" + dtInicio +
           "\", \n   \"cobreDoenca\" = \"" + cobreDoenca +
           "\", \n   \"cobreAcidente\" = \"" + cobreAcidente +
           "\"\n   }\n";
    }

}
