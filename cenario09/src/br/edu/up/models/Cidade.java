package br.edu.up.models;
import java.util.Objects;

public class Cidade {
private String nome;
private String uf;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }  

    
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", uf='" + getUf() + "'" +
            "}";
    }
    
}
