public class Circulo extends Figura{
    private int raio;
    private Ponto centro;

    public Circulo(Ponto centro,int raio) throws IllegalArgumentException{
        if(raio<0) throw  new IllegalArgumentException();
        this.raio = raio;
        this.centro = centro;
    }

    public int getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double getArea() {
        return Math.PI*raio*raio;
    }
}
