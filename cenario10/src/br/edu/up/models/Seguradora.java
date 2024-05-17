package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Seguradora {

    private String nome;
    private List<Seguro> seguros;
    private List<Segurado> segurados;

    public Seguradora(String nome) {
        this.seguros = new ArrayList<>();
        this.segurados = new ArrayList<>();
        this.nome = nome;
    }

    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public List<Segurado> getSegurados() {
        return this.segurados;
    }

    public void setSegurados(List<Segurado> segurados) {
        this.segurados = segurados;
    }

    public List<Seguro> getSeguros() {
        return this.seguros;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
