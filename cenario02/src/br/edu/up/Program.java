package br.edu.up;

public class Program {
    public static void main(String[] args){

        System.out.println();
        
        Ponto ponto1 = new Ponto(0, 0);
        Ponto ponto2 = new Ponto(2, 5);

        System.out.println("Distância do ponto1 ao ponto2: " + ponto1.calculoDistancia(ponto2));

        Ponto ponto3 = new Ponto(7, 2);
        System.out.println("Distância do ponto2 ao ponto3: " + ponto2.calculoDistancia(ponto3));

        ponto1.setX(10);
        ponto1.setY(3);

    }
}
