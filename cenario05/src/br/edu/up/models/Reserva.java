package br.edu.up.models;

import java.util.Date;

public class Reserva {
    
    private String responsavel;
    private int quantidadePessoas;
    private Date data;
    private double valorTotal;


    
    public Reserva(String responsavel, int quantidadePessoas, Date data, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.data = data;
        this.valorTotal = valorTotal;
    }
    
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Reserva [responsavel=" + responsavel + ", quantidadePessoas=" + quantidadePessoas + ", data=" + data
                + ", valorTotal=" + valorTotal + ", getResponsavel()=" + getResponsavel() + ", getQuantidadePessoas()="
                + getQuantidadePessoas() + ", getData()=" + getData() + ", getValorTotal()=" + getValorTotal()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
    
    
}
