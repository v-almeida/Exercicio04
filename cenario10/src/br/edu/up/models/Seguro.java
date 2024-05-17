package br.edu.up.models;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Seguro {
    protected String apolice;
    protected double vlrApolice;
    protected LocalDate dtInicio;
    protected LocalDate dtFim;
    

    public String getApolice() {
        return this.apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public double getVlrApolice() {
        return this.vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return this.dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

   

}
