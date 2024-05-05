package br.edu.up;

import java.util.*;

public class Agenda extends Compromisso{
    private HashMap<Integer, ArrayList<String>> compromissos;

    public Agenda() {
        compromissos = new HashMap<>();
    }

    public void adicionarCompromisso(String comp, int diaMes) {
        if(compromissos.containsKey(diaMes)) {
            compromissos.get(diaMes).add(comp);
        } else {
            ArrayList<String> lista = new ArrayList<>();
            lista.add(comp);
            compromissos.put(diaMes, lista);
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarCompromisso("Reunião com o cliente", 15);
        agenda.adicionarCompromisso("Consulta médica", 20);
        System.out.println(agenda.compromissos);
    }
}