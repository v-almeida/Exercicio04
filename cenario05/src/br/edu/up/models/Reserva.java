package br.edu.up.models;

import java.time.LocalDate;

public class Reserva extends Serv {
    private String nomeResponsavel;
    private int qtdePessoas;

    public Reserva(String nome, String data, String nomeResponsavel, double valor,  int qtdePessoas) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.nomeResponsavel = nomeResponsavel;
        this.qtdePessoas = qtdePessoas;
    }
    @Override
    public String toString() {
        return "Reserva [nome=" + getNome() + ", data=" + getData() + ", valor=" + getValor() + ", nomeResponsavel=" + nomeResponsavel
                + ", qtdePessoas=" + qtdePessoas + "]";
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

  
}
