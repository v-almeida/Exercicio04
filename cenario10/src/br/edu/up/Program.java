/*Desenvolva um software utilizando o padrão arquitetura Model-View-Controller (MVC) e
implemente o digrama de classes considerando os seguintes tópicos:
 Deve ser criado um projeto separado para a implementação;
 As classes SeguroVida e SeguroVeiculo herdam da classe Seguro (abstrata);
 As classes devem possuir os getters e setters para seus atributos assim como os demais
métodos, respeitando as assinaturas (quando estiver completa);
 Podem ser implementados métodos e atributos para as classes além dos especificados no
diagrama;
 Quando o usuário informar o número da apólice, o sistema deve verificar se ele já não foi
inserido, avisando o usuário imediatamente, evitando que sejam digitados todos os dados;
 Deverá ser implementado um método excluirTodosSeguros que deve pedir confirmação antes
de excluir todos os seguros do vetor;
 Um outro método quantidadeSeguros deve retornar quantos seguros estão inseridos;
 O menu apresentado ao usuário deve conter os seguintes itens (encerrar o programa ao Sair):
1. Incluir seguro
2. Localizar seguro
3. Excluir seguro
4. Excluir todos os seguros
5. Listar todos os seguros
6. Ver quantidade de seguros
7. Sair */

package br.edu.up;

import java.time.LocalDate;
import br.edu.up.models.Segurado;
import br.edu.up.models.Seguro;
import br.edu.up.models.SeguroVeiculo;
import br.edu.up.models.SeguroVida;

public class Program {
    public static void main(String[] args) {
        // Instanciando a classe Segurado
        Segurado segurado = new Segurado();
        segurado.setNome("João");
        segurado.setRG("123456789");
        segurado.setCPF("111.222.333-44");
        segurado.setSexo(Segurado.Sexo.MASCULINO);
        segurado.setTelefone("(41) 1234-5678");
        segurado.setEndereco("Rua das Flores, 123");
        segurado.setCEP("80000-000");
        segurado.setCidade("Curitiba");

        // Instanciando a classe Seguro
        Seguro seguro = new Seguro();
        seguro.setApolice("123456");
        seguro.setSegurado(segurado);
        seguro.setVirApolice(1000.0);
        seguro.setDtaInicio(LocalDate.now());
        seguro.setDtaFim(LocalDate.now().plusYears(1));

        // Instanciando a classe SeguroVeiculo
        SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
        seguroVeiculo.setFranquia(500.0);
        seguroVeiculo.setTemCarroReserva(true);
        seguroVeiculo.setCobreVidros(true);

        // Instanciando a classe SeguroVida
        SeguroVida seguroVida = new SeguroVida();
        seguroVida.setCobreDoenca(true);
        seguroVida.setCobreAcidente(false);

        // Imprimindo os detalhes
        System.out.println(segurado.toString());
        System.out.println(seguro.getDados());
        System.out.println("Franquia: " + seguroVeiculo.getFranquia());
        System.out.println("Tem carro reserva: " + seguroVeiculo.getTemCarroReserva());
        System.out.println("Cobre vidros: " + seguroVeiculo.getCobreVidros());
        System.out.println(seguroVida.getDados());
    }
}
