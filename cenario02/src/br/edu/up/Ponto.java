/*Cenário 2: Crie uma classe que represente um Ponto no espaço bidimensional. Na classe 
Programa efetue as operações listadas abaixo. Para realização dos cálculos de elevação ao 
quadrado utilizar Math.pow(valor, 2) e para extração da raiz quadrada utilizar Math.sqrt(valor).
(Não precisa usar Model-View-Controller MVC)  */

package br.edu.up;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculoDistancia(Ponto outroPonto) {
        double deltaX = outroPonto.getX() - x;
        double deltaY = outroPonto.getY() - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public Ponto calculoPontoMedio(Ponto outroPonto) {
        double pontinhoX = (x + outroPonto.getX()) / 2;
        double pontinhoY = (y + outroPonto.getY()) / 2;
        return new Ponto(pontinhoX, pontinhoY);
    }

    public void setX(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setX'");
    }
    public void setY(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setX'");
    }

}
