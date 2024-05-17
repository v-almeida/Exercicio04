package br.edu.up.models;

public class Estacionamento {

    private Carro[] carros = new Carro[10];
    private int vagas = 10;
    private double valorPeriodo = 5.00;
    private int totalDeVeiculos = 0;

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarro(Carro carro) {
        for (int i = 0; i < this.carros.length; i++) {
            if(this.carros[i] == null){
                this.carros[i] = carro;
                break;
            }
        }
    }
    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValorPeriodo() {
        return valorPeriodo;
    }

    public void setValorPeriodo(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }

    public int getTotalDeVeiculos() {
        return totalDeVeiculos;
    }

    public void setTotalDeVeiculos(int totalDeVeiculos) {
        this.totalDeVeiculos = totalDeVeiculos;
    }
}