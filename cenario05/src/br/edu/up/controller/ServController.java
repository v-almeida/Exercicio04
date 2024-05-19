package br.edu.up.controller;

import br.edu.up.models.*;

public class ServController {

    private Serv[] servicos;
    private int lotacao;

    public ServController() {
        this.servicos = new Serv[10];  
        this.lotacao = 0;
    }
   public Serv[] getServicos(){
    return this.servicos;
   }
        public Serv getServico(String nome) {       
        for (Serv servico : this.servicos) {
        if (servico != null && servico.getNome().equals(nome)) {
        return servico;
            }
        }
        return null;
    }

        public void setEvento(String nome, String data, String local, int lotacaoMaxima, int qtdeIngressosVendidos, double precoIngresso) {
        if (lotacao < servicos.length) {          
            servicos[this.lotacao++] = new Evento(nome, data, local, lotacaoMaxima, qtdeIngressosVendidos, precoIngresso);
        } else {
            System.out.println("Quantidade máxima atingida.");
        }
    }
        public void setReserva(String nome, String data, String nomeResponsavel, double valor,  int qtdePessoas) {
        if (lotacao < servicos.length) { 
            this.lotacao++ ;          
            servicos[this.lotacao++] = new Reserva(nome, data, nomeResponsavel, valor, qtdePessoas);
        } else {
            System.out.println("Quantidade máxima atingida.");
        }
    }

        public boolean VerificarEvento(String nome) {
        for (int i = 0; i < lotacao; i++) {
            if (servicos[i] != null && servicos[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void excluirEvento(String nome) {
        for (int i = 0; i < lotacao; i++) {            
                servicos[i] = null;
                lotacao--;
                break;
            }
        }
    }

