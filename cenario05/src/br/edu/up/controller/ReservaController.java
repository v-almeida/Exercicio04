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

    public void alterar(Reserva reserva) {
        for (int i = 0; i < count; i++) {
            if (reservas[i].getResponsavel().equals(reserva.getResponsavel())) {
                reservas[i] = reserva;
                break;
            }
        }
    }

    public void listar() {
        for (int i = 0; i < count; i++) {
            System.out.println(reservas[i].getResponsavel());
        }
    }

    public void excluir(Reserva reserva) {
        for (int i = 0; i < count; i++) {
            if (reservas[i].getResponsavel().equals(reserva.getResponsavel())) {
                for (int j = i; j < count - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                count--;
                break;
            }
        }
    }
}

