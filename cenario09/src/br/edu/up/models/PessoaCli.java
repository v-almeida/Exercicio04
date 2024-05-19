package br.edu.up.models;

public class PessoaCli extends Cliente {
    
    private Double peso;
    private Double altura;
    private String CPF;

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String toString() {
        return "{\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"telefone\": \"" + telefone + "\",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"endereço\": \"" + endereço.toString() + "\",\n" +
                "  \"vlrMaximoCredito\": \"" + vlrMaximoCredito + "\",\n" +
                "  \"vlrEmprestado\": \"" + vlrEmprestado + "\",\n" +
                "  \"altura\": \"" + altura + "\",\n" +
                "  \"peso\": \"" + peso + "\",\n" +
                "  \"CPF\": \"" + CPF + "\"\n" +
                "}";
    }

}
