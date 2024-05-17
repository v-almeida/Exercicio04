package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.*;

public class SeguradoraMetController {

            private Seguradora seguradora;

            public SeguradoraMetController(String nome) {
            this.seguradora = new Seguradora(nome);
    }

            public void incluirSeguro(Seguro seguro) {
            this.seguradora.getSeguros().add(seguro);
    }

            public String[] localizarSeguro(String busca) {
            List<Seguro> seguros = this.seguradora.getSeguros();
            List<String> encontrados = new ArrayList<>();

            for (Seguro seguro : seguros) {
            if (seguro.toString().contains(busca)) {
                encontrados.add(seguro.toString());
            }
        }

            if (encontrados.isEmpty()) {
            return new String[] {"Nada encontrado"};
        }
            return encontrados.toArray(new String[0]);
    }

            public String excluirSeguro(String apolice) {
            List<Seguro> seguros = this.seguradora.getSeguros();
            for (int i = 0; i < seguros.size(); i++) {
            if (seguros.get(i).getApolice().equals(apolice)) {
                seguros.remove(i);
                return "Apólice retirada: " + apolice;
            }
        }
            return "Não foi encontrado";
    }

            public List<Seguro> listarSeguros() {
            return new ArrayList<>(this.seguradora.getSeguros());
    }

            public int quantidadeSeguros() {
            return this.seguradora.getSeguros().size();
    }

            public void excluirTodosSeguros() {
            this.seguradora.getSeguros().clear();
    }
}
