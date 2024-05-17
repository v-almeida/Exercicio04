package br.edu.up.controller;

import br.edu.up.models.Reserva;

public class ReservaController {
    private Reserva[] reservas = new Reserva[10];
    private int count = 0;

    public void incluir(Reserva reserva) {
        if (count < reservas.length) {
            reservas[count] = reserva;
            count++;
        } else {
            System.out.println("Array cheio");
        }
    }

    public boolean alterar(String responsavel, Reserva reserva) {
        for (int i = 0; i < count; i++) {
            if (reservas[i].getResponsavel().equals(responsavel)) {
                reservas[i] = reserva;
                return true;
            }
        }
        return false;
    }

    public void listar() {
        for (int i = 0; i < count; i++) {
            System.out.println(reservas[i].getResponsavel());
        }
    }

    public boolean excluir(String responsavel) {
        for (int i = 0; i < count; i++) {
            if (reservas[i].getResponsavel().equals(responsavel)) {
                for (int j = i; j < count - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
}
