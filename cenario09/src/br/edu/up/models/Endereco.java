package br.edu.up.models;


public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private Cidade cidade;
    public Endereco(Cidade cidade){
        this.cidade = cidade;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ","+ cidade.toString();
    }
   
    

}
