package br.edu.up.controller;
import br.edu.up.models.Seguro;
import br.edu.up.models.SeguroVeiculo;
import br.edu.up.models.SeguroVida;

public class SegurosMetController {

    public Seguro CreateSeguroVida(String apolice, double vlrApolice, Boolean cobreDoenca, Boolean cobreAcidente) {
        return new SeguroVida(apolice, vlrApolice, cobreDoenca, cobreAcidente);
    }

    public Seguro CreateSeguroVeiculo(String apolice, double vlrApolice, double valorFranquia,
            Boolean temCarroReserva, Boolean cobreVidros) {
        return new SeguroVeiculo(apolice, vlrApolice, valorFranquia, temCarroReserva, cobreVidros);
    }
    
}
