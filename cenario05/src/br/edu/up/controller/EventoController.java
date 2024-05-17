package br.edu.up.controller;

import br.edu.up.models.Evento;

public class EventoController {
    private Evento[] eventos = new Evento[10];
    private int count = 0;

    public void incluir(Evento evento) {
        if (count < eventos.length) {
            eventos[count] = evento;
            count++;
        } else {
            System.out.println("Array cheio");
        }
    }

    public boolean alterar(String nome, Evento evento) {
        for (int i = 0; i < count; i++) {
            if (eventos[i].getNome().equals(nome)) {
                eventos[i] = evento;
                return true;
            }
        }
        return false;
    }

    public void listar() {
        for (int i = 0; i < count; i++) {
            System.out.println(eventos[i].getNome());
        }
    }

    public boolean excluir(String nome) {
        for (int i = 0; i < count; i++) {
            if (eventos[i].getNome().equals(nome)) {
                for (int j = i; j < count - 1; j++) {
                    eventos[j] = eventos[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
}