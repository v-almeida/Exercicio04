package br.edu.up.models;

import java.time.LocalDate;

public class Seguro {
    private String apolice;
    private Segurado segurado;
    private double virApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFim;

    
    public String getApolice() {
        return apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public double getVirApolice() {
        return virApolice;
    }

    public LocalDate getDtaInicio() {
        return dtaInicio;
    }

    public LocalDate getDtaFim() {
        return dtaFim;
    }

    
    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public void setVirApolice(double virApolice) {
        this.virApolice = virApolice;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }

    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

    
    public String getDados() {
        return "Apolice: " + apolice + ", Segurado: " + segurado.getNome() + ", Valor da Apolice: " + virApolice + ", Data de Início: " + dtaInicio + ", Data de Fim: " + dtaFim;
    }
}
