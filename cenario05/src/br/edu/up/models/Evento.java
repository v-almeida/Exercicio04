package br.edu.up.models;

public class Evento extends Serv {
    private String local;
    private int lotacaoMaxima;
    private int qtdeIngressosVendidos;
    private double precoIngresso;

    public Evento(String nome, String data, String local, int lotacaoMaxima, int qtdeIngressosVendidos, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.valor = precoIngresso * qtdeIngressosVendidos;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.qtdeIngressosVendidos = qtdeIngressosVendidos;
        this.precoIngresso = precoIngresso;
    }
    @Override
    public String toString() {
        return "Evento [nome=" + getNome() + ", data=" + getData() + ", local=" + local + ", lotacaoMaxima=" + lotacaoMaxima
                + ", qtdeIngressosVendidos=" + qtdeIngressosVendidos + ", precoIngresso=" + precoIngresso + ", valor=" + getValor() + "]";
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getQtdeIngressosVendidos() {
        return qtdeIngressosVendidos;
    }

    public void setQtdeIngressosVendidos(int qtdeIngressosVendidos) {
        this.qtdeIngressosVendidos = qtdeIngressosVendidos;
        setValor(precoIngresso * qtdeIngressosVendidos);
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
        setValor(precoIngresso * qtdeIngressosVendidos);
    }


}
