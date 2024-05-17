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

import br.edu.up.views.ViewSeguradora;

public class Program {
    public static void main(String[] args) {
        
        
        ViewSeguradora view = new ViewSeguradora();
        view.iniciar();
       
    }
}