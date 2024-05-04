/*Cenário 1: Crie uma classe que represente um Livro de uma biblioteca. Em outra classe 
(Programa), instancie os seguintes livros e apresente seus dados na tela. (Não precisa usar 
Model-View-Controller MVC) */

package br.edu.up;

public class Program {
    public static void main(String[] args) {

        System.out.println("\nLIVRO 1");

        Livro livro1 = new Livro("1598FHK", "A Guerra dos Tronos: As Crônicas de Gelo e Fogo, volume 1",
                "George R. R. Martin", "13,978-8544102923", 2011);

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autores: " + livro1.getAutores());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano de publicação: " + livro1.getAno());

        System.out.println("\nLIVRO 2");

        Livro livro2 = new Livro("9786555321456", "Jogos Vorazes. Em Chamas", "Suzanne Collins", "8579272998", 2013);

        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autores: " + livro2.getAutores());
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano de publicação: " + livro2.getAno());

        System.out.println("\n");
    }
}
