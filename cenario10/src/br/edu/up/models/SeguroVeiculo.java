package br.edu.up.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SeguroVeiculo extends Seguro {
    private double valorFranquia;
    private Boolean temCarroReserva;
    private Boolean cobreVidros;

    public SeguroVeiculo(
            String apolice, double vlrApolice, double valorFranquia,
            Boolean temCarroReserva, Boolean cobreVidros
            ) {
        super.setApolice(apolice);
        super.setVlrApolice(vlrApolice);
        super.setDtFim(dtFim);
        this.valorFranquia = valorFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
        this.dtInicio = LocalDateTime.now().toLocalDate();
    }
    @Override
    public String toString() {
        return "SeguroVeiculo\n   {\n" +
                "   \"apolice\" = \"" + apolice + 
                "\", \n   \"vlrApolice\" = " + vlrApolice +
                ", \n   \"dtInicio\" = \"" + dtInicio  +
                "\", \n   \"valorFranquia\" = \"" + valorFranquia +
                "\", \n   \"temCarroReserva\" = \"" + temCarroReserva +
                "\", \n   \"cobreVidros\" = \"" + cobreVidros +
                "\"\n   }\n";
    }

    public double getValorFranquia() {
        return this.valorFranquia;
    }

    public void setValorFranquia(double valorFranquia) {
        this.valorFranquia = valorFranquia;
    }

    public Boolean isTemCarroReserva() {
        return this.temCarroReserva;
    }

    public Boolean getTemCarroReserva() {
        return this.temCarroReserva;
    }

    public void setTemCarroReserva(Boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public Boolean isCobreVidros() {
        return this.cobreVidros;
    }

    public Boolean getCobreVidros() {
        return this.cobreVidros;
    }

    public void setCobreVidros(Boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

}
