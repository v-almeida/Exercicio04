package br.edu.up.models;



public class Segurado extends Seguro {
    private String nome;
    private String RG;
    private String CPF;
    private Sexo sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;


    public enum Sexo {
        MASCULINO,
        FEMININO
    }

   
    public String getNome() {
        return nome;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCidade() {
        return cidade;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    @Override
    public String toString() {
        return "Nome: " + nome + ", RG: " + RG + ", CPF: " + CPF + ", Sexo: " + sexo + ", Telefone: " + telefone + ", Endereço: " + endereco + ", CEP: " + CEP + ", Cidade: " + cidade;
    }
}